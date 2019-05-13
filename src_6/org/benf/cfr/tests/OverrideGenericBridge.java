package org.benf.cfr.tests;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 14/03/2014
 * Time: 13:53
 */
public class OverrideGenericBridge extends ArrayList<String>
{
    public String[] toArray(final String[] a) {
        final String[] array = super.toArray(a);
        array[2] = "wat";
        return array;
    }
}