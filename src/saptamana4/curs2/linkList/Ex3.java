package saptamana4.curs2.linkList;

import java.util.LinkedList;
import java.util.List;

public class Ex3 {
	public static void main(String[] args) {
		List<Integer> linkedlist = new LinkedList<>();
		//List<Integer> linkedlist = new ArrayList<>();

		linkedlist.addLast(15);
		linkedlist.addLast(20);
		linkedlist.addFirst(1);
		linkedlist.addFirst(3);
		linkedlist.add(5);

		System.out.println(linkedlist + " original");

		linkedlist.removeFirst();
		linkedlist.removeLast();

		System.out.println(linkedlist + " sters prima si ultima");

	}
}
