package org.benf.cfr.tests;

public class FlexibleConstructorBody1 {

    static class Base {
        final int x;

        Base(int x) {
            this.x = x;
        }
    }

    static class Validated extends Base {
        Validated(int x) {
            if (x < 0) {
                throw new IllegalArgumentException("x must be non-negative");
            }
            super(x);
        }
    }

    static class Computed extends Base {
        Computed(int x, int y) {
            int sum = x + y;
            super(sum);
        }
    }

    static class DelegatingThis extends Base {
        final String label;

        DelegatingThis(int x, String label) {
            super(x);
            this.label = label;
        }

        DelegatingThis(String s) {
            int parsed = Integer.parseInt(s);
            this(parsed, "parsed:" + s);
        }

        @Override
        public String toString() {
            return label + "=" + x;
        }
    }

    public static void main(String[] args) {
        Validated v = new Validated(42);
        System.out.println(v.x);

        try {
            new Validated(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Computed c = new Computed(3, 4);
        System.out.println(c.x);

        DelegatingThis d = new DelegatingThis("7");
        System.out.println(d);
    }
}
