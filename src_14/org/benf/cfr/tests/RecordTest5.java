package org.benf.cfr.tests;

record RecordTest5(int lo, int hi) {
        public int lo() {
        return this.lo + 1;
        }

protected int lo(int x) {
        return this.lo + x;
        }

private int lo2() {
        return this.lo + 2;
        }

}