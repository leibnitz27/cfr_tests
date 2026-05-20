package org.benf.cfr.tests;

public class CloneableTest implements Cloneable {

    private int[] data;
    private String label;

    public CloneableTest(int[] data, String label) {
        this.data = data;
        this.label = label;
    }

    @Override
    public CloneableTest clone() {
        try {
            CloneableTest copy = (CloneableTest) super.clone();
            copy.data = data.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
