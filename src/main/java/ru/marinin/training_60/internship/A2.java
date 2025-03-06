package ru.marinin.training_60.internship;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // кол-во этажей
        int m = scanner.nextInt(); // кол-во квартир
        int x = scanner.nextInt(); // окна в высоту
        int y = scanner.nextInt(); // окна в ширину
        scanner.nextLine();

        String st = "";

        for (int i = 0; i < n * x; i++) {
            st += scanner.nextLine();
        }

        st = st.replaceAll("0", "");

        if (n * m == 0) {
            System.out.println(0);
            return;
        }

        System.out.println(Math.round((double) st.length() / (x * y)));
    }
}
