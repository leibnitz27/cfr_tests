package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 18/12/2012
 * Time: 07:22
 * <p/>
 * Test that default is lifted inside the switch
 */
public class SwitchTest15 {

    public void test1(int x, int y) {
        switch (x) {
            case 0:
                System.out.println("A");
                if (x > y) {
                    System.out.println("B");
                } else {
                    break;
                }
            default:
                System.out.println("C");
        }
        System.out.println("D");
    }

}
