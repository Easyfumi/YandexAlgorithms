package ru.marinin;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.marinin.training60_lesson1.A;

public class TestA {

    @Test
    @DisplayName("NW")
    void testNW() {
        int x1 = -1;
        int y1 = -2;
        int x2 = 5;
        int y2 = 3;
        int x = -4;
        int y = 6;
        Assertions.assertEquals(A.findNearest(x1, y1, x2, y2, x, y), "NW");
    }

    @Test
    @DisplayName("N")
    void testN() {
        int x1 = -1;
        int y1 = -2;
        int x2 = 5;
        int y2 = 3;
        int x = -1;
        int y = 6;
        Assertions.assertEquals(A.findNearest(x1, y1, x2, y2, x, y), "N");
    }

    @Test
    @DisplayName("NE")
    void testNE() {
        int x1 = -1;
        int y1 = -2;
        int x2 = 5;
        int y2 = 3;
        int x = 8;
        int y = 6;
        Assertions.assertEquals(A.findNearest(x1, y1, x2, y2, x, y), "NE");
    }

    @Test
    @DisplayName("E")
    void testE() {
        int x1 = -1;
        int y1 = -2;
        int x2 = 5;
        int y2 = 3;
        int x = 8;
        int y = 2;
        Assertions.assertEquals(A.findNearest(x1, y1, x2, y2, x, y), "E");
    }

    @Test
    @DisplayName("SE")
    void testSE() {
        int x1 = -1;
        int y1 = -2;
        int x2 = 5;
        int y2 = 3;
        int x = 8;
        int y = -6;
        Assertions.assertEquals(A.findNearest(x1, y1, x2, y2, x, y), "SE");
    }

    @Test
    @DisplayName("S")
    void testS() {
        int x1 = -1;
        int y1 = -2;
        int x2 = 5;
        int y2 = 3;
        int x = 2;
        int y = -6;
        Assertions.assertEquals(A.findNearest(x1, y1, x2, y2, x, y), "S");
    }

    @Test
    @DisplayName("SW")
    void testSW() {
        int x1 = -1;
        int y1 = -2;
        int x2 = 5;
        int y2 = 3;
        int x = -5;
        int y = -6;
        Assertions.assertEquals(A.findNearest(x1, y1, x2, y2, x, y), "SW");
    }

    @Test
    @DisplayName("W")
    void testW() {
        int x1 = -1;
        int y1 = -2;
        int x2 = 5;
        int y2 = 3;
        int x = -6;
        int y = 0;
        Assertions.assertEquals(A.findNearest(x1, y1, x2, y2, x, y), "W");
    }


}
