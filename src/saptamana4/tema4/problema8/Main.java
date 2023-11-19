package saptamana4.tema4.problema8;

import java.util.*;

/**
 * Se da un map unde cheile sunt de tip int (atentie la int) iar valorile sunt de tip lista de int (atentie la int).
 * Fiecare element va fi o pereche de forma (int, list de int).
 * Se cere ca pentru fiecare element din map sa se afiseze cheia, si maximul din lista asociată.
 **/
public class Main {
	public static void main(String[] args) {
		Map<Integer, List<Integer>> harta = new HashMap<>();
		harta.put(1, Arrays.asList(10,11,12));
		harta.put(2, Arrays.asList(20,21,22,23,24));
		harta.put(3, Arrays.asList(30,31));

		for(Map.Entry<Integer, List<Integer>> element : harta.entrySet()){
			int cheie = element.getKey();
			List<Integer> valori = element.getValue();

			int max = Collections.max(valori);

			System.out.println("Cheia este: " + cheie + " iar maximul este: " + max);
		}
	}
}
