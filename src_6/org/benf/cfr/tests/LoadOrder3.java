package org.benf.cfr.tests;

public class LoadOrder3 {
    private final String lo1;

    private LoadOrder3(int x, String lo2, String lo1) {
        this.lo1 = lo1;
    }

    public LoadOrder3(int x) {
        this(x, LoadOrder1.doSomething(), LoadOrder2.CONSTANT.doSomething());
    }

    public LoadOrder3(int x, int y) {
        this(x+y, LoadOrder2.CONSTANT.doSomething(), LoadOrder1.doSomething());
    }

    public static void main(String... args) {
        // Calls static method doSomething
        new LoadOrder3(1);
    }

}
