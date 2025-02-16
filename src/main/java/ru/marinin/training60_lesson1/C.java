package ru.marinin.training60_lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextLine());
        }
        List<String> copyOfOriginalList = new ArrayList<>(list);
        System.out.println(start(n, list, copyOfOriginalList));
    }

    public static String start(int n, List<String> list, List<String> copyOfOriginalList)  {
        list = getSmallMatrix(n, list);
        return getAnswer(list, copyOfOriginalList);
    }

    public static boolean checkI(List<String> list) {
        int countLines = 0;
        int countSharpInLine = 0;
        for (int i = 0; i < list.size(); i++) {
            if (countSharpInLine==0 && list.get(i).contains("#")) {
                String[] strings = list.get(i).split("");
                for (String elem : strings) {
                    if (elem.equals("#")) countSharpInLine++;
                }
                countLines++;
            } else if (list.get(i).contains("#")) countLines++;
        }
        return countLines >= countSharpInLine;
    }

    public static String getAnswer(List<String> list, List<String> copyOfOriginalList) {
        List<String> resList = new ArrayList<>();

        resList.add("#");
        if (list.equals(resList) && checkI(copyOfOriginalList)) return "I";

        resList.clear();
        resList.add("###");
        resList.add("#.#");
        resList.add("###");
        if (list.equals(resList)) return "O";

        resList.clear();
        resList.add("##");
        resList.add("#.");
        resList.add("##");
        if (list.equals(resList)) return "C";

        resList.clear();
        resList.add("#.");
        resList.add("##");
        if (list.equals(resList)) return "L";

        resList.clear();
        resList.add("#.#");
        resList.add("###");
        resList.add("#.#");
        if (list.equals(resList)) return "H";

        resList.clear();
        resList.add("###");
        resList.add("#.#");
        resList.add("###");
        resList.add("#..");
        if (list.equals(resList)) return "P";

        return "X";
    }

    public static List<String> getSmallMatrix(int n, List<String> list) {
        list = removeLines(n, list);
        list = ternLeft(list);
        list = removeLines(list.size(), list);
        list = ternLeft(list);
        list = ternLeft(list);
        list = ternLeft(list);
        return list;
    }

    public static List<String> removeLines(int n, List<String> list) {
        List<String> newList = new ArrayList<>();

        if (list.isEmpty()) {
            return newList;
        } else {
            for (int i = 0; i < n; i++) {
                if (list.get(i).contains("#") && (newList.isEmpty() || !newList.getLast().equals(list.get(i)))) {
                    newList.add(list.get(i));
                }
            }
        }
        return newList;
    }

    public static List<String> ternLeft(List<String> list) {

        if (list.size() == 0) return list;

        String[][] matrix = new String[list.size()][list.getFirst().length()];

        for (int i = 0; i < list.size(); i++) {
            String[] line = list.get(i).split("");
            for (int j = 0; j < list.getFirst().length(); j++) {
                matrix[i][j] = line[j];
            }
        }

        int n = matrix.length, m = matrix[0].length;

        String[][] matrix_transpose = new String[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix_transpose[j][i] = matrix[i][j];
            }
        }

        List<String> turnedList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String str = "";
            for (int j = 0; j < n; j++) {
                str += matrix_transpose[i][j];
            }
            turnedList.add(str);
        }

        return turnedList;
    }
}
