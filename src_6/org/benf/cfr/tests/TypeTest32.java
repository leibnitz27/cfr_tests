package org.benf.cfr.tests;

import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 12/09/2013
 * Time: 07:37
 */
public class TypeTest32 {
    char [] value;

    public void split(String regex, int limit) {
        /* fastpath if the regex is a
         (1)one-char String and this character is not one of the
            RegEx's meta characters ".$|()[{^?*+\\", or
         (2)two-char String and the first char is the backslash and
            the second is not the ascii digit or ascii letter.
         */
        char ch = 0;
        if ((((((ch = regex.charAt(1))-'0')|('9'-ch)) < 0 && ch > Character.MAX_LOW_SURROGATE)))
        {
            System.out.println("foo");
        }
    }

}
