package com.njit.sthTry;

public class SthTry {
    private int i;
    public class InsideOne{}
    public static void main(String[] args) {
        SthTry sthTry = new SthTry();
        System.out.println(sthTry.i);
        long a = 123L;
        System.out.println(a);
        InsideOne insideOne = sthTry.new InsideOne();
        SthTry.InsideOne insideOne1 = sthTry.new InsideOne();
    }
}
