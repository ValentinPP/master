package com.itFactory.linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Exemplu2 {
    public static void main(String[] args) {

        Queue<Integer> linkedList = new LinkedList<>();

        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(20);
        linkedList.add(15);

        System.out.println(linkedList.poll()); //extrage din lista, il sterge si il returneaza;
        System.out.println(linkedList);
        System.out.println("----------------");
        System.out.println(linkedList.peek());
        System.out.println(linkedList);




    }

}
