package saptamana2.tema2.exercitiul14CursValutar;

import java.util.Scanner;
// Exercitiu chatGPT ... :(
public class Exercitiul14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Creați obiectul CursValutar cu cursurile valutare inițiale
		CursValutar cursValutar = new CursValutar(4.92, 4.22, 5.42);

		while (true) { //Cat timp este ceva inserat din parametri loopul va functiona
			System.out.println("\nMeniu:"); //Optiuni ale meniului
			System.out.println("1. Schimbă bani");
			System.out.println("2. Schimbă cursul unei monede");
			System.out.println("3. Ieșire din program");

			int optiune = scanner.nextInt(); // initializeaza "ascularea" optiunii dni meniu pe baza careia se va face switchul

			switch (optiune) {
				case 1:
					System.out.println("Introduceți suma în RON:");
					double sumaRON = scanner.nextDouble();

					System.out.println("Alegeți moneda (EUR / USD / GBP):");
					scanner.nextLine(); // Consumă linia goală lăsată de nextInt

					String moneda = scanner.nextLine().toUpperCase();

					double rezultat = 0;
					switch (moneda) {
						case "EUR":
							rezultat = cursValutar.schimbaInEUR(sumaRON);
							break;
						case "USD":
							rezultat = cursValutar.schimbaInUSD(sumaRON);
							break;
						case "GBP":
							rezultat = cursValutar.schimbaInGBP(sumaRON);
							break;
						default:
							System.out.println("Monedă invalidă!");
							break;
					}

					System.out.println("Suma schimbată este: " + rezultat + " " + moneda);
					break;

				case 2:
					System.out.println("Introduceți moneda pentru a schimba cursul (EUR / USD / GBP):");
					scanner.nextLine();
					String monedaSchimb = scanner.nextLine().toUpperCase();

					System.out.println("Introduceți noul curs pentru " + monedaSchimb + ":");

					double noulCurs = scanner.nextDouble();
					cursValutar.schimbaCursulMonedei(monedaSchimb, noulCurs);
					break;


				case 3:
					System.out.println("Ieșire din program...");
					System.exit(0);
					break;

				default:
					System.out.println("Opțiune invalidă!");
					break;
			}
		}
	}
}
