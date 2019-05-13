package org.benf.cfr.tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 15/04/2011
 * Time: 18:05
 * To change this template use File | Settings | File Templates.
 */
public class LongTest2 {

    public static void main(String[] args) {
        String s = "sdfsdf/ sdf/f/sfs/ddfd_34343.wsxml";
        Pattern p= Pattern.compile("^.*_(\\d+)\\.wsxml$");
        Matcher m = p.matcher(s);
        System.out.println(m.matches());
        System.out.println(m.group(1));
    }
}
