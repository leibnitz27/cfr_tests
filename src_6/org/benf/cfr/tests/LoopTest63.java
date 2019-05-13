package org.benf.cfr.tests;

public class LoopTest63 {
    public void loop() {
        int x = 3;
        do {
            if (x < 50) continue;
            break;
        } while (x++<100);
        System.out.println("Done.");
    }
}
