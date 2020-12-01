package org.benf.cfr.tests;

public class FakeRoundabout {
    // Two switches that legitimately have the same target.
    void foo(int x, int y) {
        switch (x) {
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
                switch (y) {
                    case 0:
                        System.out.println("0");
                    case 1:
                        System.out.println("1");
                    case 2:
                        System.out.println("2");

                }

        }
        System.out.println("Nothing to see");
    }
}
