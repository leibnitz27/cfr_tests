package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class ConstructorChainTest3 extends ConstructorChainTest1 {

    public ConstructorChainTest3(int x, int y) {
        super(x, y);
    }

    public ConstructorChainTest3(int x) {
        this(3, 4);
        new ConstructorChainTest3(3,4);
    }
}
