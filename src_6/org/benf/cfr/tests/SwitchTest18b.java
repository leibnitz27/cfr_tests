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
public class SwitchTest18b {

    public void test1(boolean b) {
        switch (b ? 1 : 0) {
            case 0:
                System.out.println("A");
                break;
            default:
                System.out.println("C");
        }
    }

}
