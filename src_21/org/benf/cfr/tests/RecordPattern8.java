package org.benf.cfr.tests;

public class RecordPattern8 {
    record Point(int x, int y) {}
    record Edge(Point a, Point b) {}
    record Triangle(Edge ab, Edge bc, Edge ca) {}

    static String deepIf(Object o) {
        if (o instanceof Triangle(Edge(Point(int ax, int ay), Point(int bx, int by)), Edge ebc, Edge eca)) {
            return "tri a=(" + ax + "," + ay + ") b=(" + bx + "," + by + ") rest=" + ebc + "," + eca;
        }
        return "no";
    }

    static String deepSwitch(Object o) {
        return switch (o) {
            case Triangle(Edge(Point(int ax, int ay), Point(int bx, int by)),
                          Edge(Point(int cx, int cy), Point(int dx, int dy)),
                          Edge ca) -> "full " + ax + "," + ay + "/" + bx + "," + by + "/" + cx + "," + cy + "/" + dx + "," + dy;
            case Triangle(Edge(Point(int x, int y), Point p2), Edge e2, Edge e3) -> "partial " + x + "," + y;
            case null, default -> "other";
        };
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);
        Edge ab = new Edge(p1, p2);
        Edge bc = new Edge(p2, p3);
        Edge ca = new Edge(p3, p1);
        Triangle t = new Triangle(ab, bc, ca);
        System.out.println(deepIf(t));
        System.out.println(deepIf("not"));
        System.out.println(deepSwitch(t));
        System.out.println(deepSwitch(new Triangle(ab, new Edge(p3, p1), new Edge(p1, p2))));
        System.out.println(deepSwitch("none"));
    }
}
