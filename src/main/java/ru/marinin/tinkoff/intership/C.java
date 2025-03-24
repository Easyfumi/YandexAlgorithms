package ru.marinin.tinkoff.intership;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        int[] days = new int[n];
        int[] adjustments = new int[n-2];

        for (int i = 0; i < n; i++) {
            days[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (days[i] < days[i-2]) {
                adjustments[i-2] = days[i-2] - days[i];
                days[i] = days[i-2];
            } else if (days[i] > days[i-1]) {
                adjustments[i-2] = days[i] - days[i - 1];
                days[i] = days[i - 1];
            }
        }

        Arrays.sort(adjustments);

        for (int i = 0; i < m; i++) {
            count+=adjustments[i];
        }

        System.out.println(count);
    }
}
