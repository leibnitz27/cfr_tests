package org.benf.cfr.tests;

import org.benf.cfr.tests.support.Troolean;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 18/12/2012
 * Time: 07:22
 * <p/>
 * Test that default is lifted inside the switch
 */
public class SwitchTest10 {

    public void test1(char a, int b) {
        switch (a) {
            case 'a':
            case 'b':
            case 'c':
                System.out.println("a-c");
                break;
            case 'Z':
                System.out.println("Z");
                break;
        }
    }

}
