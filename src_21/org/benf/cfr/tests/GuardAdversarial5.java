package org.benf.cfr.tests;

public class GuardAdversarial5 {

    record Mid(Mid m, int a, Mid b) {}

    static int guardDeep(Object obj) {
        switch (obj) {
            case Mid(Mid(Mid(_, int f, Mid(_,  int g, _)), int a, Mid(_, int x, _)), int x2, _) when g == x && a > g -> { return a+x+f+x2; }
            case Mid(Mid(_, int a, _), int x, _) when a == x -> { return 1; }
            case Mid(_, int a, Mid(_, int c, _)) when a >= 12 -> { return a - c; }
            default -> { return 0; }
        }
    }

}
