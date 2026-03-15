package org.benf.cfr.tests;

public class PrimitivePatterns6b {

    // Void switch with primitive patterns (statement switch, no value)
    static void voidSwitch(int x) {
        switch (x) {
            case int i when i < 0:
                System.out.println("negative: " + i);
                break;
            case int i when i == 0:
                System.out.println("zero");
                break;
            case int i:
                System.out.println("positive: " + i);
                break;
        }
    }

    public static void main(String[] args) {
        voidSwitch(-5);
        voidSwitch(0);
        voidSwitch(10);
    }
}
