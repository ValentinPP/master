package saptamana3.tema3.exercitiul1Magazin;

import saptamana3.tema3.exercitiul1Magazin.produse.Imbracaminte;

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
public class Exercitiul1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Selectați categoria produsului:");
			System.out.println("1. Imbracaminte");
			System.out.println("2. Ingrijire Personala");
			System.out.println("3. Electronice");
			System.out.println("4. Ieșire");

			int optiune = scanner.nextInt();
			scanner.nextLine(); // Consumă linia goală lăsată de nextInt

			switch (optiune) {
				case 1:
					System.out.println("Introduceți tipul produsului de imbrăcăminte (pantaloni, bluza, accesoriu): ");
					String tipProdusImbracaminte = scanner.nextLine();

					Imbracaminte imbracaminte = null;

					switch (tipProdusImbracaminte.toLowerCase()) {
						case "pantaloni":
							imbracaminte = new Imbracaminte("Pantaloni", 100, 0, "pantaloni");
							//imbracaminte.setDiscount(10);
							break;

						case "bluza":
							imbracaminte = new Imbracaminte("Bluza", 150, 0, "bluza");
							//imbracaminte.setDiscount(20);
							break;

						case "accesoriu":
							imbracaminte = new Imbracaminte("Accesoriu", 50, 0, "accesoriu");
							//imbracaminte.setDiscount(30);
							break;

						default:
							System.out.println("Tip de imbracaminte invalid.");
							break;
					}

					if (imbracaminte != null) {
						double pretFinalImbracaminte = imbracaminte.calculPretCuDiscount();
						System.out.println("Pretul final după discount: " + pretFinalImbracaminte);
					}
					break;

				case 2:
					System.out.println("Introduceți tipul produsului de îngrijire personală (da / nu): ");
					String poateFiReturnat = scanner.nextLine();

					if (poateFiReturnat.equalsIgnoreCase("da")) {
						// No discount applied
						System.out.println("Produsul poate fi returnat. Fără discount aplicat.");
					} else if (poateFiReturnat.equalsIgnoreCase("nu")) {
						// Apply a 20% discount
						double pret = 100; // Set the original price (for example, 100)
						double pretFinal = pret - (pret * 20 / 100); // Calculate the final price after the discount
						System.out.println("Produsul nu poate fi returnat. Prețul final după discount: " + pretFinal);
					} else {
						System.out.println("Opțiune invalidă!");
					}
					break;

				case 3:
					System.out.println("Introduceți voltajul produsului electronic: ");
					int voltaj = scanner.nextInt();

					if (voltaj < 220 || voltaj > 240) {
						System.out.println("Produsul nu poate fi folosit la o priză ce respectă reglementările europene.\n\n");
					} else {
						// Other logic for electronic products within the specified voltage range
						System.out.println("Produsul poate fi folosit la o priză ce respectă reglementările europene.\n\n");
					}
					break;

				case 4:
					System.out.println("Ieșire din program...");
					return;

				default:
					System.out.println("Opțiune invalidă!");
					break;
			}
		}
	}
}

