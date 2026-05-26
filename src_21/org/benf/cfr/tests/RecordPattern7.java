package org.benf.cfr.tests;

public class RecordPattern7 {
    record Point(int x, int y) {}
    record Tag(String name) {}

    static void labelled(Object o) {
        switch (o) {
            case Point(int x, int y):
                System.out.println("point " + x + " " + y);
                break;
            case Tag(String name):
                System.out.println("tag " + name);
                break;
            case Integer i:
                System.out.println("int " + i);
                break;
            case null:
            default:
                System.out.println("other");
                break;
        }
    }

    static int total(Object o) {
        int n = 0;
        switch (o) {
            case Point(int x, int y):
                n = x + y;
                break;
            case Tag(String name):
                n = name.length();
                break;
            default:
                n = -1;
        }
        return n;
    }

    public static void main(String[] args) {
        labelled(new Point(1, 2));
        labelled(new Tag("hi"));
        labelled(42);
        labelled(null);
        labelled("strs");
        System.out.println(total(new Point(3, 4)));
        System.out.println(total(new Tag("name")));
        System.out.println(total("other"));
    }
}
