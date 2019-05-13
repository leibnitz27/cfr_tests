package org.benf.cfr.tests;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */

public class ExceptionTest10b {


    public void ensureLoggedIn(boolean a, boolean b) {
        if (a == b) {
            this.showLoginPrompt();
        } else if (a) {
            this.showLoginPrompt();
        } else if (b) {
            try {
                throw new AuthenticationException();
            } catch (AuthenticationException ex) {
                System.out.println("A");
                this.showLoginPrompt();
            } catch (Exception ex) {
                System.out.println("B");
            }
        }

    }

    private void showLoginPrompt() {
    }

    private class AuthenticationException extends Exception {
    }
}