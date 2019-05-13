package org.benf.cfr.tests;

// Additional note: CFR adds an import for "java.io.PrintStream" (not required)
// Tests from Abe Crannaford.
class Second1a {

    static Object obj = "test"; // value doesn't matter

    // CFR tries using "reference" as a type
    // Method should print numbers from 1-10
    static void test1() {
        synchronized(obj) {
            obj = 0;
        }
        while(true) {
            int num = (int)obj;
            num++;
        }
    }
}