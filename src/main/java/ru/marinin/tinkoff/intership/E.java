package ru.marinin.tinkoff.intership;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long s = scanner.nextLong();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        long total = 0;
        for (int l = 0; l < n; l++) {
            int r = l;
            long currentSum = 0;
            int parts = 0;
            while (r < n) {
                if (currentSum + a[r] > s) {
                    parts++;
                    currentSum = a[r];
                } else {
                    currentSum += a[r];
                }
                r++;
                total += parts + 1;
            }
        }

        System.out.println(total);

        scanner.close();
    }
}
