package saptamana4.tema4.proiect.main;

import saptamana4.tema4.proiect.dataAccessObject.CursDao;
import saptamana4.tema4.proiect.modal.Curs;
import saptamana4.tema4.proiect.modal.CursLimbiStraine;
import saptamana4.tema4.proiect.modal.CursProgramare;
import saptamana4.tema4.proiect.database.BazaDate;
import saptamana4.tema4.proiect.dataAccessObject.CursDaoImplemetare;

import java.util.List;
import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		BazaDate bazaDate = new BazaDate();
		CursDao cursDao = new CursDaoImplemetare(bazaDate);

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nBUN VENIT!\n");

		while (true) {
			System.out.println("Alege ce vrei sa faci in continuare: \n");
			System.out.println("Pentru a adauga un curs introdu comanda -> adauga");
			System.out.println("Pentru a cauta un curs introdu comanda -> cauta");
			System.out.println("Pentru a iesi introduceti comanda -> exit");
			System.out.println("\nAstept comanda: ");
			String comanda = scanner.nextLine();

			switch (comanda.toLowerCase().trim()) {

				case "adauga":
					boolean returnToMain1 = false;
					while (true) {
						System.out.println("\nPentru a adauga un de curs programare introdu comanda -> programare");
						System.out.println("Pentru a adauga un curs de limbi straine introdu comanda -> limbi straine");
						System.out.println(("Pentru a va intoarece la meniul anterior introduceti comanda -> return"));

						String optiune = scanner.nextLine();

						switch (optiune.toLowerCase().trim()) {
							case "programare":
								System.out.println("Introdu cu spatiu: -> nume curs:[...]pret curs:[...]dataInceput:[...]");
								String cursProgramareAdaugat[] = scanner.nextLine().split(" ");

								CursProgramare cursProgramare = new CursProgramare(cursProgramareAdaugat[0].toUpperCase(), Integer.parseInt(cursProgramareAdaugat[1]), cursProgramareAdaugat[2]);
								cursDao.adaugaCurs(cursProgramare);
								break;

							case "limbi straine":
								System.out.println("Introdu cu spatiu: -> nume curs:[...]pret curs:[...]profesor:[...]");
								String cursLimbiAdaugat[] = scanner.nextLine().split(" ");

								CursLimbiStraine limbiStraine = new CursLimbiStraine(cursLimbiAdaugat[0].toUpperCase(), Integer.parseInt(cursLimbiAdaugat[1]), cursLimbiAdaugat[2]);
								cursDao.adaugaCurs(limbiStraine);
								break;

							case "return":
								returnToMain1 = true;
								break;

							case "default":
								System.out.println("Comanda gresita!\n " +
										"Va rugam sa alegeti una din comenile mentionate! ");

						}
						break;
					}
					break;


				case "cauta":
					boolean returnToMain2 = false;
					while (true) {
						System.out.println("Pentru a cauta un curs introduceti comanda -> cauta");
						System.out.println("Pentru a afla informatii despre cursuri introduceti comanda -> info");
						System.out.println("Pentru a va intoarece la meniul anterior introduceti comanda -> return");

						String optiune = scanner.nextLine();

						switch (optiune.toLowerCase().trim()) {
							case "cauta":
								System.out.println("Introduceti numele cursului pentru a-l cauta: ex:'JAVA'/ 'ENGLEZA' ");
								String cautare = scanner.nextLine();
								String cursGasit = cursDao.cautaCurs(cautare);

								if (cursGasit != null) {
									System.out.println("AM GASIT cursul cu: " + cursGasit);

								} else {
									System.out.println("Cursul solicitat nu a fost găsit.\n");
								}
								break;

							case "info":
								List<Curs> listaCursuri = bazaDate.getListaCursuri();

								if (listaCursuri.isEmpty()) {
									System.out.println("Nici un curs disponibil.\n");
								} else {
									for (Curs curs : listaCursuri) {
										System.out.println("Curs listat -> Nume: " + curs.getNume() + " la pretul de: " + curs.getPret() + " RON");
									}
								}

								break;
							case "return":
								returnToMain2 = true;
								break;

							case "default":
								System.out.println("Comanda gresita!\n " +
										"Va rugam sa alegeti una din comenile mentionate! ");
								break;
						}
						break;
					}
					break;

				case "exit":
					System.out.println("Va multumim pentru vizita si va mai asteptam! ");
					return;


				default:
					System.out.println("Comanda gresita!\n " +
							"Va rugam sa alegeti una din comenile mentionate! ");
					break;
			}

		}


	}

}
