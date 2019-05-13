package org.benf.cfr.tests;

import java.lang.management.MemoryType;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class EnumSwitchTest3 {
    public void test(MemoryType m) {
        switch (m) {
            case HEAP:
                System.out.println("HEAP");
                break;
            case NON_HEAP:
                System.out.println("NON");
                break;
            default:
                System.out.println("WAH?");
        }
    }
}
