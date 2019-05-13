package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 12/09/2013
 * Time: 15:03
 */
public class StringTest1 {
    private static final int HASHING_SEED;

    static {
        long nanos = System.nanoTime();
        long now = System.currentTimeMillis();
        int SEED_MATERIAL[] = {
                System.identityHashCode(String.class),
                System.identityHashCode(System.class),
                (int) (nanos >>> 32),
                (int) nanos,
                (int) (now >>> 32),
                (int) now,
                (int) (System.nanoTime() >>> 2)
        };

        // Use murmur3 to scramble the seeding material.
        // Inline implementation to avoid loading classes
        int h1 = 0;

        // body
        for(int k1 : SEED_MATERIAL) {
            k1 *= 0xcc9e2d51;
            k1 = (k1 << 15) | (k1 >>> 17);
            k1 *= 0x1b873593;

            h1 ^= k1;
            h1 = (h1 << 13) | (h1 >>> 19);
            h1 = h1 * 5 + 0xe6546b64;
        }

        // tail (always empty, as body is always 32-bit chunks)

        // finalization

        h1 ^= SEED_MATERIAL.length * 4;

        // finalization mix force all bits of a hash block to avalanche
        h1 ^= h1 >>> 16;
        h1 *= 0x85ebca6b;
        h1 ^= h1 >>> 13;
        h1 *= 0xc2b2ae35;
        h1 ^= h1 >>> 16;

        HASHING_SEED = h1;
    }

}

