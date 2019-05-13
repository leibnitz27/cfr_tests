package org.benf.cfr.tests;

public class LoopTest67 {
    public static void main(String ... args){
        int x = 0;
        do {
            x++;
            System.out.println(x);
            if (x<100) {
                continue;
            }
            return;
        } while (true);
    }
}
