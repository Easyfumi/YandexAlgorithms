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

        if ((TBlue == 0 && SBlue > SRed) || (TRed == 0 && SBlue < SRed)) {
            ans += (Math.min(TBlue, TRed) + 1) + " " + (Math.max(SBlue, SRed) + 1);
        } else if ((SBlue == 0 && TBlue > TRed) || (SRed == 0 && TBlue < TRed)) {
            ans += (Math.max(TBlue, TRed) + 1) + " " + (Math.min(SBlue, SRed) + 1);
        } else {
            ans += (Math.min(TBlue, TRed) + 1) + " " + (Math.min(SBlue, SRed) + 1);
        }

        return ans;
    }
}
