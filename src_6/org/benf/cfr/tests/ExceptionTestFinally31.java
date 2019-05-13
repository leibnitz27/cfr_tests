package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 10/03/2014
 * Time: 17:11
 */
public class ExceptionTestFinally31 {
    public int foo(int x) {
        try {
            System.out.println(1);
        } catch (Exception e) {
        }

        try {
            switch (x) {
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
            }
        } finally {
            return 1;
        }

    }
}
