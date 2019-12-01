package com.njit.sthTry;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class equalsTry {
    public String s = "abc";

    public static void main(String[] args) {
        equalsTry ess = new equalsTry();

        equalsTry ess2 = new equalsTry();

        System.out.println(ess.s == ess2.s);

        Integer a[] = {1,2,3};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
        list.add(4);
        System.out.println(list);
    }
}
