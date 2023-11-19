package saptamana4.tema4.problema1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//Sa se creeze o clasa simpla (ProblemaArray) in care se va defini main.
//Pentru aceasta problema se cere să se inițieze un array de stringuri citite de la tastatura.
// (Numărul il stabiliti voi. Alegeți cel putin 3 elemente ca sa nu fie nici 1 sau 2 ca nu ar mai avea sens array-ul).
//Se cere sa se construiască un alt array de stringuri de aceeași dimensiune in care sa se introduca elementele din primmul array construit in ordine inversa. (Acesta nu il mai veti citi de la tastatura)
//Exemplu:
//array1 in care elementele sunt citite de la tastatura: mar par cireasa banana
//array2 pe care il veti construi pe baza array1: banana cireasa par mar.
//Se vor afisa ambele array-uri element cu element folosind parcurgerea cu for.
public class ProblemaArray {
	public static void main(String[] args) {

		Scanner keyboardInput = new Scanner(System.in);

		while (true) {
			System.out.println("\nBUN VENIT!");
			System.out.println("Introduceti un sir de minim 3 Stringuri despartite de [spatiu]: \n");
			String insertedWords = keyboardInput.nextLine().trim().toLowerCase();

			String insertedArray[] = insertedWords.split(" ");
			String ascendingArray[] = new String[insertedArray.length];
			String descendingArray[] = new String[insertedArray.length];

			for (int i = 0; i < insertedArray.length; i++) {
				ascendingArray[i] = insertedArray[i];
				//System.out.println("Stringurile introduse incepand de la primul la ultimul sunt: " + insertedArray[i]);
			}
			System.out.println("Stringurile introduse incepand de la primul la ultimul sunt: " + Arrays.toString(ascendingArray)); // -extra info aici - https://www.geeksforgeeks.org/how-to-convert-an-array-to-string-in-java/

			for (int i = insertedArray.length - 1; i >= 0; i--) {
				descendingArray[i] = insertedArray[i]; //+ descendingArray[i];
				//System.out.println("Stringurile introduse incepand de la ultimul la primul sunt: " + insertedArray[i]);
			}
			Collections.reverse(Arrays.asList(descendingArray)); // extra detalii sunt aici - https://www.geeksforgeeks.org/reverse-an-array-in-java/
			System.out.println("Stringurile introduse incepand de la ultimul la primul sunt: " + Arrays.toString(descendingArray));

			System.out.println("\nDoriti sa continuati? (da/nu)");
			String response = keyboardInput.nextLine().trim().toLowerCase();

			if (!response.equals("da")) {
				System.out.println("Multumim de vizita. La revedere!");
				break;
			}
		}
	}
}
