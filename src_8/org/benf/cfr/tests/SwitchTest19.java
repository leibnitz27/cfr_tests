package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 18/12/2012
 * Time: 07:22
 * <p/>
 * Test that literal 1/0 switches don't get treated as boolean
 * Abe Crannaford
 */
public class SwitchTest19 {

    public String test1(String s) {
        int x;
        if (s.contains("ABC")) {
            switch (s) {
                case "A":
                    x = 1;
                    break;
                case "B":
                    x = 2;
                    break;
                case "C":
                    x = 3;
                    break;
                default:
                    throw new AssertionError("FOO");
            }
        } else {
            x = 3;
        }
        return Integer.toBinaryString(x);
    }

}
