package org.benf.cfr.tests;

import java.net.URL;

public class Java9Test2 {
    public static void main(String ... args) {
        URL url = Object.class.getResource("Object.class");
        System.out.println(url);
                
    }
}
