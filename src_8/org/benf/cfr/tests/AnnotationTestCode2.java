package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class AnnotationTestCode2 {

    public void foo() {
        @AnnotationCode(name="fred") String[][] a = new String[1][1];
        String @AnnotationCode(name="jim") [][] b = new String[1][1];
        String []@AnnotationCode(name="bob") [] c = new String[1][1];
        System.out.println(a);
    }

}
