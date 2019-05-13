package org.benf.cfr.tests;

import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 21/08/2013
 * Time: 14:03
 */
public interface LambdaFunctionalWindowListener extends WindowListener {
    public default void windowClosing(WindowEvent event) {}
    public default void windowActivated(WindowEvent event) {}
    public default void windowClosed(WindowEvent event) {}
    public default void windowDeactivated(WindowEvent event) {}
    public default void windowIconified(WindowEvent event) {}
    public default void windowDeiconified(WindowEvent event) {}
    public default void windowOpened(WindowEvent event) {}

    @FunctionalInterface
    public static interface Closing extends LambdaFunctionalWindowListener {
        public void windowClosing(WindowEvent event);
    }
}