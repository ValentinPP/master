package saptamana4.curs2.stack;

import java.util.Stack;

public class Ex4 {
	public static void main(String[] args) {
		Stack<Caine> stack = new Stack<>();

		Caine caine = new Caine("Azorel");
		stack.push(new Caine("Grivei"));
		stack.push(caine);
		stack.push(new Caine("Tom"));

		System.out.println(stack + "\n");
		System.out.println(stack.pop()+ "\n");
		System.out.println(stack+ "\n");
		System.out.println(stack.peek() + "\n");
	}
}
