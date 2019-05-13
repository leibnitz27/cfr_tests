package org.benf.cfr.tests;

public class KotSwitchEquivalent {
    public static int testBehave(String s) {
        switch (s) {
            case "BB": return 111;
            case "Ab": return  333;
            default: return 444;
        }
    }
}
