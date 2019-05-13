package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 18/12/2012
 * Time: 07:22
 * <p/>
 * Test that default is lifted inside the switch
 */
public class SwitchTest11 {

    public void test1(char a, int b) {
        switch (a) {
            case 'a':
            case 'b':
            case 'c':
                System.out.println("a-c");
                break;
            case 'Z':
                while (b < 10) {
                    System.out.println("Z");
                    b++;
                }
                break;
        }
    }

}
