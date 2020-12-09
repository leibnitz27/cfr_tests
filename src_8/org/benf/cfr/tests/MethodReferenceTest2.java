package org.benf.cfr.tests;

// https://github.com/leibnitz27/cfr/issues/213
public class MethodReferenceTest2 extends MethodReferenceTest1 {
    public static void main(String[] args) {
        new MethodReferenceTest2().start();
    }

    public void start() {
        invokeInterface(this::printMyShit);
    }

    private void invokeInterface(ItfPrint t) {
        t.print("hello", "world");
    }

    public interface ItfPrint {
        void print(String one, String two);
    }
}
