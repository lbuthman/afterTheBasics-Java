package com.afterthebasics.main.exercise01;

import java.math.BigInteger;

public class SpecializedCalculator {

    public static int additivePersistence(BigInteger num, int radix) {
        if (num.compareTo(BigInteger.ZERO) < 0 || radix < 2) throw new IllegalArgumentException();
        BigInteger biRadix = BigInteger.valueOf(radix);
        int count;
        for (count = 0; num.compareTo(biRadix) >= 0; ++count) {
            BigInteger sum = BigInteger.ZERO;
            while (num.compareTo(BigInteger.ZERO) > 0) {
                sum = sum.add(num.mod(biRadix));
                num = num.divide(biRadix);
            }
            num = sum;
        }
        return count;
    }
}
