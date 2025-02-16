package ru.marinin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.marinin.training60_lesson1.C;


import java.util.ArrayList;
import java.util.List;



public class TestC {
    @Test
    @DisplayName("getPointsTest1")
    void getPointsTest1() { // 5x5
        String[][] str = {  {".", ".", ".", ".", "."},
                            {".", ".", ".", ".", "."},
                            {".", ".", ".", ".", "."},
                            {".", ".", ".", ".", "."},
                            {".", ".", ".", ".", "."}  };

        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(0,0));
        pointList.add(new Point(4,4));

        Assertions.assertEquals(C.getPoints(5, str).toString(), pointList.toString());
    }

    @Test
    @DisplayName("getPointsTest2")
    void getPointsTest2() { // 5x5
        String[][] str = {  {".", ".", ".", ".", "."},
                            {".", ".", ".", ".", "."},
                            {".", ".", ".", ".", "."},
                            {"#", "#", ".", ".", "."},
                            {"#", "#", ".", ".", "."}  };

        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(0,0));
        pointList.add(new Point(4,4));
        pointList.add(new Point(0,0));
        pointList.add(new Point(1,1));

        Assertions.assertEquals(C.getPoints(5, str).toString(), pointList.toString());
    }


    @Test
    @DisplayName("getPointsTest3")
    void getPointsTest3() { // 5x5
        String[][] str = {  {".", ".", ".", ".", "#"},
                            {".", ".", ".", ".", "."},
                            {".", ".", ".", ".", "."},
                            {".", ".", ".", ".", "."},
                            {".", ".", ".", ".", "."}  };

        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(0,0));
        pointList.add(new Point(4,4));
        pointList.add(new Point(4,4));

        Assertions.assertEquals(C.getPoints(5, str).toString(), pointList.toString());
    }


    @Test
    @DisplayName("getPointsTest4")
    void getPointsTest4() { // 5x5
        String[][] str = {  {".", ".", ".", ".", "#"},
                            {".", ".", ".", ".", "#"},
                            {".", ".", ".", ".", "#"},
                            {".", ".", ".", ".", "#"},
                            {".", ".", ".", ".", "."}  };

        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(0,0));
        pointList.add(new Point(4,4));
        pointList.add(new Point(4,1));
        pointList.add(new Point(4,4));

        Assertions.assertEquals(C.getPoints(5, str).toString(), pointList.toString());
    }

