package saptamana2.tema2;
/*
Sa se creeze un program in care se calculeaza pretul unei cantitati de produse.
Pentru aceasta se vor citi urmatoarele 3 variabile: numele produsului, pretul produsului si cantitatea.
Se cere ca in functie de datele introduse sa se calculeze pretul final.
Se va afisa un mesaj similar: "Pentru produsele de tip {nume produs} si cantitatea {cantitate} , pretul este de {pret calculat}";
Aspecte:
1. "Cumpar atatea produse cu numele pe care il citesc si calculez pretul total"
 */

import java.util.Scanner;

public class Exercitiul3 {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

		while (true) {
			System.out.println(" ");
			System.out.println("SELECT PRODUCT (e.g. 'Mere' or '1' ) ");
			System.out.println(" ");

			int priceMere = 10;
			int pricePere = 12;
			int pricePrune = 8;
			int totalPayable = 0;

			System.out.println("1. Mere - " + priceMere + " RON/KG");
			System.out.println("2. Pere - " + pricePere + " RON/KG");
			System.out.println("3. Prune - " + pricePrune + " RON/KG");

			String optiune = keyboardInput.nextLine();

			if (optiune.equalsIgnoreCase("Mere") || optiune.equals("1")) {
				System.out.println("Insert QUANTITY: ");
				int quantityMere = keyboardInput.nextInt();
				totalPayable = quantityMere * priceMere;
				System.out.println("For " + quantityMere + "KG of Mere the total payable is: " + totalPayable + "RON!");
			} else if (optiune.equalsIgnoreCase("Pere") || optiune.equals("2")) {
				System.out.println("Insert QUANTITY: ");
				int quantityPere = keyboardInput.nextInt();
				totalPayable = quantityPere * pricePere;
				System.out.println("For " + quantityPere + "KG of Pere the total payable is: " + totalPayable + "RON!");
			} else if (optiune.equalsIgnoreCase("Prune") || optiune.equals("3")) {
				System.out.println("Insert QUANTITY: ");
				int quantityPrune = keyboardInput.nextInt();
				totalPayable = quantityPrune * pricePrune;
				System.out.println("For " + quantityPrune + "KG of Prune the total payable is: " + totalPayable + "RON");
			} else {
				System.out.println("! Product unavailable.");
			}
		}
	}
}
