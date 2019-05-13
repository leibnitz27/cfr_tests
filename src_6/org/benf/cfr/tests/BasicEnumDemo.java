package org.benf.cfr.tests;

public final class BasicEnumDemo {

    private enum Color {
        CYAN, MAGENTA, YELLOW, BLACK
    }

    public static void main(String[] args) {
        BasicEnumDemo demo = new BasicEnumDemo();
        demo.printColor(Color.CYAN);
    }

    private void printColor(Color color) {
        if (color == Color.BLACK) {
            System.out.println("Key color");
        }
        System.out.println(color);
    }
}
