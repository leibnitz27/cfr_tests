package org.benf.cfr.tests;

import java.net.Socket;
import java.io.IOException;

// Dimitri Gabbasov
public class UsingTest10 {

        public static boolean test() throws IOException {
            try (Socket socket1 = new Socket()) {
                try (Socket socket2 = new Socket()) {
                    return false;
                }
            }
        }

}
