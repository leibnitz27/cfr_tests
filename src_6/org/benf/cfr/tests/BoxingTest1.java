package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest1 {
    private void a(Integer i) {
        a(i);
        b(i);
        c(i);
    }

    private void b(int i) {
        a(i);
        b(i);
        c(i);
    }

    private void c(double d) {
        c(d);
        d(d);
    }

    private void d(Double d) {
        c(d);
        d(d);
    }

    private void e(Short s) {
        b(s);
        c(s);
        e(s);
        f(s);
    }

    private void f(short s) {
        b(s);
        c(s);
        e(s);
        f(s);
    }


}
