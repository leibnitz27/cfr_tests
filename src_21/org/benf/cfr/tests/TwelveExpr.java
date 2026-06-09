package org.benf.cfr.tests;

public class TwelveExpr {

    static final String[] ORDINALS = {
            "", "first", "second", "third", "fourth",
            "fifth", "sixth", "seventh", "eighth",
            "ninth", "tenth", "eleventh", "twelfth"
    };

    static final String[] GIFTS = {
            "",
            "a Partridge in a Pear Tree",
            "two Turtle Doves",
            "three French Hens",
            "four Calling Birds",
            "five Gold Rings",
            "six Geese a-Laying",
            "seven Swans a-Swimming",
            "eight Maids a-Milking",
            "nine Ladies Dancing",
            "ten Lords a-Leaping",
            "eleven Pipers Piping",
            "twelve Drummers Drumming"
    };

    static int xx = 1;

    record Day(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l ) {
        public int a() { System.out.print("\nOn the " + ORDINALS[xx++] + " day of Christmas my true love gave to me "); return get(1); }
        public int b() { return get(2); }
        public int c() { return get(3); }
        public int d() { return get(4); }
        public int e() { return get(5); }
        public int f() { return get(6); }
        public int g() { return get(7); }
        public int h() { return get(8); }
        public int i() { return get(9); }
        public int j() { return get(10); }
        public int k() { return get(11); }
        public int l() { return get(12); }

        private int get(int x) {
            if (x <= xx) System.out.print( (x > 1 ? ((xx==x+1) ? " and " : ", ") : "") + GIFTS[xx-x]);
            return 0;
        }
    }

    public static void main(String[] args) {
        Day dd = new Day(0,0,0,0,0,0,0,0,0,0,0,0);
        int r = switch (dd) {
            case Day(int a, _, _, _, _, _, _, _, _, _, _, _) when a == 1 -> 1;
            case Day(int a, _, _, _, _, _, _, _, _, _, _, _) when a == 2 -> 2;
            case Day(int a, _, _, _, _, _, _, _, _, _, _, _) when a == 3 -> 3;
            case Day(int a, _, _, _, _, _, _, _, _, _, _, _) when a == 4 -> 4;
            case Day(int a, _, _, _, _, _, _, _, _, _, _, _) when a == 5 -> 5;
            case Day(int a, _, _, _, _, _, _, _, _, _, _, _) when a == 6 -> 6;
            case Day(int a, _, _, _, _, _, _, _, _, _, _, _) when a == 7 -> 7;
            case Day(int a, _, _, _, _, _, _, _, _, _, _, _) when a == 8 -> 8;
            case Day(int a, _, _, _, _, _, _, _, _, _, _, _) when a == 9 -> 9;
            case Day(int a, _, _, _, _, _, _, _, _, _, _, _) when a == 10 -> 10;
            case Day(int a, _, _, _, _, _, _, _, _, _, _, _) when a == 11 -> 11;
            case Day(int a, _, _, _, _, _, _, _, _, _, _, _) when a == 12 -> 12;
            default -> 0;
        };
        System.out.println("\nresult=" + r);
    }
}
