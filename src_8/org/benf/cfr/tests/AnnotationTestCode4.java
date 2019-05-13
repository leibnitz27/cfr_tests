package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class AnnotationTestCode4 {

    public void foo() {
        String[][] x = new @AnnotationCode(name="fred") String  @AnnotationCode(name="jim") [1] @AnnotationCode(name="bob") [1];
        System.out.println(x);
    }

}
