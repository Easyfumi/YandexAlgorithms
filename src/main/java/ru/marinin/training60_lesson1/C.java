package ru.marinin.training60_lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[][] str = new String[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("");
            System.arraycopy(line, 0, str[i], 0, n);
        }

        getPoints(n, str);


    }

    public static List<Point> getPoints(int n, String[][] str) {
        List<Point> pointList = new ArrayList<>();

        pointList.add(new Point(0, 0));
        pointList.add(new Point(n-1, n-1));


        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (str[i][j].equals("#")) {
                    int x = j;
                    int y = n - i - 1;
                    pointList.add(new Point(x,y));
                    while (j<n-1 && str[i][j+1].equals("#")) j++;
                    while (i>0 && str[i-1][j].equals("#")) i--;
                    if (x!=j || y!=(n - i - 1)) {
                        x = j;
                        y = n - i - 1;
                        pointList.add(new Point(x,y));
                    }

                }
            }
        }

        return pointList;
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