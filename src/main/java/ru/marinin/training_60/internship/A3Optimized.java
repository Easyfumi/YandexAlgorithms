package ru.marinin.training_60.internship;

import java.util.Scanner;

public class A3Optimized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.nextLine();

        int rows = n * x;
        int cols = m * y;
        char[][] matrix = new char[rows][];

        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }

        int[][] rowPrefix = new int[rows][cols + 1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rowPrefix[i][j + 1] = rowPrefix[i][j] + (matrix[i][j] == 'X' ? 1 : 0);
            }
        }

        int countRez = 0;
        final int windowSize = x * y;

        for (int i = 0; i < rows; i += x) {
            for (int j = 0; j < cols; j += y) {
                int total = 0;
                for (int row = i; row < i + x; row++) {
                    total += rowPrefix[row][j + y] - rowPrefix[row][j];
                }
                if (total * 2 >= windowSize) {
                    countRez++;
                }
            }
        }

        System.out.println(countRez);
    }
}