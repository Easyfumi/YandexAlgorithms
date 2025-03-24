package ru.marinin.tinkoff.intership;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String res = s.indexOf('R') < s.indexOf('M') ? "Yes" : "No";
        System.out.println(res);
    }
}

