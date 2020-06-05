package org.benf.cfr.tests;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LoopTest73 {
    public static void main(String[] args)
    {
        while (true) {
            System.out.println("HERE");
            if (args.length < 10) continue;;
            System.out.println("THERE");
            if (args.length < 5) continue;;
            System.out.println("EVERYWHERE");
        }
    }
}
