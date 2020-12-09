package org.benf.cfr.tests;

// https://github.com/leibnitz27/cfr/issues/213
public class MethodReferenceTest1 {
    public static void main(String[] args) {
        new MethodReferenceTest1().start();
    }

    public void start() {
        invokeInterface(this::printMyShit);
    }

    protected void printMyShit(String text, String text2) {
        System.out.println(text + " " + text2);
    }

    private void invokeInterface(ItfPrint t) {
        t.print("hello", "world");
    }

    public interface ItfPrint {
        void print(String one, String two);
    }
}
