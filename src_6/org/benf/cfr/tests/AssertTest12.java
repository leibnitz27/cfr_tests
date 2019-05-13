package org.benf.cfr.tests;

// from roland illig

public class AssertTest12 {

    public void t1(int first, int second) {
        assert first < second;
        assert second == 0 || first < second && second < 10;
    }

}
