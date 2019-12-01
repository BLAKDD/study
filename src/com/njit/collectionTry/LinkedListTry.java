package com.njit.collectionTry;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class LinkedListTry {
    public void GoThroughTry(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0;i<100000;i++)
        {
            linkedList.add(i);
        }
        long start,total;
        start = System.currentTimeMillis();
        for (Integer i: linkedList) {

        }
        total = System.currentTimeMillis()-start;
        System.out.println("foreach遍历十万次使用时间："+total+"ms");

        start = System.currentTimeMillis();
        for (Iterator iterator = linkedList.iterator();iterator.hasNext();)
        {
            iterator.next();
        }
        total = System.currentTimeMillis()-start;
        System.out.println("Iter遍历十万次使用时间："+total+"ms");

        start = System.currentTimeMillis();
        for (int i =0;i<linkedList.size();i++) {
            linkedList.get(i);
        }
        total = System.currentTimeMillis()-start;
        System.out.println("for遍历十万次使用时间："+total+"ms");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        MyEntity myEntity1 = new MyEntity(1);
        MyEntity myEntity2 = new MyEntity(2);
        MyEntity myEntity3 = new MyEntity(3);
        MyEntity myEntity4 = new MyEntity(4);
        MyEntity myEntity5 = new MyEntity(5);
        myEntity5.setCode(1);
        LinkedList<MyEntity> linkedList = new LinkedList<>();
        linkedList.add(myEntity1);
        linkedList.add(myEntity2);
        linkedList.add(myEntity3);
        linkedList.add(myEntity4);
        linkedList.add(myEntity5);
        linkedList.add((MyEntity)myEntity1.clone());
        myEntity1.setKey(6);
//        MyEntity myEntity6 = new MyEntity(1);
//        linkedList.remove(myEntity6);
        for (MyEntity m:linkedList) {
            System.out.println(m);
        }
    }
}
