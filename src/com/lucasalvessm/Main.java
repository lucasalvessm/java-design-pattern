package com.lucasalvessm;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class Main {

    public static void main(String[] args) {

        String pattern = "HH.mm.ss.SSS";
        System.out.println(new SimpleDateFormat(pattern).format(new Date()));
        int intSize = 75555555;
        double[] ints = new double[intSize];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Math.random();
        }
        System.out.println(new SimpleDateFormat(pattern).format(new Date()));


        System.out.println(new SimpleDateFormat(pattern).format(new Date()));
        double[] ints2 = new double[intSize];
        Arrays.stream(ints2).forEach(inte -> inte = Math.random());
        System.out.println(new SimpleDateFormat(pattern).format(new Date()));


    }
}
