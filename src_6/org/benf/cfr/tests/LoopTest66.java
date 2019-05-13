package org.benf.cfr.tests;

public class LoopTest66 {
    void foo(int x){
        int y = 3;
        do {
            try {
                System.out.println(x + y);
                x++;
                if (y % x == 3) continue;
                System.out.println("There");
            } catch (Exception e) {
            }
            System.out.println("Here");
            break;
        } while (x < 20);
    }
}
