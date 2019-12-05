package org.benf.cfr.tests;

import java.io.PrintStream;

// Just to ensure we DO emit import PrintStream when we have to.
public class PrintStreamTest {
    void foo(boolean b) {
        PrintStream p = b ? System.err : System.out;
        p.print(true);
    }
}
