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

        Assertions.assertEquals(C.removeLines(n, list), resList);
    }



    @Test
    @DisplayName("remove lines test 2 O")
    void removeLinesTest2() {
        List<String> list = new ArrayList<>();
        list.add("####");
        list.add("#..#");
        list.add("#..#");
        list.add("####");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("####");
        resList.add("#..#");
        resList.add("####");

        Assertions.assertEquals(C.removeLines(n, list), resList);
    }

    @Test
    @DisplayName("remove lines test 3 C")
    void removeLinesTest3() {
        List<String> list = new ArrayList<>();
        list.add("######");
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("######");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("######");
        resList.add("#.....");
        resList.add("######");

        Assertions.assertEquals(C.removeLines(n, list), resList);
    }

    @Test
    @DisplayName("remove lines test 4 L")
    void removeLinesTest4() {
        List<String> list = new ArrayList<>();
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("######");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("#.....");
        resList.add("######");

        Assertions.assertEquals(C.removeLines(n, list), resList);
    }

    @Test
    @DisplayName("remove lines test 5 P")
    void removeLinesTest5() {
        List<String> list = new ArrayList<>();
        list.add("######");
        list.add("##..##");
        list.add("##..##");
        list.add("######");
        list.add("##....");
        list.add("##....");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("######");
        resList.add("##..##");
        resList.add("######");
        resList.add("##....");

        Assertions.assertEquals(C.removeLines(n, list), resList);
    }

    @Test
    @DisplayName("remove lines test 6 H")
    void removeLinesTest6() {
        List<String> list = new ArrayList<>();
        list.add("##..##");
        list.add("##..##");
        list.add("######");
        list.add("######");
        list.add("##..##");
        list.add("##..##");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("##..##");
        resList.add("######");
        resList.add("##..##");

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
    @DisplayName("turn matrix 4 times test 4")
    void turnMatrixTest5() {
        List<String> list = new ArrayList<>();
        list.add("###");
        list.add("#.#");
        list.add("###");
        list.add("#..");

        List<String> resList = new ArrayList<>();
        resList.add("###");
        resList.add("#.#");
        resList.add("###");
        resList.add("#..");

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
        resList.add("#");



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
        list.add("####");
        list.add("#..#");
        list.add("#..#");
        list.add("####");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("###");
        resList.add("#.#");
        resList.add("###");


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
        list.add("######");
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("######");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("##");
        resList.add("#.");
        resList.add("##");

        List<String> turnedList = C.removeLines(n, list);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.removeLines(turnedList.size(), turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);

        Assertions.assertEquals(turnedList, resList);
    }

    @Test
    @DisplayName("remove turn remove test 4 L")
    void removeTurnRemoveTest4() {
        List<String> list = new ArrayList<>();
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("######");
        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("#.");
        resList.add("##");

        List<String> turnedList = C.removeLines(n, list);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.removeLines(turnedList.size(), turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);

        Assertions.assertEquals(turnedList, resList);
    }

    @Test
    @DisplayName("remove turn remove test 5 H")
    void removeTurnRemoveTest5() {
        List<String> list = new ArrayList<>();
        list.add("##..##");
        list.add("##..##");
        list.add("######");
        list.add("######");
        list.add("##..##");
        list.add("##..##");
        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("#.#");
        resList.add("###");
        resList.add("#.#");

        List<String> turnedList = C.removeLines(n, list);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.removeLines(turnedList.size(), turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);
        turnedList = C.ternLeft(turnedList);

        Assertions.assertEquals(turnedList, resList);
    }

    @Test
    @DisplayName("remove turn remove test 6 P")
    void removeTurnRemoveTest6() {
        List<String> list = new ArrayList<>();
        list.add("######");
        list.add("##..##");
        list.add("##..##");
        list.add("######");
        list.add("##....");
        list.add("##....");

        int n = list.size();

        List<String> resList = new ArrayList<>();
        resList.add("###");
        resList.add("#.#");
        resList.add("###");
        resList.add("#..");

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
        Assertions.assertEquals(C.getAnswer(resList, resList), "X");
    }



    @Test
    @DisplayName("full test empty")
    void fullTest0() {
        List<String> resList = new ArrayList<>();
        Assertions.assertEquals(C.start(resList.size(), resList, resList), "X");
    }

    @Test
    @DisplayName("full test 1 I")
    void fullTest1() {
        List<String> list = new ArrayList<>();
        list.add(".##.");
        list.add(".##.");
        list.add(".##.");
        list.add("....");
        Assertions.assertEquals(C.start(list.size(), list, list), "I");
    }

    @Test
    @DisplayName("full test 2 O")
    void fullTest2() {
        List<String> list = new ArrayList<>();
        list.add("####");
        list.add("#..#");
        list.add("#..#");
        list.add("####");
        Assertions.assertEquals(C.start(list.size(), list, list), "O");
    }

    @Test
    @DisplayName("full test 3 C")
    void fullTest3() {
        List<String> list = new ArrayList<>();
        list.add("######");
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("######");
        Assertions.assertEquals(C.start(list.size(), list, list), "C");
    }

    @Test
    @DisplayName("full test 4 L")
    void fullTest4() {
        List<String> list = new ArrayList<>();
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("#.....");
        list.add("######");
        Assertions.assertEquals(C.start(list.size(), list, list), "L");
    }

    @Test
    @DisplayName("full test 5 P")
    void fullTest5() {
        List<String> list = new ArrayList<>();
        list.add("######");
        list.add("##..##");
        list.add("##..##");
        list.add("######");
        list.add("##....");
        list.add("##....");
        Assertions.assertEquals(C.start(list.size(), list, list), "P");
    }

    @Test
    @DisplayName("full test 6 H")
    void fullTest6() {
        List<String> list = new ArrayList<>();
        list.add("##..##");
        list.add("##..##");
        list.add("######");
        list.add("######");
        list.add("##..##");
        list.add("##..##");
        Assertions.assertEquals(C.start(list.size(), list, list), "H");
    }

    @Test
    @DisplayName("full test 7 L")
    void fullTest7() {
        List<String> list = new ArrayList<>();
        list.add("#####.");
        list.add("#####.");
        list.add("#####.");
        list.add("#####.");
        list.add("#####.");
        list.add("######");
        Assertions.assertEquals(C.start(list.size(), list, list), "L");
    }

    @Test
    @DisplayName("full test 8")
    void fullTest8() {
        List<String> list = new ArrayList<>();
        list.add("#");
        Assertions.assertEquals(C.start(list.size(), list, list), "I");
    }

    @Test
    @DisplayName("full test 9")
    void fullTest9() {
        List<String> list = new ArrayList<>();
        list.add("######");
        list.add("......");
        list.add("......");
        list.add("......");
        list.add("......");
        list.add("......");
        Assertions.assertEquals(C.start(list.size(), list, list), "X");
    }


}
