package saptamana4.curs1.list;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
	public static void main(String[] args) {
		ArrayList<Integer> lista1 = new ArrayList<>();

		lista1.add(1);
		lista1.add(2);
		lista1.add(50);

		if (!lista1.isEmpty()) {
			for (Integer element : lista1) {
				System.out.println(element);
			}
		}

		System.out.println(lista1);
		System.out.println(lista1.size());

		lista1.stream().forEach(element -> System.out.println("Stream cu functie lambda" + element));

		lista1.add(2, 253); // modificare element la indexul 2

		System.out.println("\n Elementul de pe indexul e este: " + lista1.get(2) + " elementul de pe indexul 2");

		for (int i = 0; i < lista1.size(); i++) {
			System.out.println("New lista " + lista1.get(i));
		}

		List<Integer> lista2 = new ArrayList<>();

		lista2.add(300);
		lista2.add(300);
		lista2.add(300);
		lista2.add(300);

		lista1.addAll(lista2);

		System.out.println("******************");

		for (Integer x : lista1) {
			System.out.println(x);
		}
		System.out.println("///////////////////////");

		if (lista1.size() > 0) {
			System.out.println(lista1.get(lista1.size() - 1)); // printeaza ultimul element gasit dupa index din lista1
			System.out.println(lista1.get(3)); //printeaza elementul din lista potrivit indexului
		}
	}
}
