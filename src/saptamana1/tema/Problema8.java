package saptamana1.tema;

import java.util.Scanner;

public class Problema8 {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

		while (true) {
			System.out.println("SELECTATI O OPTIUNE:");
			System.out.println("1. Introduceti un număr de la 1 la 10");
			System.out.println("2. Introduceti doua numere intregi si afisati suma");
			System.out.println("3. Introduceti un numar intreg pozitiv si afisati numerele de la 0 la acel numar");

			int optiune = keyboardInput.nextInt();

			switch (optiune) {
				case 1:
					System.out.println("Introduceti un numar de la 1 la 10:");
					int numar1 = keyboardInput.nextInt();
					if (numar1 >= 1 && numar1 <= 10) {
						System.out.println("Numarul introdus este: " + numar1);
					} else {
						System.out.println("Numarul nu este in intervalul permis.");
					}
					break;

				case 2:
					System.out.println("Introduceti doua numere intregi:");
					int numar2 = keyboardInput.nextInt();
					int numar3 = keyboardInput.nextInt();
					int suma = numar2 + numar3;
					System.out.println("Suma celor doua numere este: " + suma);
					break;

				case 3:
					System.out.println("Introduceti un numar intreg pozitiv:");
					int numar4 = keyboardInput.nextInt();
					if (numar4 > 0) {
						System.out.println("Numerele de la 0 pana la " + numar4 + " sunt:");
						for (int i = 0; i < numar4; i++) {
							System.out.print(i + " ");
						}
						System.out.println();
					} else {
						System.out.println("Numarul " + numar4 + " nu este pozitiv.");
					}
					break;

				default:
					System.out.println("Opțiune invalida. Alegeti o optiune valida.");
			}
		}
	}
}
