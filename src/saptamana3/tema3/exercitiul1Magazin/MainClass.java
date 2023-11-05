package saptamana3.tema3.exercitiul1Magazin;

import saptamana3.tema3.exercitiul1Magazin.produse.electronice.AparatDeSudura;
import saptamana3.tema3.exercitiul1Magazin.produse.electronice.Mobil;
import saptamana3.tema3.exercitiul1Magazin.produse.electronice.Televizor;
import saptamana3.tema3.exercitiul1Magazin.produse.imbracaminte.Accesoriu;
import saptamana3.tema3.exercitiul1Magazin.produse.imbracaminte.Bluza;
import saptamana3.tema3.exercitiul1Magazin.produse.imbracaminte.Pantaloni;
import saptamana3.tema3.exercitiul1Magazin.produse.ingrijirePersonala.AparatBarbierit;
import saptamana3.tema3.exercitiul1Magazin.produse.ingrijirePersonala.Deodorant;
import saptamana3.tema3.exercitiul1Magazin.produse.ingrijirePersonala.LameRas;

import java.util.Scanner;

/**
 * Problema 1.
 * Sa se creeze un program prin care se simuleaza un sistem de vanzare al unor produse de pe un magazin online.
 * In contextul magazinului, se va defini un concept de produs.
 * Ca si date ale acestui produs se cer urmatoarele.
 * <p>
 * Se defineste un nume al produsului, un pret si discount. (ATENTIE: pentru discount se va cere o verificare sa fie un numar intre 0 si 100 atunci cand va fi setat).
 * In clasa produs se va implementa o metoda care calculeaza pretul cu discountul aplicat.
 * <p>
 * In cadrul magazinului online exista 3 tipuri de produse: Imbracaminte, Ingrijire Personala si Electronice.
 * Se vor defini, aditional urmatoarele concepte pentru produse:
 * Imbracaminte: tipul de imbracaminte (pantaloni, bluza, acesoriu)
 * Ingrijire Persoanala: variabila ce determina daca produsul poate fi returnat sau nu
 * ----------------------(Anumite produse care sunt desfacute nu pot fi returnate de exemplu un aparat de ras)
 * Electronice: variabila ce determina voltajul.
 * ----------------------Valorile permise pentru voltaj vor fi doar intre 220 si 240 (Dupa reglementarea europeana). In cazul in care se va introduce o alta valoare pentru voltaj, se va genera un mesaj de atentionare.
 * <p>
 * <p>
 * Dupa declararea corecta a claselor se cer urmatoarele. (Pentru aceasta creati o clasa separata "Main" unde veti scrie metoda main)
 * <p>
 * Se va citi de la tastatura datele unui produs de tip Imbracaminte.
 * 1. In cazul in care produsul citit este de tip pantaloni, se va aplica un discount de 10% si se va afisa pretul final dupa discount.
 * 2. In cazul in care produsul citit este de tip bluza, se va aplica un discount de 20% si se va afisa pretul final dupa discount.
 * 3. In cazul in care produsul citit este de tip accesoriu, se va aplica un discount de 30% si se va afisa pretul final dupa discount.
 * <p>
 * Se va citi de la tastatura datele unui produs de tip Ingrijire Personala.
 * 1. Daca produsul poate fi returnat nu se va aplica niciun discount
 * 2. Daca produsul nu poate fi returnat se va aplica un discount de 20% in favoarea clientului.
 * <p>
 * Se va citi de la tastatura datele unui produs de tip Electronice.
 * 1. In cazul in care voltajul introdus este altul decat cel cuprins intre 220 si 240 se va afisa un mesaj de eroare "Produsul nu poate fi folosit la o priza ce prevede reglementarile europene"
 */

public class MainClass {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

		System.out.println("\nBine ati venit in MAGAZINUL nostru! \n" +
				"Va rugam salectati o categorie de produse din lista prezenta: \n");

