package org.benf.cfr.tests;


import org.benf.cfr.tests.support.Nullable;

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
@Target({java.lang.annotation.ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationTest2
{
    String name() default "";

    Class<?> adapter() default Void.class;

    Class<?> adapter2() default void.class;

    Class<?> insertable() default float.class;

    Class<?> insertable2() default Float.class;

    boolean updatable() default true;
}