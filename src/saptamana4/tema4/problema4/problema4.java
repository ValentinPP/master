package saptamana4.tema4.problema4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//1. Se da un text citit de la tastatura (sau dintr-o variabila String).
// Pentru delimitarea cuvintelor se vor folosi doar spatii.
// Se cere sa se determine cate cuvinte distincte sunt in textul dat.
//	Exemplu de text. "mar mar par par cireasa". Sunt 3 cuvinte distincte in acest text. (mar, par, cireasa).
//	Pentru toata lumea: Pentru a sparge un text in cuvinte ne folosim de metoda split din String. metoda split ne va returna un array de string-uri. (vezi documentatie).
//	String[] cuvinte = textulMeu.split("\\s+") (O sa spargem textul in cuvinte in functie de spatiile dintre cuvinte)


public class problema4 {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

		System.out.println("\nIntroduceti un text care sa contina cuvinte diferite si cuvinte duplicat!\n");

		String text = keyboardInput.nextLine().toLowerCase();
		String[] cuvinte = text.split("\\s+");

		Set<String> cuvinteDistincte = new HashSet<>();

		for(String cuvant: cuvinte){
			cuvinteDistincte.add(cuvant);
		}

		System.out.println("Sunt '" + cuvinteDistincte.size() + "' cuvinte distincte in text");
		System.out.println("Cuvintele distincte sunt: " + cuvinteDistincte);



	}
}
