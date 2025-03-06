package ru.marinin.tinkoff;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while (n>1) {
            n=(int) Math.ceil((n)/2.0);
            count++;
        }
        System.out.println(count);
    }
}
