package org.benf.cfr.tests;

public class IterTest10 {
    public static class Iterable<T> {
        public Iterator<T> iterator() {
            return null;
        }
    }

    public static class Iterator<T> {
        boolean hasNext() {
            return false;
        }

        T next() {
            return null;
        }
    }

    public void test(Iterable<String> is) {
        Iterator<String> i = is.iterator();
        while (i.hasNext()) {
            String s = i.next();
            System.out.println(s);
        }
    }
}
