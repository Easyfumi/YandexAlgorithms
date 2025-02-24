package ru.marinin.training_60.lesson_2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Queue<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            deque.add(scanner.nextInt());
        }

    }

    public static Integer getCount(Queue<Integer> deque, int n, int k) {


        return 0;
    }
}
