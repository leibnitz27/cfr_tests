package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class TryTest7 {

    public void functionWhichMightThrow() {
    }

    public void foo()  {
        try {
            try {
                try {
        try {
            try {
                functionWhichMightThrow();
                System.out.println("Fred");
            } catch (Exception e) {
            }
        } catch (Exception e) {}
    } catch (Exception e) {}
} catch (Exception e) {}
        } catch (Exception e) {}
        System.out.println("Jim");
    }
}
