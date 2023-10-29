package saptamana2.tema2;

//Sa se creeze un program in care se citeste un sir de caractere de la tastatura care va reprezenta numele unui candidat la introducerea intr-un sistem de contabilitate.
//		In cazul in care numele introdus depaseste lungimea de 25 de caractere, afisati mesajul urmator: "Numele introdus este prea lung pentru sistem".
//		Aspecte:
//		1. Cand se citeste de la tastatura, textul citit va fi intampinat de un mesaj similar: "Introduceti numele candidatului: "

import java.util.Scanner;

public class Exercitiul2 {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

		System.out.println(" ");
		System.out.println("WELCOME TO OUR JAVA APP");
		System.out.println("Insert the name of the candidate!");
		System.out.println(" ");

		while(true) {
			System.out.println("Insert name: ");
			String insertedName = keyboardInput.nextLine();

			System.out.println("Insert lastName ");
			String insertedLastName = keyboardInput.nextLine();

			String insertedNames = insertedName + " " + insertedLastName;
			int insertedNamesLength = insertedNames.trim().length();

			if (insertedNamesLength > 25) {
				System.out.println("! The name inserted " + "'" + insertedNames + "'" + " is too big for the system to handle.");
			} else {
				System.out.println("The candidate " + "'" + insertedNames + "'" + " was added successfully! ");
				break;
			}
		}
	}
}
