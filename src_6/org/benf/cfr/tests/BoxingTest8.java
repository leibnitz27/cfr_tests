package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest8 {
    private boolean t(Integer i, int j, Integer k) {
        switch (i) {
            case 1:
                break;
            case 2:
            case 3:
                System.out.println(k);
            case 4:
                System.out.println(i.hashCode());
            default:
                k = i;
        }
        System.out.println("X");
        return false;
    }


}
