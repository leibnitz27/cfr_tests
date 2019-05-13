package org.benf.cfr.tests;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */

public class ExceptionTest10a {
    private Profile profileManager;
    private Logger LOGGER;


    public void ensureLoggedIn() {
        Profile selectedProfile = this.profileManager.getSelectedProfile();
        UserAuthentication auth = this.profileManager.getAuthDatabase().getByUUID(selectedProfile.getPlayerUUID());
        if (auth == null) {
            this.showLoginPrompt();
        } else if (!auth.isLoggedIn()) {
            if (auth.canLogIn()) {
                try {
                    auth.logIn();

                    this.profileManager.saveProfiles();

                    this.profileManager.fireRefreshEvent();
                } catch (Exception ex) {
                    LOGGER.error("Exception whilst logging into profile", ex);
                    this.showLoginPrompt();
                }
            } else {
                this.showLoginPrompt();
            }
        } else if (!auth.canPlayOnline()) {
            try {
                LOGGER.info("Refreshing auth...");
                auth.logIn();

                this.profileManager.saveProfiles();

                this.profileManager.fireRefreshEvent();
                this.profileManager.doThat();
//            } catch (AuthenticationException ex) {
//                LOGGER.error("Exception whilst logging into profile", ex);
//                this.showLoginPrompt();
            } catch (Exception ex) {
                LOGGER.error("Exception whilst logging into profile", ex);
            }
        }

    }

    private void showLoginPrompt() {

    }

    private class Profile {
        private String playerUUID;

        public Profile getSelectedProfile() {
            return null;
        }

        public UserAuthentication getAuthDatabase() {
            return new UserAuthentication();
        }

        public String getPlayerUUID() {
            return playerUUID;
        }

        public void saveProfiles() throws IOException {
            throw new IOException();
        }

        public void fireRefreshEvent() throws AuthenticationException {
            throw new AuthenticationException();
        }

        public void doThat() throws InvalidCredentialsException {
            throw new InvalidCredentialsException();
        }
    }

    private class UserAuthentication {
        private boolean loggedIn;

        public UserAuthentication getByUUID(String uuid) {
            return new UserAuthentication();
        }

        public boolean isLoggedIn() {
            return loggedIn;
        }

        public boolean canLogIn() {
            return false;
        }

        public void logIn() {

        }

        public boolean canPlayOnline() {
            return false;
        }
    }

    private class AuthenticationException extends Exception {
    }

    private class InvalidCredentialsException extends Exception {
    }

    private class Logger {
        public void error(String s, IOException ex) {

        }

        public void error(String s, Exception ex) {

        }

        public void info(String s) {

        }
    }
}