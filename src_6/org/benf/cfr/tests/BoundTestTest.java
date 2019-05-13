package org.benf.cfr.tests;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoundTestTest {
    final BoundTestPart1<String, Long> f;


    public BoundTestTest() {
        f = new BoundTestImpl<Long>();
    }

}
