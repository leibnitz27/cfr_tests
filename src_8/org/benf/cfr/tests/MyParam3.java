package org.benf.cfr.tests;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.CLASS;

@Retention(CLASS)
@Target({ElementType.TYPE_USE, ElementType.PARAMETER, ElementType.TYPE_PARAMETER})
@interface MyParam3 { }

