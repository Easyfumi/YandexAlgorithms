package ru.marinin.training_60.lesson_2;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            queue.add(scanner.nextInt());
        }
        System.out.println(getPrefixSum(queue, n));
    }

    public static String getPrefixSum(Queue<Integer> queue, int n) {
        String res = "";

        List<Integer> list = new ArrayList<>();
        list.add(0);
        while (!queue.isEmpty()) {
                list.add(list.getLast()+queue.poll());
        }

        for (int i = 1; i < n + 1; i++) {
            res+=list.get(i) + " ";
        }

        return res.trim();
    }

}
