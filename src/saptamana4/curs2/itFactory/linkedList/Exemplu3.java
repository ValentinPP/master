package com.itFactory.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exemplu3 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();


        linkedList.addLast(15);
        linkedList.addLast(20);
        linkedList.addFirst(30);
        linkedList.addFirst(45);
        linkedList.add(60);
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);






    }


}
