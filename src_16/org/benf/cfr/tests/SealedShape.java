package org.benf.cfr.tests;

public abstract sealed class SealedShape
    permits SealedCircle, SealedRectangle, SealedSquare {
}
