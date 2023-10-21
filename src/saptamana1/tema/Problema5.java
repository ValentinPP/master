package saptamana1.tema;

import java.util.Scanner;

/**
 * Extindeti problema nr 3 de mai sus prin a afișa înmulțirea celor doua numere
 * și împărțirea (cu virgula) a celor doua numere.
 **/
public class Problema5 {

		public static void main(String[] args) {
			Scanner keyboardInput = new Scanner(System.in);

			System.out.println("Introduceti primul numar: ");
			double primulNumar = keyboardInput.nextInt();

			System.out.println("Introduceti al doilea numar: ");
			double alDoileaNumar = keyboardInput.nextInt();

			int rezutatulInmultirii = (int)primulNumar * (int)alDoileaNumar;
			double rezultatulImpartirii = primulNumar / alDoileaNumar;

			System.out.println("Numerele introduse sunt: " + (int)primulNumar + " si " + (int)alDoileaNumar + " iar rezultatul inmultirii dintre ele este: " + rezutatulInmultirii);
			System.out.println("Numerele introduse sunt: " + (int)primulNumar + " si " + (int)alDoileaNumar + " iar rezultatul impartirii dintre ele este: " + rezultatulImpartirii);

			reultatulInmultiriiInteger(10,3);
			reultatulInmultiriiDouble(10.0,3.0);
			reultatulImpartiriiInteger(10,3);
			reultatulImpartiriiDouble(10.0,3.0);
		}

		public static void reultatulInmultiriiInteger (int numar1 ,int numar2) {
			int rezultatulInmultirii = numar1 * numar2;
			System.out.println("Produsul de tip integer = " + rezultatulInmultirii);
		}
		public static void reultatulInmultiriiDouble (double numar1 ,double numar2) {
			double rezultatulInmultirii = numar1 * numar2;
			System.out.println("Produsul de tip double = " + rezultatulInmultirii);
		}
		public static void reultatulImpartiriiInteger (int numar1 ,int numar2) {
			int rezultatulImpartirii = numar1 / numar2;
			System.out.println("Catul de tip integer = " + rezultatulImpartirii);
		}
		public static void reultatulImpartiriiDouble (double numar1 ,double numar2) {
			double rezultatulImpartirii = numar1 / numar2;
			System.out.println("Catul de tip double = " + rezultatulImpartirii);
		}

}
