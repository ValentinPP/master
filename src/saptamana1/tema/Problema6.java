package saptamana1.tema;

import java.util.Scanner;

/**
 * Scrieți un program în care, folosind o bucla (stabiliti voi care)
 * o sa cititi de la tastatură numere întregi
 * până la intalnire bucla a unui număr divizibil cu 7.
 **/

public class Problema6 {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		int numar;

		while (true) {
			System.out.print("Introduceti un numar intreg: ");
			numar = keyboardInput.nextInt();

			if (numar % 7 == 0) {
				System.out.println("Numarul " + numar + " se imparte la 7.");
				break;
			}
		}

		System.out.println("S-a gasit numarul " + "'" + numar + "'" + " care este divizibil cu 7. Iesire din loop!");
	}
}
