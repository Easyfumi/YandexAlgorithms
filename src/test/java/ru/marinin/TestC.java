package ru.marinin;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.marinin.training60_lesson1.C;

import java.util.ArrayList;
import java.util.List;

public class TestC {

    @Test
    @DisplayName("remove lines test 0 empty")
    void removeLinesTest0() {
        List<String> list = new ArrayList<>();

        int n = list.size();

        List<String> resList = new ArrayList<>();

        Assertions.assertEquals(C.removeLines(n, list), resList);
    }

    @Test
    @DisplayName("remove lines test 1 I")
    void removeLinesTest1() {
        List<String> list = new ArrayList<>();
        list.add(".##.");
        list.add(".##.");
        list.add(".##.");
        list.add("....");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add(".##.");
        resList.add("....");

        Assertions.assertEquals(C.removeLines(n, list), resList);
    }



    @Test
    @DisplayName("remove lines test 2 O")
    void removeLinesTest2() {
        List<String> list = new ArrayList<>();
        list.add("....");
        list.add(".##.");
        list.add(".##.");
        list.add("....");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("....");
        resList.add(".##.");
        resList.add("....");

        Assertions.assertEquals(C.removeLines(n, list), resList);
    }

    @Test
    @DisplayName("remove lines test 3 C")
    void removeLinesTest3() {
        List<String> list = new ArrayList<>();
        list.add("......");
        list.add("......");
        list.add("...###");
        list.add("...###");
        list.add("......");
        list.add("......");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("......");
        resList.add("...###");
        resList.add("......");

        Assertions.assertEquals(C.removeLines(n, list), resList);
    }

    @Test
    @DisplayName("remove lines test 4 P")
    void removeLinesTest4() {
        List<String> list = new ArrayList<>();
        list.add("......");
        list.add("..##..");
        list.add("..##..");
        list.add("......");
        list.add("..####");
        list.add("..####");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("......");
        resList.add("..##..");
        resList.add("......");
        resList.add("..####");

        Assertions.assertEquals(C.removeLines(n, list), resList);
    }

    @Test
    @DisplayName("remove lines test 5 H")
    void removeLinesTest5() {
        List<String> list = new ArrayList<>();
        list.add("..##..");
        list.add("..##..");
        list.add("......");
        list.add("......");
        list.add("..##..");
        list.add("..##..");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("..##..");
        resList.add("......");
        resList.add("..##..");

        Assertions.assertEquals(C.removeLines(n, list), resList);
    }

    @Test
    @DisplayName("turn matrix test 1")
    void turnMatrixTest1() {
        List<String> list = new ArrayList<>();
        list.add("..##..");
        list.add("......");
        list.add("..##..");

        List<String> resList = new ArrayList<>();
        resList.add("...");
        resList.add("...");
        resList.add("#.#");
        resList.add("#.#");
        resList.add("...");
        resList.add("...");

        Assertions.assertEquals(C.ternLeft(list), resList);
    }

    @Test
    @DisplayName("turn matrix test 2")
    void turnMatrixTest2() {
        List<String> list = new ArrayList<>();
        list.add(".##.");
        list.add("....");

        List<String> resList = new ArrayList<>();
        resList.add("..");
        resList.add("#.");
        resList.add("#.");
        resList.add("..");

        Assertions.assertEquals(C.ternLeft(list), resList);
    }

    @Test
    @DisplayName("turn matrix 4 times test 3")
    void turnMatrixTest4() {
        List<String> list = new ArrayList<>();
        list.add(".##.");
        list.add("....");

        List<String> resList = new ArrayList<>();
        resList.add(".##.");
        resList.add("....");

        List<String> turnedList = C.ternLeft(list);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);

