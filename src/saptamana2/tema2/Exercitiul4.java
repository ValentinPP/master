package saptamana2.tema2;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Sa se creeze un program in care se va citi de la tastatura siruri de caractere pana cand introduc textul "stop";
Aspecte.
1. Se va folosi bucla "while"

Simulare:
Introduceti textul: masina
Introduceti textul: avion
Introduceti textul: stop

Am iesit din program.

 */
public class Exercitiul4 {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

		String exit = "exit";

		System.out.println(" ");
		System.out.println("Insert random text that will be printed:");
		System.out.println("Insert \"stop\" in order to exit! ");
		System.out.println(" ");

		while (!exit.equalsIgnoreCase("stop")) {
			System.out.println("Insert new text: ");
			exit = keyboardInput.nextLine();
		}
		System.out.println("\"STOP\" was entered. Exiting program! ");
	}
}

