package ru.marinin.training_60.internship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // кол-во этажей
        int m = scanner.nextInt(); // кол-во квартир
        int x = scanner.nextInt(); // окна в высоту
        int y = scanner.nextInt(); // окна в ширину
        scanner.nextLine();


        List<String> list = new ArrayList<>();

        for (int i = 0; i < n * x; i++) {
            list.add(scanner.nextLine());

        }


        int countW = x * y;
        int countRez = 0;
        for (int i = 0; i < n * x; i += x) {
            for (int j = 0; j < m * y; j += y) {

                int countX = 0;

                for (int ic = i; ic < i + x; ic++) {
                        countX += list.get(ic).substring(j, j + y).replaceAll("0", "").length();
                }
                if ((double) countX / countW >= 0.5) countRez++;
            }
        }
        System.out.println(countRez);
    }
}


//        String[][] a = new String[n*x][m*y];

//        for (int i = 0; i < n*x; i++) {
//            a[i] = list.get(i).split("");
//        }

//        for (int i = 0; i < n*x; i++) {
//            System.out.println(Arrays.asList(a[i]));
//        }