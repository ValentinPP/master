package saptamana4.curs2.linkList;

import java.util.LinkedList;
import java.util.Queue;

public class Ex2 {
	public static void main(String[] args) {

		Queue<Integer> linkList = new LinkedList<>();

		linkList.add(5);
		linkList.add(6);
		linkList.add(20);
		linkList.add(15);

		System.out.println("cu poll " + linkList.poll()); // extrage primul din lista , il sterge si il returneza
		System.out.println("fara poll " + linkList + "\n");

		System.out.println(linkList.peek() + "cu peek"); //estrage dar nu sterge
		System.out.println("fara peek " + linkList + "\n");




	}
}
