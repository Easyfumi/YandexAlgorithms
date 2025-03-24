package ru.marinin.tinkoff.intership;

import java.util.Scanner;

public class J {
    static final int MOD = 998244353;
    static final int inv2 = (MOD + 1) / 2; // 499122177

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }

        long[] S = new long[k + 1];
        S[0] = n % MOD;

        for (int m = 1; m <= k; m++) {
            S[m] = 0;
        }

        for (long num : a) {
            long[] pow = new long[k + 1];
            pow[0] = 1;
            if (k >= 1) {
                pow[1] = num % MOD;
                for (int m = 2; m <= k; m++) {
                    pow[m] = (pow[m - 1] * (num % MOD)) % MOD;
                }
            }
            for (int m = 1; m <= k; m++) {
                S[m] = (S[m] + pow[m]) % MOD;
            }
        }

        long[] pow2a = new long[k + 1];
        for (int p = 1; p <= k; p++) {
            pow2a[p] = 0;
        }

        for (long num : a) {
            long val = (2 * (num % MOD)) % MOD;
            long[] pow = new long[k + 1];
            pow[0] = 1;
            if (k >= 1) {
                pow[1] = val;
                for (int p = 2; p <= k; p++) {
                    pow[p] = (pow[p - 1] * val) % MOD;
                }
            }
            for (int p = 1; p <= k; p++) {
                pow2a[p] = (pow2a[p] + pow[p]) % MOD;
            }
        }

        long[][] C = new long[k + 1][k + 1];
        C[0][0] = 1;
        for (int p = 1; p <= k; p++) {
            C[p][0] = 1;
            C[p][p] = 1;
            for (int m = 1; m < p; m++) {
                C[p][m] = (C[p - 1][m - 1] + C[p - 1][m]) % MOD;
            }
        }

        for (int p = 1; p <= k; p++) {
            long total = 0;
            for (int m = 0; m <= p; m++) {
                int pm = p - m;
                if (pm < 0 || pm > k) continue;
                long term = (C[p][m] * S[m]) % MOD;
                term = (term * S[pm]) % MOD;
                total = (total + term) % MOD;
            }
            total = (total - pow2a[p] + MOD) % MOD;
            total = (total * inv2) % MOD;
            System.out.println(total);
        }
    }
}
