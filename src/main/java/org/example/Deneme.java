package org.example;

import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deneme {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));

        List<String> a = ObjectUtils.clone(list);
        System.out.println(a);
    }
}
