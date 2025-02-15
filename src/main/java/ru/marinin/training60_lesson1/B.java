package ru.marinin.training60_lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int TBlue = scanner.nextInt();
        int TRed = scanner.nextInt();
        int SBlue = scanner.nextInt();
        int SRed = scanner.nextInt();

        List<Integer> list = new ArrayList<>();


        if (TBlue > 0 && TBlue > 0) {
            list.add(TRed + 1);
            list.add(SRed + 1);
        }

        if (TRed > 0 && TRed > 0) {
            list.add(TBlue + 1);
            list.add(SBlue + 1);
        }

        if (TBlue > 0 && TRed > 0) {
            list.add(Math.max(TBlue, TRed) + 1);
            list.add(1);
        }

        if (SBlue > 0 && SRed > 0) {
            list.add(1);
            list.add(Math.max(SBlue, SRed) + 1);
        }

        int imin = 0;
        int jmin = 1;
        int min = list.get(0) + list.get(1);

        for (int k = 1; k < list.size()/2 ; k++) {
            int i = k * 2;
            int j = i + 1;
            if (list.get(i) + list.get(j) < min) {
                imin = i;
                jmin = j;
                min = list.get(i) + list.get(j);
            }
        }

        System.out.println(list.get(imin) + " " + list.get(jmin));

    }

}
