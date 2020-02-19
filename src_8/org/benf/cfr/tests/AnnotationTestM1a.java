package org.benf.cfr.tests;

import java.util.List;

class AnnotationTestM1a {

    public @MyField @MyParam int field;

    public @MyField @MyParam List<@MyParam2 Integer> field2;
}