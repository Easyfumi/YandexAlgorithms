package ru.marinin.tinkoff;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // кол-во договоров
        int t = scanner.nextInt();  // время уходящего
        scanner.nextLine();
        int[] floors = new int[n]; // массив этажей
        for (int i = 0; i < n; i++) {
            floors[i] = scanner.nextInt();
        }
        scanner.nextLine();
        int m = scanner.nextInt();
        System.out.println(getMinSteps(n,t,floors,m));
    }

    public static int getMinSteps(int n, int t, int[] floors, int m) {
        m--;
        if (floors[m] - floors[0] <= t) return floors[n - 1] - floors[0];
        if (floors[n - 1] - floors[m] <= t) return floors[n - 1] - floors[0];
        int step1;
        int step2 = floors[n - 1] - floors[0];
        step1 = Math.min(floors[n - 1] - floors[m], floors[m] - floors[0]);
        return step1 + step2;

    }
}
