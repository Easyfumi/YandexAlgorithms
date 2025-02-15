package ru.marinin.training60_lesson1;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int TBlue = scanner.nextInt();
        int TRed = scanner.nextInt();
        int SBlue = scanner.nextInt();
        int SRed = scanner.nextInt();

        System.out.println(findMin(TBlue, TRed, SBlue, SRed));
    }

    public static String findMin(int TBlue, int TRed, int SBlue, int SRed) {
        String ans = "";
        if (TBlue > TRed && SBlue > SRed) {
            ans += (Math.min(TBlue, TRed) + 1) + " " + (Math.min(SBlue, SRed) + 1);
        } else if ( (TBlue == 0 || TRed ==0) && SBlue != 0 && SRed != 0) {
            ans += (Math.min(TBlue, TRed) + 1) + " " + (Math.max(SBlue, SRed) + 1);
        } else if ( (SBlue == 0 || SRed ==0) && TBlue != 0 && TRed != 0) {
            ans += (Math.max(TBlue, TRed) + 1) + " " + (Math.min(SBlue, SRed) + 1);
        } else {
            ans += (Math.max(TBlue, TRed) + 1) + " " + (Math.max(SBlue, SRed) + 1);
        }

        return ans;
    }
}
