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
        int[] floors = new int[]{1, 4, 9, 16, 25};
        int m = 2;
        Assertions.assertEquals(C.getMinSteps(n, t, floors, m), 24);
    }

    @Test
    @DisplayName("default test2 from contest")
    void test2() {
        int n = 6;
        int t = 4;
        int[] floors = new int[]{1, 2, 3, 6, 8, 25};
        int m = 5;
        Assertions.assertEquals(C.getMinSteps(n, t, floors, m), 31);
    }

    @Test
    @DisplayName("2 elem test")
    void test3() {
        int n = 2;
        int t = 1;
        int[] floors = new int[]{1, 10};
        int m = 2;
        Assertions.assertEquals(C.getMinSteps(n, t, floors, m), 9);
    }

    @Test
    @DisplayName("max m test")
    void test4() {
        int n = 6;
        int t = 2;
        int[] floors = new int[]{1, 2, 3, 6, 8, 25};
        int m = 6;
        Assertions.assertEquals(C.getMinSteps(n, t, floors, m), 24);
    }

    @Test
    @DisplayName("min m test")
    void test5() {
        int n = 6;
        int t = 2;
        int[] floors = new int[]{1, 2, 3, 6, 8, 25};
        int m = 1;
        Assertions.assertEquals(C.getMinSteps(n, t, floors, m), 24);
    }

    @Test
    @DisplayName("m mediana min-max")
    void test6() {
        int n = 5;
        int t = 2;
        int[] floors = new int[]{1, 4, 7, 10, 13};
        int m = 3;
        Assertions.assertEquals(C.getMinSteps(n, t, floors, m), 18);
    }

    @Test
    @DisplayName("t = m")
    void test7() {
        int n = 5;
        int t = 7;
        int[] floors = new int[]{1, 4, 7, 10, 13};
        int m = 3;
        Assertions.assertEquals(C.getMinSteps(n, t, floors, m), 12);
    }

    @Test
    @DisplayName("t = m-min")
    void test8() {
        int n = 5;
        int t = 6;
        int[] floors = new int[]{1, 4, 7, 10, 13};
        int m = 3;
        Assertions.assertEquals(C.getMinSteps(n, t, floors, m), 18);
    }

    @Test
    @DisplayName("t < m-min")
    void test9() {
        int n = 5;
        int t = 6;
        int[] floors = new int[]{3, 4, 7, 10, 13};
        int m = 3;
        Assertions.assertEquals(C.getMinSteps(n, t, floors, m), 10);
    }

    @Test
    @DisplayName("t < max-m")
    void test10() {
        int n = 5;
        int t = 3;
        int[] floors = new int[]{3, 4, 7, 12, 13};
        int m = 4;
        Assertions.assertEquals(C.getMinSteps(n, t, floors, m), 10);
    }


}
