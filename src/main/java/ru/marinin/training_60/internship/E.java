package ru.marinin.training_60.internship;

import java.util.List;
import java.util.Scanner;

import java.util.*;
import java.io.*;

public class E {

    static Map<Character, String> letterToCode = new HashMap<>();

    static {
        String[][] groups = {
                {"2", "A", "B", "C"},
                {"3", "D", "E", "F"},
                {"4", "G", "H", "I"},
                {"5", "J", "K", "L"},
                {"6", "M", "N", "O"},
                {"7", "P", "Q", "R", "S"},
                {"8", "T", "U", "V"},
                {"9", "W", "X", "Y", "Z"}
        };

        for (String[] group : groups) {
            String digit = group[0];
            for (int i = 1; i < group.length; i++) {
                String letter = group[i];
                int count = i;
                StringBuilder code = new StringBuilder();
                for (int j = 0; j < count; j++) {
                    code.append(digit);
                }
                letterToCode.put(letter.charAt(0), code.toString());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        List<String> dictionary = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dictionary.add(reader.readLine().trim());
        }

//        System.out.println(letterToCode);

        Map<String, List<String>> codeToWords = new HashMap<>();
        Map<Integer, Set<String>> codeLengthMap = new HashMap<>();

        for (String word : dictionary) {
            StringBuilder code = new StringBuilder();
            for (char c : word.toCharArray()) {
                code.append(letterToCode.get(c));
            }
            String codeStr = code.toString();
            codeToWords.computeIfAbsent(codeStr, k -> new ArrayList<>()).add(word);
            int len = codeStr.length();
            codeLengthMap.computeIfAbsent(len, k -> new HashSet<>()).add(codeStr);
        }

        int lenS = s.length();
        PrevInfo[] prev = new PrevInfo[lenS + 1];
        prev[0] = new PrevInfo(-1, null);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        while (!queue.isEmpty()) {
            int pos = queue.poll();

            if (pos == lenS) {
                break;
            }

            for (int l : codeLengthMap.keySet()) {
                int nextPos = pos + l;
                if (nextPos > lenS) {
                    continue;
                }

                String sub = s.substring(pos, nextPos);
                if (codeLengthMap.get(l).contains(sub)) {
                    List<String> words = codeToWords.get(sub);
                    if (words == null || words.isEmpty()) {
                        continue;
                    }
                    String word = words.get(0);
                    if (prev[nextPos] == null) {
                        prev[nextPos] = new PrevInfo(pos, word);
                        queue.add(nextPos);
                        if (nextPos == lenS) {
                            queue.clear();
                            break;
                        }
                    }
                }
            }
        }

        List<String> result = new ArrayList<>();
        int current = lenS;
        while (current != 0) {
            PrevInfo info = prev[current];
            result.add(info.word);
            current = info.prevPos;
        }
        Collections.reverse(result);

        System.out.println(String.join(" ", result));
    }

    static class PrevInfo {
        int prevPos;
        String word;

        PrevInfo(int prevPos, String word) {
            this.prevPos = prevPos;
            this.word = word;
        }
    }
}





/*
443355555566696667775553
3
WORLD
QUANTUM
HELLO


7788266888674499977774442227777
5
PHYSICS
QUANTUM
WORLD
HELLO
PHYS
 */