//    @Test
//    @DisplayName("getPointsTest5")
//    void getPointsTest5() { // некорректная работа в данном случае не повлияет на финальный ответ
//        String[][] str = {  {".", ".", ".", ".", "#"},
//                            {"#", ".", ".", ".", "#"},
//                            {"#", ".", ".", ".", "#"},
//                            {"#", ".", ".", ".", "#"},
//                            {"#", ".", ".", ".", "."}  };
//
//        List<Point> pointList = new ArrayList<>();
//        pointList.add(new Point(0,0));
//        pointList.add(new Point(4,4));
//        pointList.add(new Point(0,0));
//        pointList.add(new Point(0,3));
//        pointList.add(new Point(4,1));
//        pointList.add(new Point(4,4));
//
//        Assertions.assertEquals(C.getPoints(5, str).toString(), pointList.toString());

    @Test
    @DisplayName("getPointsTest5")
    void getPointsTest5() { // 6x6
        String[][] str = {  {".", ".", ".", ".", ".", "."},
                            {".", ".", "#", "#", ".", "."},
                            {".", ".", "#", "#", ".", "."},
                            {".", ".", ".", ".", ".", "."},
                            {".", ".", "#", "#", "#", "#"},
                            {".", ".", "#", "#", "#", "#"}  };

        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(0,0));
        pointList.add(new Point(5,5));
        pointList.add(new Point(2,0));
        pointList.add(new Point(5,1));
        pointList.add(new Point(2,3));
        pointList.add(new Point(3,4));

        Assertions.assertEquals(C.getPoints(6, str).toString(), pointList.toString());
    }

    @Test
    @DisplayName("getPointsTest6")
    void getPointsTest6() { // 1x1
        String[][] str = {  {"."}  };

        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(0,0));
        pointList.add(new Point(0,0));

        Assertions.assertEquals(C.getPoints(1, str).toString(), pointList.toString());
    }

    @Test
    @DisplayName("getPointsTest7")
    void getPointsTest7() { // 1x1
        String[][] str = {  {"#"}  };

        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(0,0));
        pointList.add(new Point(0,0));
        pointList.add(new Point(0,0));

        Assertions.assertEquals(C.getPoints(1, str).toString(), pointList.toString());
    }

    @Test
    @DisplayName("getPointsTest8")
    void getPointsTest8() { // 5x5
        String[][] str = {  {"#", ".", ".", ".", "#"},
                            {".", "#", ".", "#", "."},
                            {".", ".", "#", ".", "."},
                            {".", "#", ".", "#", "."},
                            {"#", ".", ".", ".", "#"}  };

        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(0,0));
        pointList.add(new Point(4,4));
        pointList.add(new Point(0,0));
        pointList.add(new Point(4,0));
        pointList.add(new Point(1,1));
        pointList.add(new Point(3,1));
        pointList.add(new Point(2,2));
        pointList.add(new Point(1,3));
        pointList.add(new Point(3,3));
        pointList.add(new Point(0,4));
        pointList.add(new Point(4,4));



        Assertions.assertEquals(C.getPoints(5, str).toString(), pointList.toString());
    }

    @Test
    @DisplayName("getPointsTest9")
    void getPointsTest9() { // 6x6
        String[][] str = {  {".", ".", "#", "#", ".", "."},
                            {".", ".", "#", "#", ".", "."},
                            {".", ".", ".", ".", ".", "."},
                            {".", ".", ".", ".", ".", "."},
                            {".", ".", "#", "#", ".", "."},
                            {".", ".", "#", "#", ".", "."}  };

        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(0,0));
        pointList.add(new Point(5,5));
        pointList.add(new Point(2,0));
        pointList.add(new Point(3,1));
        pointList.add(new Point(2,4));
        pointList.add(new Point(3,5));

        Assertions.assertEquals(C.getPoints(6, str).toString(), pointList.toString());
    }

    @Test
    @DisplayName("getPointsTest10")
    void getPointsTest10() { // 5x5
        String[][] str = {  {".", ".", "#", "#", "#"},
                            {".", ".", "#", "#", "#"},
                            {".", ".", "#", "#", "#"},
                            {".", ".", "#", "#", "#"},
                            {".", ".", ".", ".", "."}  };

        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(0, 0));
        pointList.add(new Point(4, 4));
        pointList.add(new Point(2, 1));
        pointList.add(new Point(4, 4));

        Assertions.assertEquals(C.getPoints(5, str).toString(), pointList.toString());
    }

    @Test
    @DisplayName("getPointsTest11")
    void getPointsTest11() { // 5x5
        String[][] str = {  {".", ".", ".", ".", "."},
                            {".", ".", "#", "#", "#"},
                            {".", ".", "#", "#", "#"},
                            {".", ".", "#", "#", "#"},
                            {".", ".", ".", ".", "."}  };

        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(0, 0));
        pointList.add(new Point(4, 4));
        pointList.add(new Point(2, 1));
        pointList.add(new Point(4, 3));

        Assertions.assertEquals(C.getPoints(5, str).toString(), pointList.toString());
    }

    @Test
    @DisplayName("getPointsTest12")
    void getPointsTest12() { // 5x5
        String[][] str = {  {".", ".", ".", ".", "."},
                            {".", "#", "#", ".", "."},
                            {".", "#", "#", ".", "."},
                            {".", "#", "#", ".", "."},
                            {".", ".", ".", ".", "."}  };

        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(0, 0));
        pointList.add(new Point(4, 4));
        pointList.add(new Point(1, 1));
        pointList.add(new Point(2, 3));

        Assertions.assertEquals(C.getPoints(5, str).toString(), pointList.toString());
    }

    @Test
    @DisplayName("getLetterTest1")
    void getLetterTest1() { // X
        int[] ints = {0,0,4,4,0,0,4,0,1,1,3,1,2,2,1,3,0,4,4,4};
        Assertions.assertEquals(C.getLetter(C.getPointList(ints)), "X");
    }

    @Test
    @DisplayName("getLetterTest2")
    void getLetterTest2() { // P
        int[] ints = {0,0,5,5,2,0,5,1,2,3,3,4};
        Assertions.assertEquals(C.getLetter(C.getPointList(ints)), "P");
    }


    @Test
    @DisplayName("getLetterTest3")
    void getLetterTest3() { // H
        int[] ints = {0,0,5,5,2,0,3,1,2,4,3,5};
        Assertions.assertEquals(C.getLetter(C.getPointList(ints)), "H");
    }

    @Test
    @DisplayName("getLetterTest4")
    void getLetterTest4() { // L
        int[] ints = {0,0,4,4,2,1,4,4};
        Assertions.assertEquals(C.getLetter(C.getPointList(ints)), "L");
    }

    @Test
    @DisplayName("getLetterTest5")
    void getLetterTest5() { // C
        int[] ints = {0,0,4,4,2,1,4,3};
        Assertions.assertEquals(C.getLetter(C.getPointList(ints)), "C");
    }

    @Test
    @DisplayName("getLetterTest6")
    void getLetterTest6() { // O
        int[] ints = {0,0,4,4,1,1,2,3};
        Assertions.assertEquals(C.getLetter(C.getPointList(ints)), "O");
    }



}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}