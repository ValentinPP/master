package saptamana2.tema2;

import java.util.Scanner;

/**
 * Se citesc doua variabile de tip String de la tastatura,
 * din care unul va reprezenta un text oarecare,
 * iar cel de al doilea reprezinta un keyword care se va cauta in text.
 *  Se cere sa se numere de cate ori apare keyword-ul in textul respectiv.
 */
public class Exercitiul10 {
	public static void main(String[] args) {
		System.out.println("De cate ori apare 'keyword-ul' in textul introdus:");
		Scanner keyboardInput = new Scanner(System.in);

		System.out.println("Introduceti textul: ");
		String text = keyboardInput.nextLine();

		System.out.println("Introduceti keyward-ul: ");
		String keyword = keyboardInput.findInLine(".*");

		//Trail of thought
//       V1
//		int keywordCounter = 0;
//
//		for(int i = 0 ; i < text.length(); i++) {
//			if (text.contains(keyword)){
//				keywordCounter++;
//				System.out.println("Keyword-ul introdus a fost gasit in text.");
//				break;
//			} else {
//			System.out.println("Keyword-ul introdus NU a fost gasit in text.");
//		}
//		}System.out.println("The number of occurences for the keyward is: " + keywordCounter);

		int keywordCounter = 0;
		int textLength = text.length();
		int keywordLength = keyword.length();

		for (int i = 0; i <= textLength - keywordLength; i++) {
			if (text.startsWith(keyword, i)) { // daca textul/caracterul gasit incepe cu ce este desemnat in keyword la indexul din loop (i) atunci este numarat
				keywordCounter++;
			}
		}
		if (keywordCounter > 0) {
			System.out.println("Keyword-ul introdus a fost gasit in text.");
		} else {
			System.out.println("Keyword-ul introdus NU a fost gasit in text.");
		}

		System.out.println("Numarul aparitiilor keyword-ului este: " + keywordCounter);

	}
}
