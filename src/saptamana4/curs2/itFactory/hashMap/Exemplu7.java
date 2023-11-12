package com.itFactory.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Exemplu7 {

    public static void main(String[] args) {


        Map<String, Pisica> map = new HashMap<>();


        map.put("pisica6", new Pisica("Tom"));
        map.put("lalalalala", new Pisica("Tomitza"));

        System.out.println(map);




        Map<String, String> map2 = new HashMap<>();

        map2.put("ex1", "ceva");
        map2.put("ex8", "altceva");
        map2.put("hihih", "nimic");




    }


}
