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
    void getPointsTest5() { // 5x5
        String[][] str = {  {".", ".", ".", ".", "."},
                            {".", ".", "#", "#", "."},
                            {".", ".", ".", ".", "."},
                            {".", ".", "#", "#", "#"},
                            {".", ".", "#", "#", "#"}  };

        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(0,0));
        pointList.add(new Point(4,4));
        pointList.add(new Point(2,0));
        pointList.add(new Point(4,1));
        pointList.add(new Point(2,3));
        pointList.add(new Point(3,3));

        Assertions.assertEquals(C.getPoints(5, str).toString(), pointList.toString());
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