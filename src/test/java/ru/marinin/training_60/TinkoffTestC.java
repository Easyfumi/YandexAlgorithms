package ru.marinin.training_60;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.marinin.tinkoff.C;

public class TinkoffTestC {
    @Test
    @DisplayName("default test from contest")
    void test1() {
        int n = 5;
        int t = 5;
        int[] floors = new int[]{1,4,9,16,25};
        int m = 2;
        Assertions.assertEquals(C.getMinSteps(n,t,floors,m), 24);
    }

    @Test
    @DisplayName("default test2 from contest")
    void test2() {
        int n = 6;
        int t = 4;
        int[] floors = new int[]{1,2,3,6,8,25};
        int m = 5;
        Assertions.assertEquals(C.getMinSteps(n,t,floors,m), 31);
    }

    @Test
    @DisplayName("1 elem test")
    void test3() {
        int n = 1;
        int t = 1;
        int[] floors = new int[]{5};
        int m = 1;
        Assertions.assertEquals(C.getMinSteps(n,t,floors,m), 0);
    }


}
