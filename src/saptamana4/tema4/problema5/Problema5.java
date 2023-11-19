package saptamana4.tema4.problema5;

import java.util.Scanner;

//Sa se verifice daca un numar citit de la tastatura este palindrom sau nu.
//Exemplu: 991199 este palindrom, deoarece numarul citit invers este ca cel initial.
// Alte exemple de palindrom: 121, 22322, 556655, 4432344.
// Numarul citit se va converti in array de char continand fiecare cifra in ordine.
public class Problema5 {
	public static void main(String[] args) {
		System.out.println("\nVerificati paliandrom-ul");

		Scanner keyboardInput = new Scanner(System.in);

		while (true) {
			System.out.println("Introduceti un cuvant sau cifre si scrieti 'exit' pentru a iesi: \n");
			String userInput = keyboardInput.nextLine();

			if (userInput.equalsIgnoreCase("exit")) {
				System.out.println("Programul s-a incheiat.");
				break;
			}

			if (estePalindrom(userInput)) {
				System.out.println("Cuvantul " + userInput + " este palindrom.");
			} else {
				System.out.println("Cuvantul " + userInput + " nu este palindrom.");
			}
		}

		keyboardInput.close();
	}

	private static boolean estePalindrom(String cuvant) {
		cuvant = cuvant.replaceAll("\\s", "").toLowerCase();

		int lungime = cuvant.length();

		for (int i = 0; i < lungime / 2; i++) {
			if (cuvant.charAt(i) != cuvant.charAt(lungime - i - 1)) {
				return false;
			}
		}
		return true;

	}
}
