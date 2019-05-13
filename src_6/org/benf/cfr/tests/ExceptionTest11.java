package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */

public abstract class ExceptionTest11 {

    public String test(boolean b, String in) {
        String classFile;
        if (b) {
            classFile = "TEST";
        } else {
            try {
                classFile = getName();
            } catch (RuntimeException e) {
                // We can't load the lambda target - we can't really make any assumptions about what it will do.
                return in;
            }
        }
        if (classFile == null) {
            return in;
        }
        return classFile;
    }

    abstract String getName();
}