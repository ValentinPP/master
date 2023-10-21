package saptamana1.tema;

import java.util.Scanner;

/**
 * Creați un proiect in Java în care sa aveti următorul pachet default: "com.itfactory".
 * Sa se creeze o clasa (numele il veti alege voi) în care sa aveți o metoda main.
 * Cerința este sa cititi două numere de la tastatura si sa afisati restul împărțirii lor.
 * Exemplu: Dacă citim 10 și 3, restul împărțirii lui 10 la 3 va fi 1. (Puteți sa va uitati peste împărțirea cu rest pentru a înțelege restul împărțirii).
 **/
public class Problema4 {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

		System.out.println("Introduceti primul numar: ");
		int primulNumar = keyboardInput.nextInt();

		System.out.println("Introduceti al doilea numar: ");
		int alDoileaNumar = keyboardInput.nextInt();

		int restulImpartirii = primulNumar % alDoileaNumar;

		System.out.println("Numerele introduse sunt: " + primulNumar + " si " + alDoileaNumar + " iar restul impartirii dintre ele este: " + restulImpartirii);

	}
}
