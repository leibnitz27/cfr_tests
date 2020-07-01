package org.benf.cfr.tests;


class AssertTest21 {

    private static boolean absolutelyVitalFunction(int x) {
        System.out.println("Disable the reactor");
        return true;
    }

    private static boolean checkCheeseSupply() {
        System.out.println("We've got cheese");
        return true;
    }

    public static void stopTheMeltdown(Integer x) {
        if (absolutelyVitalFunction(x)) {
            assert (checkCheeseSupply());
        }
    }
}