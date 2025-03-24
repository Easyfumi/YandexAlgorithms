package ru.marinin.tinkoff.intership;

import java.util.Arrays;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int[] xyz = new int[]{x, y, z};
        Arrays.sort(xyz);

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int count = 0;

        for (int j = 0; j < 3; j++) {

            int num = xyz[j];
            int difMin = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < n; i++) {

                int remainder = a[i] % num;

                if (remainder == 0) {
                    difMin = 0;
                    index = i;
                    break;
                }

                int dif = num - (a[i] % num);
                if (dif < difMin) {
                    difMin = dif;
                    index = i;

                }
            }

            count += difMin;
            a[index] += difMin;

        }

        System.out.println(count);

    }
}
