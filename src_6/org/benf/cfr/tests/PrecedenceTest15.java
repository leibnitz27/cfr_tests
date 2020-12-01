package org.benf.cfr.tests;

class PrecedenceTest15 {
    int testAll(int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, boolean b6, boolean b7) {
        return
            ~((((((Boolean) (((((((((b1 ? (i1 += i2 -= i3 *= i4 /= i5 %= i6 &= i7 ^= i8 |= i9 <<= i10 >>= i11 >>>= i12) == 0
            : b2) || b3) && b4) | b5) ^ b6) & b7) == b1 ? 1 : 2) < 2) == b2)) instanceof Object ? 1 : 2) << 2) + 1) * 2);
            
    }
    
    void use(int i) { }
    void use(boolean b) { }
    
    /*
     * Test all operators against one with the next higher precedence
     */
    
    int testAssignOp(boolean b1, boolean b2, int i) {
        use((b1 = b2) ? 1 : (i = 1));
        use(b1 ? 1 : (i += 2));
        use(b1 ? 1 : (i -= 2));
        use(b1 ? 1 : (i *= 1));
        use(b1 ? 1 : (i /= 1));
        use(b1 ? 1 : (i %= 1));
        use((b1 &= b2) ? 1 : (i &= 1));
        use((b1 ^= b2) ? 1 : (i ^= 1));
        use((b1 |= b2) ? 1 : (i |= 1));
        use(b1 ? 1 : (i <<= 3));
        use(b1 ? 1 : (i >>= 3));
        use(b1 ? 1 : (i >>>= 3));
        
        return i;
    }
    
    boolean testTernary(boolean b1, boolean b2, boolean b3) {
        use(b3 || (b1 ? b2 : b3));
        return (b1 ? b2 : b3) || (b3 ? b1 : b2);
    }
    
    boolean testLogicalOr(boolean b1, boolean b2, boolean b3) {
        use(b1 && (b2 || b3));
        return (b1 || b2) && (b2 || b3);
    }
    
    boolean testLogicalAnd(boolean b1, boolean b2, boolean b3) {
        use(b1 | (b2 && b3));
        return (b1 && b2) | (b2 && b3);
    }
    
    int testBitOr(int i1, int i2, int i3) {
        return (i1 | i2) ^ (i2 | i3);
    }
    
    int testBitXor(int i1, int i2, int i3) {
        return (i1 ^ i2) & (i2 ^ i3);
    }
    
    void testBitAnd(int i1, int i2, int i3) {
        use((i1 & i2) == (i2 & i3));
        // Also check against relational because they cannot be checked
        // for equality operator because its result is boolean
        use((i1 & i2) < (i2 & i3));
    }
    
    void testEquality(boolean b1, boolean b2) {
        // Result of equality check is boolean so first operator against
        // which precedence can be checked is unary 'not'
        use(!(b1 == b2));
        use(!(b1 != b2));
    }
    
    // Use float so unary 'not' cannot be dropped due to Float.NaN
    void testRelational(float f1, float f2, Boolean b) {
        // Result of relational operation is boolean so first operator
        // against which precedence can be checked is unary 'not'
        use(!(f1 < f2));
        use(!(f1 > f2));
        use(!(f1 <= f2));
        use(!(f1 >= f2));
        
        use(!(b instanceof Boolean));
    }
    
    void testShift(int i1, int i2) {
        use((i1 << i2) + (i1 << i2));
        use((i1 >> i2) + (i1 >> i2));
        use((i1 >>> i2) + (i1 >>> i2));
    }
    
    void testAdditive(int i1, int i2) {
        use((i1 + 1) * (i1 + i2));
        use((i1 - 1) * (i1 - i2));
    }
    
    void testMultiplicative(int i1, int i2) {
        use(~(i1 * i2));
        use(~(i1 / i2));
        use(~(i1 % i2));
    }
    
    // Cannot test unary operators because postfix (higher precedence) requires variable
}
