package org.benf.cfr.tests;

// https://github.com/leibnitz27/cfr/issues/213
public class MethodReferenceTest3 extends MethodReferenceTest1 {
    public static void main(String[] args) {
        new MethodReferenceTest3().start();
    }

    protected void printMyShit(String text, String text2) {
        System.out.println(text + " " + text2);
    }

    public void start() {
        invokeInterface(super::printMyShit);
    }

    private void invokeInterface(ItfPrint t) {
        t.print("hello", "world");
    }

    public interface ItfPrint {
        void print(String one, String two);
    }
}
