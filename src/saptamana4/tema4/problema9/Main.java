package saptamana4.tema4.problema9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//
//Se dau două structuri de date: un queue si un stack amblee continand numere intregi.
//Se cere sa se implementeze un program prin care la fiecare extragere a unui numar din stack, atatea elemente vor fi scoase din queue.
//Atunci cand nu mai sunt elemente rămase intr-una din structuri se va afișa care din ele a ramas empty. :)
public class Main {
	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();

		for (int i = 1; i <= 10; i++) {
			queue.add(i);
			stack.push(i * 10);
		}

		while (!stack.isEmpty() && !queue.isEmpty()) {
			int stackElement = stack.pop();
			System.out.println("Am extras din stack: " + stackElement);

			for (int i = 0; i < stackElement; i++) {
				if (!queue.isEmpty()) {
					int queueElement = queue.poll();
					System.out.println("Am extras din queue: " + queueElement);
				} else {
					System.out.println("Queue este empty!");
				}
			}
		}

		if (!stack.isEmpty()) {
			System.out.println("Stack nu este empty!");
		}
		if (!queue.isEmpty()) {
			System.out.println("Queue nu este empty!");
		}
	}
}
