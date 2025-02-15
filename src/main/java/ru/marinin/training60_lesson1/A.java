package ru.marinin.training60_lesson1;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(findNearest(x1, y1, x2, y2, x, y));
    }

    public static String findNearest(int x1, int y1, int x2, int y2, int x, int y) {

        String ans = "";

        if (y > y2) ans += "N";
        if (y < y1) ans += "S";
        if (x < x1) ans += "W";
        if (x > x2) ans += "E";

        return ans;
    }
}
