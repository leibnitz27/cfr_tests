package org.benf.cfr.tests;

// Additional note: CFR adds an import for "java.io.PrintStream" (not required)

class Second {

    static Object obj = "test"; // value doesn't matter

    public static void main(String[] args) {
        test1();
        try {
            test2();
        } catch (NullPointerException npe) {
            System.out.println("success!");
            npe.printStackTrace();
        }
    }

    // CFR tries using "reference" as a type
    // Method should print numbers from 1-10
    static void test1() {
        synchronized(obj) {
            obj = 0;
        }
        while(true) {
            int num = (int)obj;
            num++;
            System.out.println(num);
            obj = num;
            if(num == 10) break;
        }
    }

    // CFR decompiles as synchronizing null (illegal)
    // Method should throw a NullPointerException
    // Note that 'obj' is assigned null before exception occurs
    static void test2() {
        synchronized(obj = null) {
        }
    }

}