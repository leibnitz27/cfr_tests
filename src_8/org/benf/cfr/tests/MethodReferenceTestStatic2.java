package org.benf.cfr.tests;

// https://github.com/leibnitz27/cfr/issues/213
public class MethodReferenceTestStatic2 extends MethodReferenceTestStatic1 {
    public static void main(String[] args) {
        new MethodReferenceTestStatic2().start();
    }

    public void start() {
        invokeInterface(MethodReferenceTestStatic1::printMyShit);
    }

    private void invokeInterface(ItfPrint t) {
        t.print("hello", "world");
    }

    public interface ItfPrint {
        void print(String one, String two);
    }
}
