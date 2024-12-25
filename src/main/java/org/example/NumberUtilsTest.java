package org.example;


import org.apache.commons.lang3.math.NumberUtils;

public class NumberUtilsTest {
    public static void main(String[] args) {
        System.out.println(NumberUtils.isParsable("1L"));
        System.out.println(NumberUtils.toInt("123a", Integer.MIN_VALUE));
        System.out.println(NumberUtils.isCreatable("12.12"));
        System.out.println(NumberUtils.isParsable("12.13s"));
    }

}