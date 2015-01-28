package com.company;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

    public static void test() {

        List<Integer> list1to10 = new ArrayList<Integer>() {{
            for (int i = 1; i <= 10; i++) {
                add(i);
            }
        }};
        System.out.println(list1to10);

        List<Integer> list1to5 = list1to10.subList(0, 5);
        System.out.println(list1to5);

        int s1 = sumAndClear(list1to5);
        System.out.println(s1);

        int s2 = sumAndClear(list1to10);
        System.out.println(s2);
    }

    private static int sumAndClear(List<Integer> list) {
        int sum = 0;
        for (Integer tmp : list) {
            sum += tmp;
        }
        list.clear();
        return sum;
    }

}
