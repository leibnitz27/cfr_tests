package org.benf.cfr.tests;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 21/08/2013
 * Time: 14:01
 */
public interface LambdaFunctionalKeyListener extends KeyListener {
    public default void keyPressed(KeyEvent event) {}
    public default void keyTyped(KeyEvent event) {}
    public default void keyReleased(KeyEvent event) {}

    @FunctionalInterface
    public static interface Pressed extends LambdaFunctionalKeyListener {
        public void keyPressed(KeyEvent event);
    }

    @FunctionalInterface
    public static interface Typed extends LambdaFunctionalKeyListener {
        public void keyTyped(KeyEvent event);
    }

    @FunctionalInterface
    public static interface Released extends LambdaFunctionalKeyListener {
        public void keyReleased(KeyEvent event);
    }
}