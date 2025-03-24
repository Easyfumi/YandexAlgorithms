package ru.marinin.tinkoff.intership;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // кол-во дней
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            double a = scanner.nextDouble(); // кол-во денег на iый день
            scanner.nextLine();

            int x = (int) (Math.log10(a) / Math.log10(2.0));
            a -= Math.pow(2, x);

            int y = (int) (Math.log10(a) / Math.log10(2.0));
            a -= Math.pow(2, y);

            int z = (int) (Math.log10(a) / Math.log10(2.0));


            if (x>-1 && y>-1 && z>-1) {
                System.out.println((int) (Math.pow(2, x) + Math.pow(2, y) + Math.pow(2, z)));
            } else {
                System.out.println(-1);
            }
        }
    }
}