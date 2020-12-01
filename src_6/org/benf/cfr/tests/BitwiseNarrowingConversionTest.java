package org.benf.cfr.tests;

class BitwiseNarrowingConversionTest {
    class And {
        int byteAnd0() {
            int b = 0;
            b = (byte) (b & 0);

            return b;
        }

        int shortAnd0() {
            int b = 0;
            b = (short) (b & 0);

            return b;
        }

        int charAnd0() {
            int b = 0;
            b = (char) (b & 0);

            return b;
        }

        long intAnd0() {
            long b = 0;
            b = (int) (b & 0);

            return b;
        }

        int byteAnd1() {
            int b = 0;
            b = (byte) (b & 1);

            return b;
        }

        int shortAnd1() {
            int b = 0;
            b = (short) (b & 1);

            return b;
        }

        int charAnd1() {
            int b = 0;
            b = (char) (b & 1);

            return b;
        }

        long intAnd1() {
            long b = 0;
            b = (int) (b & 1);

            return b;
        }
    }

    class CompoundAnd {
        int byteCompoundAnd0() {
            byte b = 0;
            b &= 0;

            return b;
        }

        int shortCompoundAnd0() {
            short b = 0;
            b &= 0;

            return b;
        }

        int charCompoundAnd0() {
            char b = 0;
            b &= 0;

            return b;
        }

        long intCompoundAnd0() {
            int b = 0;
            b &= 0;

            return b;
        }

        int byteCompoundAnd1() {
            byte b = 0;
            b &= 1;

            return b;
        }

        int shortCompoundAnd1() {
            short b = 0;
            b &= 1;

            return b;
        }

        int charCompoundAnd1() {
            char b = 0;
            b &= 1;

            return b;
        }

        long intCompoundAnd1() {
            int b = 0;
            b &= 1;

            return b;
        }
    }

    class Or {
        int byteOr0() {
            int b = 0;
            b = (byte) (b | 0);

            return b;
        }

        int shortOr0() {
            int b = 0;
            b = (short) (b | 0);

            return b;
        }

        int charOr0() {
            int b = 0;
            b = (char) (b | 0);

            return b;
        }

        long intOr0() {
            long b = 0;
            b = (int) (b | 0);

            return b;
        }

        int byteOr1() {
            int b = 0;
            b = (byte) (b | 1);

            return b;
        }

        int shortOr1() {
            int b = 0;
            b = (short) (b | 1);

            return b;
        }

        int charOr1() {
            int b = 0;
            b = (char) (b | 1);

            return b;
        }

        long intOr1() {
            long b = 0;
            b = (int) (b | 1);

            return b;
        }
    }

    class CompoundOr {
        int byteCompoundOr0() {
            byte b = 0;
            b |= 0;

            return b;
        }

        int shortCompoundOr0() {
            short b = 0;
            b |= 0;

            return b;
        }

        int charCompoundOr0() {
            char b = 0;
            b |= 0;

            return b;
        }

        long intCompoundOr0() {
            int b = 0;
            b |= 0;

            return b;
        }

        int byteCompoundOr1() {
            byte b = 0;
            b |= 1;

            return b;
        }

        int shortCompoundOr1() {
            short b = 0;
            b |= 1;

            return b;
        }

        int charCompoundOr1() {
            char b = 0;
            b |= 1;

            return b;
        }

        long intCompoundOr1() {
            int b = 0;
            b |= 1;

            return b;
        }
    }

    class Xor {
        int byteXor0() {
            int b = 0;
            b = (byte) (b ^ 0);

            return b;
        }

        int shortXor0() {
            int b = 0;
            b = (short) (b ^ 0);

            return b;
        }

        int charXor0() {
            int b = 0;
            b = (char) (b ^ 0);

            return b;
        }

        long intXor0() {
            long b = 0;
            b = (int) (b ^ 0);

            return b;
        }

        int byteXor1() {
            int b = 0;
            b = (byte) (b ^ 1);

            return b;
        }

        int shortXor1() {
            int b = 0;
            b = (short) (b ^ 1);

            return b;
        }

        int charXor1() {
            int b = 0;
            b = (char) (b ^ 1);

            return b;
        }

        long intXor1() {
            long b = 0;
            b = (int) (b ^ 1);

            return b;
        }
    }

    class CompoundXor {
        int byteCompoundXor0() {
            byte b = 0;
            b ^= 0;

            return b;
        }

        int shortCompoundXor0() {
            short b = 0;
            b ^= 0;

            return b;
        }

        int charCompoundXor0() {
            char b = 0;
            b ^= 0;

            return b;
        }

        long intCompoundXor0() {
            int b = 0;
            b ^= 0;

            return b;
        }

        int byteCompoundXor1() {
            byte b = 0;
            b ^= 1;

            return b;
        }

        int shortCompoundXor1() {
            short b = 0;
            b ^= 1;

            return b;
        }

        int charCompoundXor1() {
            char b = 0;
            b ^= 1;

            return b;
        }

        long intCompoundXor1() {
            int b = 0;
            b ^= 1;

            return b;
        }
    }

    class Complement {
        int byteComplement() {
            int b = 0;
            b = (byte) ~b;

            return b;
        }

        int shortComplement() {
            int b = 0;
            b = (short) ~b;

            return b;
        }

        int charComplement() {
            int b = 0;
            b = (char) ~b;

            return b;
        }

        long intComplement() {
            long b = 0;
            b = (int) ~b;

            return b;
        }
    }
}
