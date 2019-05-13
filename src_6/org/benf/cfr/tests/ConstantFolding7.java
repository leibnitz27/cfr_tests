package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class ConstantFolding7 {
    public static RuntimeException mkNull(String name) {
        return new RuntimeException("This is " + name + " here");
    }

    public static void main(String ... args) {
        // just to prove to myself FP error persists in folding.
        try {
            if (args.length < 3) throw mkNull(args[0]);
            System.out.println("Hello".concat("there").concat("chum"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
