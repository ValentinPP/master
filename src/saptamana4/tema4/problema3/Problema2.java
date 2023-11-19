package saptamana4.tema4.problema3;

import java.util.*;

//Se da o lista de String-uri aleatoriu (construiți voi lista).
// Se cere sa se afișeze string-ul cu cea mai mare lungime.
// Dacă sunt mai multe string-uri cu aceeași lungime maxima se vor afișa toate.
public class Problema2 {
	public static void main(String[] args) {
		List<String> listaStringuri = new ArrayList<>();

		listaStringuri.add("Bine");
		listaStringuri.add("ati");
		listaStringuri.add("venit");
		listaStringuri.add("la");
		listaStringuri.add("cursul");
		listaStringuri.add("de");
		listaStringuri.add("JAVA");
		listaStringuri.add("unde");
		listaStringuri.add("vom");
		listaStringuri.add("invata");
		listaStringuri.add("cum");
		listaStringuri.add("sa");
		listaStringuri.add("editam");
		listaStringuri.add("stringuri");

		System.out.println("Lista de stringuri introduse initial este: " + listaStringuri);

		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Introduceti un numar de stringuri cu [spatiu] intre ele si apasati ENTER!");
		String insertedWords = keyboardInput.nextLine();

		listaStringuri.addAll(Arrays.asList(insertedWords.split(" ")));

		System.out.println("Noua lista de stringuri inclusiv keyboardInserted contine: " + listaStringuri);

		int celMaiMare = 0;
		for (String string : listaStringuri) {
			if (string.length() > celMaiMare) {
				celMaiMare = string.length();
			}
		}
		System.out.println("Cel mai lung 'STRING' din lista are: " + celMaiMare + " caractere.");
		for (String string : listaStringuri) {
			if (string.length() == celMaiMare) {
				System.out.println("Cel mai lung 'STRING' din lista este: " + string);
			}
		}
	}
}
