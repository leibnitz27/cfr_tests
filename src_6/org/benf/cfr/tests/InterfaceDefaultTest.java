package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/02/2013
 * Time: 17:44
 */
public @interface InterfaceDefaultTest {
    public boolean ignoreCancelled() default false;
    public int andThis() default 0;
}
