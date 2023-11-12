package com.itFactory.stack;

import java.util.Stack;

public class Exemplu4 {
    public static void main(String[] args) {

        Stack<Caine> stack = new Stack<>();

        Caine caine = new Caine("Tom");

        stack.push(new Caine("Grivei"));
        stack.push(caine);
        stack.push(new Caine("Azorel"));

        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack);






    }



}
