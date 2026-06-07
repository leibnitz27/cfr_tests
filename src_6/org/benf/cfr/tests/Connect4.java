package org.benf.cfr.tests;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * ok, a bit silly... ;)
 */

public class Connect4 {
    public static void printBoard(long[] p) {
        for (int y=5;y>=0;--y) {
            for (int x=0;x<7;++x) {
                System.out.print((0 != ((p[0] >> (x * 8)) & (1L << y))) ? 'X' : ((0 != ((p[1] >> (x * 8)) & (1L << y)))? 'O' : '.') + ((x == 6) ? "\n" : ""));
            }
        }
        for(int x=0;x<7;++x) {
            System.out.print((char)(x+'0'));
        }
        System.out.println("\n-------");
    }

    public static boolean win(long p) {
        for (int s : new int[]{1, 7, 9, 8}) {
            if (0 != (p & (p >> s) & (p >> (s * 2)) & ( p >> (s * 3)))) return true;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        long[] p = {0,0};
        int i=-1;
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        printBoard(p);
        while (++i < 42) {
            System.out.println(((i%2==0)?"X":"O")+" turn");
            int c = bi.readLine().charAt(0) - '0';

            if (c < 0 || c > 6) {
                System.out.println("Invalid");
                --i;
                continue;
            }
            long prev = ((p[i % 2] | p[(i+1)%2]) >> (c*8)) & 0xff;
            if (prev + 1 == 64) {
                System.out.println("Column full");
                --i;
                continue;
            }
            p[i % 2] |= (prev+1) << (c*8);
            printBoard(p);
            if (win(p[i % 2])) {
                System.out.println(((i%2 == 0)?"X":"O") + " wins!");
                return;
            }
        }
        System.out.println("Draw");
    }
}