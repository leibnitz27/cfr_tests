package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 12/02/2014
 * Time: 17:56
 */
public class PrecedenceTest11 {

    public boolean test1(boolean x, boolean y, boolean z) {
        return x && y && z;
    }

    public boolean test2(boolean x, boolean y, boolean z) {
        return x && y || z;
    }

    public boolean test3(boolean x, boolean y, boolean z) {
        return x && ( y || z );
    }

    public boolean test4(boolean x, boolean y, boolean z) {
        return (x && y )|| z ;
    }

    public boolean test5(boolean x, boolean y, boolean z) {
        return x && (y||x) && z;
    }

    public boolean test6(boolean x, boolean y, boolean z) {
        return x && y || x && z ;
    }

    public boolean test7(boolean x, boolean y, boolean z) {
        return x || (y&&x) || z;
    }

    public boolean test8(boolean x, boolean y, boolean z) {
        return x || y && x || z ;
    }

    public boolean test9(boolean x, boolean y, boolean z) {
        return (x || y) && (x || z) ;
    }

    public boolean test10(boolean x, boolean y, boolean z) {
        return (x && x && x) && (y && y && y) || (z && z && z) ;
    }

}
