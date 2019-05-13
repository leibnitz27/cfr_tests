package org.benf.cfr.tests;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class LoaderGoBang {
    private final ClassLoader platformClassLoader;
    {
        ClassLoader cl;
        for(cl = ClassLoader.getSystemClassLoader(); cl.getParent() != null; cl = cl.getParent());
        platformClassLoader = cl;
    }

    public static void main(String ... args) {
        try {
            new LoaderGoBang().getContentByFromReflectedClass("javafx/scene/control/ContextMenu.class");
        } catch (Exception e) {
            // Never caught under J9+ due to fault when static initialising ContextMenu
            System.out.println("Caught");
        }
    }

    private byte[] getContentByFromReflectedClass(String inputPath) {
        URL url = platformClassLoader.getResource(inputPath);
        if(url == null)
            return null;
        return getUrlContent(url);
    }


    private byte[] getUrlContent(URL url) {
        String protocol = url.getProtocol();
        // Strictly speaking, we could use this mechanism for pre-9 classes, but it's.... so wrong!
        if (!protocol.equals("jrt")) return null;

        InputStream is;
        int len = -1;
        try {
            URLConnection uc;
            uc = url.openConnection();
            uc.connect();
            is = uc.getInputStream();
            len = uc.getContentLength();
        } catch (IOException ioe) {
            return null;
        }

        try {
            if (len >= 0) {
                byte[] b = new byte[len];
                int i = len;
                while (i > 0) {
                    if (i < (i -= is.read(b, len - i, i))) i = -1;
                }
                if (i == 0) return b;
            }
        } catch (IOException e) {
            //
        }
        return null;
    }
}
