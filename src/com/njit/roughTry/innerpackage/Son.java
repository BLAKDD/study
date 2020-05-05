package com.njit.roughTry.innerpackage;

public class Son extends Father{
    public static void main(String[] args) {
        //同包子类，除了private，其他都行
        Son son = new Son();
        son.defa = 1;
        System.out.println(son.defa);
    }
}
