package org.benf.cfr.tests;


import java.util.List;

public class SuperTest4 extends SuperBase {

    private interface Interface<T> {
        T copy(T arg);

        void doStuff(T arg);
    }

    private abstract class Abstract<X> implements Interface<X> {
        public X copy(X arg) { return arg; }
    }

    private class Impl<J> extends Abstract<J> {
        @Override
        public void doStuff(J arg) {

        }
    }

    public Object test(String arg) {
        Impl<String> impl = new Impl<String>();
        String res = impl.copy(arg);
        return res;
    }

    public String test() {
        String tmp = "TEST";
        Impl<String> impl = new Impl<String>();
        return impl.copy(tmp);
    }

    public Object test(Impl<Integer> arg) {
        return arg.copy(1);
    }

}
