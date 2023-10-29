package saptamana2.tema2;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Sa se creeze un program prin care se citeste de la tastatura un user si o parola. In prealabil, acestea trebuie sa mimeze autentificarea unui user intr-un sistem.
 * Daca userul si parola sunt aceleasi cu cele prestabilite, afisati un mesaj de tipul: "Userul {user} s-a autentificat in aplicatie." (Unde {user} este userul introdus).
 * In cazul in care cel putin una din valorile citite (user sau parola) nu este egala cu valoarea prestabilita, se afiseaza mesajul "Credentiale gresite".
 * Aspecte:
 * 1. Pentru userul si parola prestabilite se definesc 2 stringuri in program.
 * 2. Cand se citeste de la tastatura, textul citit va fi intampinat de un mesaj similar: "Introduceti userul: " / "Introduceti parola: ".
 **/

public class Exercitiul1 {
	public static void main(String[] args) {
		String username = "Testulica";
		String password = "Test123";
		Scanner keyboardInput = new Scanner(System.in);

		System.out.println(" ");
		System.out.println("WELCOME TO OUR JAVA APP");
		System.out.println("Please login: ");
		System.out.println(" ");

		while(true) {
			System.out.println("Insert username: ");
			String insertedUsername = keyboardInput.nextLine();

			System.out.println("Insert password: ");
			String insertedPassword = keyboardInput.nextLine();

			if (insertedUsername.equalsIgnoreCase(username) && insertedPassword.equals(password)) {
				System.out.println("Welcome " + username + " !");
				break;
			} else {
				System.out.println("Invalid username/password! Please try again! ");
			}
		}
	}
}