        Assertions.assertEquals(turnedList, resList);
    }

    @Test
    @DisplayName("remove turn remove test 0 empty")
    void removeTurnRemoveTest0() {
        List<String> list = new ArrayList<>();

        int n = list.size();

        List<String> resList = new ArrayList<>();


        List<String> turnedList = C.removeLines(n, list);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.removeLines(turnedList.size(), turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);

        Assertions.assertEquals(turnedList, resList);
    }

    @Test
    @DisplayName("remove turn remove test 1 I")
    void removeTurnRemoveTest1() {
        List<String> list = new ArrayList<>();
        list.add(".##.");
        list.add(".##.");
        list.add(".##.");
        list.add("....");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add(".#.");
        resList.add("...");


        List<String> turnedList = C.removeLines(n, list);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.removeLines(turnedList.size(), turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);

        Assertions.assertEquals(turnedList, resList);
    }


    @Test
    @DisplayName("remove turn remove test 2 O")
    void removeTurnRemoveTest2() {
        List<String> list = new ArrayList<>();
        list.add("....");
        list.add(".##.");
        list.add(".##.");
        list.add("....");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("...");
        resList.add(".#.");
        resList.add("...");


        List<String> turnedList = C.removeLines(n, list);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.removeLines(turnedList.size(), turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);

        Assertions.assertEquals(turnedList, resList);
    }

    @Test
    @DisplayName("remove turn remove test 3 C")
    void removeTurnRemoveTest3() {
        List<String> list = new ArrayList<>();
        list.add("......");
        list.add("......");
        list.add("...###");
        list.add("...###");
        list.add("......");
        list.add("......");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("..");
        resList.add(".#");
        resList.add("..");

        List<String> turnedList = C.removeLines(n, list);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.removeLines(turnedList.size(), turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);

        Assertions.assertEquals(turnedList, resList);
    }

    @Test
    @DisplayName("remove turn remove test 4 H")
    void removeTurnRemoveTest4() {
        List<String> list = new ArrayList<>();
        list.add("..##..");
        list.add("..##..");
        list.add("......");
        list.add("......");
        list.add("..##..");
        list.add("..##..");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add(".#.");
        resList.add("...");
        resList.add(".#.");

        List<String> turnedList = C.removeLines(n, list);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.removeLines(turnedList.size(), turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);

        Assertions.assertEquals(turnedList, resList);
    }

    @Test
    @DisplayName("remove turn remove test 5 P")
    void removeTurnRemoveTest5() {
        List<String> list = new ArrayList<>();
        list.add("......");
        list.add("..##..");
        list.add("..##..");
        list.add("......");
        list.add("..####");
        list.add("..####");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("...");
        resList.add(".#.");
        resList.add("...");
        resList.add(".##");

        List<String> turnedList = C.removeLines(n, list);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.removeLines(turnedList.size(), turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);

        Assertions.assertEquals(turnedList, resList);
    }

    @Test
    @DisplayName("answer test 0 empty")
    void answerTest0() {
        List<String> resList = new ArrayList<>();
        Assertions.assertEquals(C.getAnswer(resList), "X");
    }

    @Test
    @DisplayName("answer test 1 I")
    void answerTest1() {
        List<String> resList = new ArrayList<>();
        resList.add(".#.");
        resList.add("...");
        Assertions.assertEquals(C.getAnswer(resList), "I");
    }

    @Test
    @DisplayName("answer test 2 O")
    void answerTest2() {
        List<String> resList = new ArrayList<>();
        resList.add("...");
        resList.add(".#.");
        resList.add("...");
        Assertions.assertEquals(C.getAnswer(resList), "O");
    }

    @Test
    @DisplayName("answer test 3 C")
    void answerTest3() {
        List<String> resList = new ArrayList<>();
        resList.add("..");
        resList.add(".#");
        resList.add("..");
        Assertions.assertEquals(C.getAnswer(resList), "C");
    }

    @Test
    @DisplayName("answer test 4 H")
    void answerTest4() {
        List<String> resList = new ArrayList<>();
        resList.add(".#.");
        resList.add("...");
        resList.add(".#.");
        Assertions.assertEquals(C.getAnswer(resList), "H");
    }

    @Test
    @DisplayName("answer test 5 P")
    void answerTest5() {
        List<String> resList = new ArrayList<>();
        resList.add("...");
        resList.add(".#.");
        resList.add("...");
        resList.add(".##");
        Assertions.assertEquals(C.getAnswer(resList), "P");
    }

}
