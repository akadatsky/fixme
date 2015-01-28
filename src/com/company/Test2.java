package com.company;

import java.util.Arrays;
import java.util.Random;

public class Test2 {

    public static void test() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            Random rand = new Random();
            arr[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("average: " + average(arr));
    }

    private static double average(int... args) {
        byte sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum / args.length;
    }

}
