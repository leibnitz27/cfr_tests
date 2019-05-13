package org.benf.cfr.tests;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationCode
{
    String name() default "";

    Class<?> adapter() default Void.class;

    Class<?> adapter2() default void.class;

    Class<?> insertable() default float.class;

    Class<?> insertable2() default Float.class;

    boolean updatable() default true;
}