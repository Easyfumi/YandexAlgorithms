package ru.marinin.training_60.lesson_2;

import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        Queue<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            deque.add(scanner.nextInt());
        }

        System.out.println(getCount(deque, n, k));

    }

    public static Integer getCount(Queue<Integer> deque, int n, int k) {

        List<Integer> list = new ArrayList<>();
        list.add(0);
        while (!deque.isEmpty()) {
            list.add(list.getLast() + deque.poll());
        }

        int left = 0;
        int right = 1;
        int count = 0;

        while (right < n + 1) {
            int sum = list.get(right) - list.get(left);
            if (sum < k) {
                right++;
            } else if (sum == k) {
                count++;
                left++;
            } else {
                left++;
            }
        }

        return count;
    }
}
