package com.itFactory.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Exemplu6 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Gigel");
        map.put(2, "Ana");
        map.put(3, "Ioana");
        map.put(-8, "Viorica");
        map.put(5, "Andrei");
       // map.put(5, "Vasile");

        System.out.println(map);

        for(Integer i: map.keySet()){
            System.out.println("Gheia este: " + i + " are valoarea: " + map.get(i));
        }

        map.isEmpty();
        map.size();
        System.out.println(map.size());




        System.out.println(map.get(5));


    }



}
