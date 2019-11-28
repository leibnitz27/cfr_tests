package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class AnnotationTestRuntimeInvisibleEvil {

    @AnnotationInvis
    int x;

    public static void main(String ... args) {
        System.out.println("Hello");
    }
}
