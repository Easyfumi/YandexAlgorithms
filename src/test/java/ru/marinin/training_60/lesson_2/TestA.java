package ru.marinin.training_60.lesson_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TestA {
    @Test
    @DisplayName("default test from contest")
    void test1() {
        int n = 5;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(-4);
        queue.add(5);
        queue.add(0);
        queue.add(2);

        Assertions.assertEquals(A.getPrefixSum(queue, n), "10 6 11 11 13");
    }

    @Test
    @DisplayName("one element")
    void test2() {
        int n = 1;
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(1);

        Assertions.assertEquals(A.getPrefixSum(queue, n), "1");
    }

    @Test
    @DisplayName("all zero")
    void test3() {
        int n = 5;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        queue.add(0);
        queue.add(0);
        queue.add(0);
        queue.add(0);

        Assertions.assertEquals(A.getPrefixSum(queue, n), "0 0 0 0 0");
    }


}
