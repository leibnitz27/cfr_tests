package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class AnnotationTestCode3 {

    public void foo() {
        @AnnotationCode2(name="fred") @AnnotationCode(name="fred") String  @AnnotationCode(name="jim") [] @AnnotationCode(name="bob") [] a = new String[1][1];
        System.out.println(a);
    }

}