		while (true) {
			System.out.println(" 1. Imbracaminte: \n " +
					"2. Ingrijire Personala: \n " +
					"3. Electronice: \n " +
					"4. Iesire: \n");
			int selection = keyboardInput.nextInt();

			switch (selection) {
				case 1:
					boolean returnToMainCase1 = false;
					while (true) {
						System.out.println("Va rugam salectati o optiune din lista prezenta: \n");
						System.out.println(" 1. Pantaloni: \n " +
								"2. Bluza: \n " +
								"3. Accesoriu: \n " +
								"4. Intoarcere la lista precedenta: \n");
						int optiune = keyboardInput.nextInt();

						switch (optiune) {
							case 1:
								Pantaloni pantaloni = new Pantaloni("pantaloni", 100, 10, true);
								System.out.println("Produsul selectat are o reducere de 10% fata de pretul afisat: " + pantaloni.getProductPrice() + " si se va vinde la pretul FINAL de: " + pantaloni.calculatediscountedPrice());
								break;
							case 2:
								Bluza bluza = new Bluza("bluza", 50, 20, true);
								System.out.println("Produsul selectat are o reducere de 20% fata de pretul afisat: " + bluza.getProductPrice() + " si se va vinde la pretul FINAL de: " + bluza.calculatediscountedPrice());
								break;
							case 3:
								Accesoriu accesoriu = new Accesoriu("accesoriu", 30, 20, true);
								System.out.println("Produsul selectat are o reducere de 30% fata de pretul afisat: " + accesoriu.getProductPrice() + " si se va vinde la pretul FINAL de: " + accesoriu.calculatediscountedPrice());
								break;
							case 4:
								returnToMainCase1 = true;
								break;

							default:
								System.out.println("Produsul nu este disponibil si nu poate fi selectat.");
								break;
						}
						if (returnToMainCase1) {
							break;
						}

					}break;
				case 2:
					boolean returnToMainCase2 = false;

					while (true) {
						System.out.println("Va rugam salectati o optiune din lista prezenta: \n");
						System.out.println(" 1. Deodorant: \n " +
								"2. Lame de ras: \n " +
								"3. Aparat de barbierit: \n " +
								"4. Intoarcere la lista precedenta: \n");
						int optiune = keyboardInput.nextInt();

						switch (optiune) {
							case 1:
								Deodorant deodorant = new Deodorant("Nivea Fresh", 15, 0, false);
								System.out.println("In functie de retunabilitate pretul produsului selectate este " + deodorant.getApplicableDiscount());
								break;
							case 2:
								LameRas lameRas = new LameRas("Gilette", 10, 0, false);
								System.out.println("In functie de retunabilitate pretul produsului selectate este " + lameRas.getApplicableDiscount());
								break;
							case 3:
								AparatBarbierit aparatBarbierit = new AparatBarbierit("Gilette Fusion", 150, 0, true);
								System.out.println("In functie de retunabilitate pretul produsului selectate este " + aparatBarbierit.getApplicableDiscount());
								break;
							case 4:
								returnToMainCase2 = true;
								break;

							default:
								System.out.println("Produsul nu este disponibil si nu poate fi selectat.");
								break;
						}
						if (returnToMainCase2) {
							break;
						}

					}break;
				case 3:
					boolean returnToMainCase3 = false;

					while (true) {
						System.out.println("Va rugam salectati o optiune din lista prezenta: \n");
						System.out.println(" 1. Aparat de sudura: \n " +
								"2. Televizor: \n " +
								"3. Mobil: \n " +
								"4. Verificati compatibilitatea voltajului: \n " +
								"5. Intoarcere la lista precedenta: \n");

						int optiune = keyboardInput.nextInt();

						switch (optiune) {
							case 1:
								AparatDeSudura aparatDeSudura = new AparatDeSudura("Bosh",1000,0,true,380);
								System.out.println("In functie de voltaj aparatul se poate folosi: " + aparatDeSudura.canBeUsed());
								break;
							case 2:
								Televizor televizor = new Televizor("LG", 1500, 0, true, 230);
								System.out.println("In functie de voltaj aparatul se poate folosi: "  + televizor.canBeUsed());
								break;
							case 3:
								Mobil mobil = new Mobil("Samsung", 800, 0, true, 220);
								System.out.println("In functie de voltaj aparatul se poate folosi: " + mobil.canBeUsed());
								break;
							case 4:
								System.out.println("Introduceți voltajul produsului electronic: ");
								int voltaj = keyboardInput.nextInt();

								if (voltaj < 220 || voltaj > 240) {
									System.out.println("Produsul nu poate fi folosit la o priză ce respectă reglementările europene.\n\n");
								} else {
									System.out.println("Produsul poate fi folosit la o priză ce respectă reglementările europene.\n\n");
								}
								break;
							case 5:
								returnToMainCase3 = true;
								break;

							default:
								System.out.println("Produsul nu este disponibil si nu poate fi selectat.");
								break;
						}
						if (returnToMainCase3) {
							break;
						}

					}break;
				case 4:
					System.out.println("Va multumim pentru vizita si va mai asteptam! ");
					return;

				default:
					System.out.println("Opțiune invalidă!");
					break;
			}
		}
	}
}




