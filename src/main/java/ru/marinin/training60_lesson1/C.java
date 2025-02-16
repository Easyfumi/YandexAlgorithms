package ru.marinin.training60_lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[][] strings = new String[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("");
            System.arraycopy(line, 0, strings[i], 0, n);
        }

        getSmallMatrix(n, strings);


    }

    public static String[][] getSmallMatrix(int n, String[][] strings) {
        removeLines(n, strings);

        return strings;
    }

    public static String[][] removeLines(int n, String[][] strings) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = "";
            for (int j = 0; j < n; j++) {
                line += strings[i][j];
            }
            if (line.indexOf("#") > 0 && (list.isEmpty() || !list.getLast().equals(line))) {
                list.add(line);
            }
        }
        if (list.isEmpty()) {
            return new String[0][0];
        } else {
            return new String[list.size()][list.getFirst().length()];
        }
    }

    public static String[][] removeColumns(int n, String[][] strings) {
        return new String[0][0];
    }


}
