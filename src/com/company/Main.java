package com.company;

public class Main {

    public static void main(String[] args) {

        // Int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8, must between -128 and 127
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16, max is 32767, min is 32768
        short myShortValue = 32767;

        // long has a width of 64
        long myLongValue = 100L;
    }
}
