package org.benf.cfr.tests;


public class InstanceOfMatchFail {

    public Object next = null;
    int value = 1;

    public int toInt() {
        Object tmp = this;
        int x = 0;
        while (tmp instanceof InstanceOfMatchFail foo) {
            x += foo.value;
            tmp = foo.next;
        }
        return x;
    }
}