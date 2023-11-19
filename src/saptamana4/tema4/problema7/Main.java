package saptamana4.tema4.problema7;

import java.util.*;

//Se da o lista de String-uri (Sau Integer, sau obiecte preferabile).
// Printr-o linie de cod, transformati lista intr-un set.
//Atentie: In lista se vor regasi elemente duplicate, in Set acele elemente duplicate vor aparea o singura data.
public class Main {
	public static void main(String[] args) {

		Scanner keyboardInput = new Scanner(System.in);

		System.out.println("\nIntroduceti un text care sa contina cuvinte diferite si cuvinte duplicat!\n");

		String text = keyboardInput.nextLine().toLowerCase();
		String[] cuvinte = text.split("\\s+");

		List<String> textList = Arrays.asList(cuvinte);
		System.out.println("Lista initiala " + textList);

		Set<String> cuvinteDistincte = new HashSet<>(textList);
		System.out.println("Lista ca SET: " + cuvinteDistincte);
	}
}
