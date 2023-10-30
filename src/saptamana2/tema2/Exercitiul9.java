package saptamana2.tema2;

import java.util.Scanner;

/**
 * Creati un program prin care,
 * avand un text introdus la tastatura,
 * sa se numere cate caractere mici are textul
 * si cate caractere mari are acel text.
 **/

public class Exercitiul9 {
	public static void main(String[] args) {
		System.out.println("Introduceti un text scris cu litere mici si mari! ");
		System.out.println("Aflati cate litere mici sau mari are textul scris: ");
		Scanner keyboardInput = new Scanner(System.in);

		String textulIntrodus = keyboardInput.nextLine();

		int litereMiciCounter = 0;
		int litereMariCounter = 0;

		for (int i = 0; i < textulIntrodus.length(); i++) {
			char caracter = textulIntrodus.charAt(i);

			if (Character.isLowerCase(caracter)) {  //Character este olasa pe care o putem folosi pentru multiple operatii cu caractere
				litereMiciCounter++;
			} else if (Character.isUpperCase(caracter)) {
				litereMariCounter++;
			}
		}

		System.out.println("Textul are :" + litereMiciCounter + " litere mici! " );
		System.out.println("Textul are: " + litereMariCounter + " litere mari! " );

	}
}
