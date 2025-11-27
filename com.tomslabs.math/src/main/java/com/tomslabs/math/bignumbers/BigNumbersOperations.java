package com.tomslabs.math.bignumbers;

import java.math.BigInteger;

public class BigNumbersOperations {
    public static BigInteger add(BigInteger a, BigInteger b)
    {
        return a.add(b);
    }

    public static BigInteger subtract(BigInteger a, BigInteger b)
    {
        return a.subtract(b);
    }

    private String secretMessage()
    {
        return "This is a secret message, how did you obtain it?";
    }
}
