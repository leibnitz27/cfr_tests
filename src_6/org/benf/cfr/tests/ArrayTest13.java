package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class ArrayTest13 {

    public void x(int a, Integer ... bs) {
    }

    public void x(int a, Integer b1, int b2) {
    }

    public void t() {
        int array[] = {1,2,3};
        int y[] = array.length == 1 ? new int[] {2,3,4} : new int[]{1,2,3};
        y = new int[]{y[2],y[1],y[0]};
        y = y;


    }

}
