package ru.marinin.training_60.internship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // кол-во этажей
        int m = scanner.nextInt(); // кол-во квартир
        int x = scanner.nextInt(); // окна в высоту
        int y = scanner.nextInt(); // окна в ширину
        scanner.nextLine();

        String[][] a = new String[n * x][m * y];

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n * x; i++) {
            list.add(scanner.nextLine());

        }

        for (int i = 0; i < n * x; i++) {
            a[i] = list.get(i).split("");
        }

        int windowsInOneFlat = x * y;

        int countRez = 0;

        int rez = 0;

        for (int i = 0; i < n * x; i += x) {
            for (int j = 0; j < m * y; j += y) {

                int countX = x * y;

                for (int ic = i; ic < i + x; ic++) {

                    if (countX < 0.5 * windowsInOneFlat) {
                        countRez++;
                        return;
                    }

                    if (list.get(ic).contains("X")) {
                        for (int jc = j; jc < j + y; jc++) {
                            if (a[ic][jc].equals("0")) {
                                countX--;
                            }
                        }
                    } else {
                        countX -= y;
                    }

                }

                if (countX >= 0.5 * windowsInOneFlat) countRez++;
            }
        }
        System.out.println(countRez);

    }
}
