package ru.marinin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.marinin.training60_lesson1.B;

public class TestB {
    @Test
    @DisplayName("OK")
    void okTest() {
        int TBlue = 6;
        int TRed = 2;
        int SBlue = 7;
        int SRed = 3;

        Assertions.assertEquals(B.findMin(TBlue, TRed, SBlue, SRed), "3 4");
    }

    @Test
    @DisplayName("one zero elem")
    void zeroTest() {
        int TBlue = 6;
        int TRed = 0;
        int SBlue = 7;
        int SRed = 3;

        Assertions.assertEquals(B.findMin(TBlue, TRed, SBlue, SRed), "1 4");
    }

    @Test
    @DisplayName("two zero elem")
    void twoZeroTest() {
        int TBlue = 6;
        int TRed = 0;
        int SBlue = 7;
        int SRed = 0;

        Assertions.assertEquals(B.findMin(TBlue, TRed, SBlue, SRed), "1 1");
    }

    @Test
    @DisplayName("dif max elem")
    void difMaxTest() {
        int TBlue = 6;
        int TRed = 1;
        int SBlue = 1;
        int SRed = 6;

        Assertions.assertEquals(B.findMin(TBlue, TRed, SBlue, SRed), "1 7");
    }

    @Test
    @DisplayName("dif max 2 elem")
    void difMax2Test() {
        int TBlue = 1;
        int TRed = 6;
        int SBlue = 6;
        int SRed = 1;

        Assertions.assertEquals(B.findMin(TBlue, TRed, SBlue, SRed), "1 7");
    }

    @Test
    @DisplayName("one zero dif max elem")
    void zeroDifMaxTest() {
        int TBlue = 6;
        int TRed = 0;
        int SBlue = 3;
        int SRed = 7;

        Assertions.assertEquals(B.findMin(TBlue, TRed, SBlue, SRed), "1 8");
    }

    @Test
    @DisplayName("one zero dif max 2 elem")
    void zeroDifMax2Test() {
        int TBlue = 3;
        int TRed = 5;
        int SBlue = 6;
        int SRed = 0;

        Assertions.assertEquals(B.findMin(TBlue, TRed, SBlue, SRed), "6 1");
    }

    @Test
    @DisplayName("0 1 0 1 elem")
    void zerooneTest() {
        int TBlue = 0;
        int TRed = 1;
        int SBlue = 0;
        int SRed = 1;

        Assertions.assertEquals(B.findMin(TBlue, TRed, SBlue, SRed), "1 1");
    }

    @Test
    @DisplayName("1 0 1 0 elem")
    void onezeroTest() {
        int TBlue = 1;
        int TRed = 0;
        int SBlue = 1;
        int SRed = 0;

        Assertions.assertEquals(B.findMin(TBlue, TRed, SBlue, SRed), "1 1");
    }

    @Test
    @DisplayName("1 1 1 1 elem")
    void oneoneTest() {
        int TBlue = 1;
        int TRed = 1;
        int SBlue = 1;
        int SRed = 1;

        Assertions.assertEquals(B.findMin(TBlue, TRed, SBlue, SRed), "1 2");
    }

    @Test
    @DisplayName("1 1 1 0 elem")
    void oneoneonezeroTest() {
        int TBlue = 1;
        int TRed = 1;
        int SBlue = 1;
        int SRed = 0;

        Assertions.assertEquals(B.findMin(TBlue, TRed, SBlue, SRed), "2 1");
    }

    @Test
    @DisplayName("1 0 1 1 elem")
    void onezerooneoneTest() {
        int TBlue = 1;
        int TRed = 0;
        int SBlue = 1;
        int SRed = 1;

        Assertions.assertEquals(B.findMin(TBlue, TRed, SBlue, SRed), "1 2");
    }

    @Test
    @DisplayName("1 0 1 5 elem")
    void onezeroonefiveTest() {
        int TBlue = 1;
        int TRed = 0;
        int SBlue = 1;
        int SRed = 5;

        Assertions.assertEquals(B.findMin(TBlue, TRed, SBlue, SRed), "1 6");
    }

    @Test
    @DisplayName("1 5 1 0 elem")
    void onefiveonezeroTest() {
        int TBlue = 1;
        int TRed = 5;
        int SBlue = 1;
        int SRed = 0;

        Assertions.assertEquals(B.findMin(TBlue, TRed, SBlue, SRed), "6 1");
    }
}
