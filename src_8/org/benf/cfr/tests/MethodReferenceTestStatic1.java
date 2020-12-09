package org.benf.cfr.tests;

// https://github.com/leibnitz27/cfr/issues/213
public class MethodReferenceTestStatic1 {
    public static void main(String[] args) {
        new MethodReferenceTestStatic1().start();
    }

    public void start() {
        invokeInterface(MethodReferenceTestStatic1::printMyShit);
    }

    protected static void printMyShit(String text, String text2) {
        System.out.println(text + " " + text2);
    }

    private void invokeInterface(ItfPrint t) {
        t.print("hello", "world");
    }

    public interface ItfPrint {
        void print(String one, String two);
    }
}
