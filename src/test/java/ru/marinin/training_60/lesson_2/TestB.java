package ru.marinin.training_60.lesson_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestB {

    @Test
    @DisplayName("default test 1")
    void test1() {

        int n = 5;
        int k = 17;

        Queue<Integer> deque = new ArrayDeque<>();
        deque.add(17);
        deque.add(7);
        deque.add(10);
        deque.add(7);
        deque.add(10);

        Assertions.assertEquals(B.getCount(deque,n,k), 4);
    }

    @Test
    @DisplayName("default test 2")
    void test2() {

        int n = 5;
        int k = 10;

        Queue<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(1);

        Assertions.assertEquals(B.getCount(deque,n,k), 2);

    }

    @Test
    @DisplayName("one NO elem test")
    void test3() {

        int n = 1;
        int k = 10;

        Queue<Integer> deque = new ArrayDeque<>();
        deque.add(9);

        Assertions.assertEquals(B.getCount(deque,n,k), 0);

    }

    @Test
    @DisplayName("one YES elem test")
    void test4() {

        int n = 1;
        int k = 10;

        Queue<Integer> deque = new ArrayDeque<>();
        deque.add(10);

        Assertions.assertEquals(B.getCount(deque,n,k), 1);

    }

}
