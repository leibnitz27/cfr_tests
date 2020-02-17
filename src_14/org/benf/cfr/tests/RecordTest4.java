package org.benf.cfr.tests;

record RecordTest4(int lo, int hi) {
public RecordTest4 {
        if (lo > hi)  /* referring here to the implicit constructor parameters */
        throw new IllegalArgumentException(String.format("(%d,%d)", lo, hi));
        }
        }