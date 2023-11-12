package com.itFactory.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Exemplu5 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("ionel");
        set.add("marcel");
        set.add("costel");
        set.add("costel");

        System.out.println(set);

        List<String> list = new ArrayList<>();
        list.add("ionel");
        list.add("marcel");
        list.add("costel");
        list.add("costel");

        System.out.println(list);

        set.isEmpty();

        System.out.println(set.size());

        for(int i = 0; i < set.size(); i++){
            list.get(i);
        }

        for(String s : set){
            System.out.println(s);
        }

     //   set.forEach(s -> System.out.println(s));












    }

}
