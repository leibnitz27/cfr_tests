package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 18/12/2012
 * Time: 07:22
 * <p/>
 * Test that default is lifted inside the switch
 */
public class SwitchTest13 {

    public void test1(EnumTest1 e) {
        switch (e) {
            default:
                System.out.println("Nothing here but us chickens.");
        }
    }

}
