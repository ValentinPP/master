package saptamana1.tema;

import java.util.Scanner;

/**
 * Problema 2.
 * Luand în considerare Explicațiile și codul de mai sus, adaptati codul ca sa citească și prenumele persoanei (într-o variabila diferită) și sa se afișeze mai apoi.
 *
 * Exemplu:
 * Introduceți numele dumneavoastră: Roban
 * Introduceți prenumele dumneavoastră: Marian
 *
 * Programul va afișa:
 * Numele introdus este: Roban Marian
 **/
public class Problema2AfisarePrenume {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
			System.out.print("Introduceti numele dumneavoastra: ");

		String numelePersoanei = keyboardInput.nextLine();
			System.out.println("Numele introdus este: " + numelePersoanei);

			System.out.print("Introduceti prenumele dumneavoastra: ");

		String prenumelePersoanei = keyboardInput.nextLine();
			System.out.println("Prenumele introdus este: " + prenumelePersoanei);

			System.out.println("Numele introdus este: " + numelePersoanei + " " + prenumelePersoanei);

	}

}
