package saptamana2.tema2;

import java.util.Scanner;

import static java.lang.Boolean.parseBoolean;

/**
 * Sa se implementeze joculetul Fazan. (Studiati metoda substring cu doi parametri/argumenti)
 * - https://beginnersbook.com/2013/12/java-string-substring-method-example/
 * Fazan presupune ca intr-un grup de membri,
 * fiecare va incerca sa formeze un cuvant incepand cu cu ultimele doua litere ale cuvantului precedent.
 * O sa alegeti un cuvant initial aleatoriu (presupunem ca incepe calculatorul).
 * Daca utilizatorul introduce un cuvant care nu incepe cu acea grupare, jocul se termina
 * Daca sunteti blocati in a introduce un cuvant (Exemplu: dupa cuvintele care se termina in "nt")
 * utilizatorul o sa introduca un String empty iar programul se termina.
 * <p>
 * Cuvant de inceput: "animal".
 * Introduceti un cuvant care incepe cu "al": alfabet
 * Introduceti un cuvant care incepe cu "et": etaj
 * Introduceti un cuvant care incepe cu "aj": altceva
 * Jocul s-a terminat!
 */


//TO BE REVIEWED - Codul scapa cateaodata si alte litere de inceput decat cele mentionate si nu inteleg de ce ...


public class Exercitiul11 {
	public static void main(String[] args) {

		Scanner keyboardInput = new Scanner(System.in);

		System.out.println("Pentru a incepe jocul introduceti primul cuvant si apasati tasta ENTER!");
		String cuvantInitial = keyboardInput.nextLine();

		String ultimeleLitere = cuvantInitial.substring(cuvantInitial.length() - 2);

		while (true) {
			System.out.print("Introduceti un cuvant care incepe cu \"" + ultimeleLitere + "\": ");
			cuvantInitial = keyboardInput.nextLine();

			if (cuvantInitial.isEmpty()) {
				System.out.println("Jocul s-a terminat! Nu ati introdus niciun cuvant.");
				break;
			}

			ultimeleLitere = cuvantInitial.substring(cuvantInitial.length() - 2);
			String cuvantulIntrodus = cuvantInitial.substring(0, 2);

			if (cuvantulIntrodus.equalsIgnoreCase(ultimeleLitere)) {
				System.out.println("Jocul s-a terminat! Cuvantul nu incepe cu ultimele doua litere ale cuvantului precedent.");
				break;
			}

		}
	}
}

