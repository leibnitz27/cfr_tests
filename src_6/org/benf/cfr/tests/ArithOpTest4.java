package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class ArithOpTest4 {
     public void test1(long l) {
         if (l > Long.MAX_VALUE) {
             System.out.println("BIG");
         }
         if (l == Long.MAX_VALUE) {
             System.out.println("BIG");
         }
    }



}
