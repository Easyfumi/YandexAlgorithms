package ru.marinin.tinkoff;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (b < d) {
            int extra = (d-b)*c;
            a+=extra;
        }

        System.out.println(a);
    }
}
