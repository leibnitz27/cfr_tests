package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
@AnnotationInvis
public class AnnotationTestRuntimeInvisible {

    @AnnotationInvis
    int x;

    @AnnotationInvis
    public void foo() {
        @AnnotationInvis String a = "Hello";
        System.out.println(a);
    }

}
