package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
@AnnotationVisible
public class AnnotationTestRuntimeVisible {

    @AnnotationVisible
    int x;

    @AnnotationVisible
    public void foo() {
        // Does this even mean anything?
        @AnnotationVisible String a = "Hello";
        System.out.println(a);
    }

}
