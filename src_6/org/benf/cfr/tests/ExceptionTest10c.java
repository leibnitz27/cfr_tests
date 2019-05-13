package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */

public abstract class ExceptionTest10c {


    public void ensureLoggedIn(boolean a, boolean b) {
        if (a == b) {
            this.showLoginPrompt();
        } else if (a) {
            this.showLoginPrompt();
        } else if (b) {
            try {
                test();
            } catch (IllegalArgumentException ex) {
                System.out.println("A");
                this.showLoginPrompt();
            } catch (Exception ex) {
                System.out.println("B");
            }
        }

    }

    private void showLoginPrompt() {
    }

    abstract void test();
}