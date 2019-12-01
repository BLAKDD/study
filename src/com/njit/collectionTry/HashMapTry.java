package com.njit.collectionTry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTry {
    public static void main(String[] args) {
        MyEntity myEntity1 = new MyEntity();
        MyEntity myEntity2 = new MyEntity(1);
        MyEntity myEntity3 = new MyEntity(2,1);
        MyEntity myEntity4 = new MyEntity(2);
        MyEntity myEntity5 = new MyEntity();
        myEntity5.setCode(1);
        Map<MyEntity,Integer> map = new HashMap<>();

        map.put(myEntity1,0);
        map.put(myEntity2,1);
        map.put(myEntity3,2);
        map.put(myEntity4,2);
        map.put(myEntity5,3);
        Set<Map.Entry<MyEntity,Integer>> entrySet = map.entrySet();
        for (Map.Entry e:entrySet
             ) {
            System.out.println("key:"+e.getKey()+"  value:"+e.getValue());
        }
        System.out.println(map);
        System.out.println(Math.floor(-10.9));
    }
}