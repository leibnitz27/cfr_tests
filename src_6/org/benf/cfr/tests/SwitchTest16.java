package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 18/12/2012
 * Time: 07:22
 * <p/>
 * Test that default is lifted inside the switch
 */
public class SwitchTest16 {

    public void test1(int x, int y) {
        switch (x) {
            default:
                System.out.println("C");
                break;
            case 0:
                System.out.println("A");
                if (x > y) {
                    System.out.println("B");
                    break;
                } else {
                    System.out.println("B2");
                }
        }
        System.out.println("D");
    }

}
