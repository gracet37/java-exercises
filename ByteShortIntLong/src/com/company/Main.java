package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10_000;
        int myMaxValue = Integer.MAX_VALUE;
        int myMinValue = Integer.MIN_VALUE;

        System.out.println(myMaxValue);

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;

        System.out.println(maxByteValue);
        System.out.println(minByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;

        short myShort = 1000;

        System.out.println(maxShortValue);
        System.out.println(minShortValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;

        System.out.println(maxLongValue);
        System.out.println(minLongValue);

        long myLong = 100L;
    }
}
