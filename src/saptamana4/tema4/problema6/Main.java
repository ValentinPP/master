package saptamana4.tema4.problema6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Map<Persoana, Departament> hartaAngajati = new HashMap<>();


		hartaAngajati.put(new Persoana(1, "Vali"), new Departament("IT"));
		hartaAngajati.put(new Persoana(2, "Mihai"), new Departament("Vanzari"));
		hartaAngajati.put(new Persoana(3, "Ionut"), new Departament("Contabilitate"));


		System.out.println("Harta angajaților inițială:");
		for (Map.Entry<Persoana, Departament> entry : hartaAngajati.entrySet()) {
			Persoana persoana = entry.getKey();
			Departament departament = entry.getValue();
			System.out.println("Id: " + persoana.getId() + ", Nume: " + persoana.getNume() + ", Departament: " + departament.getNumeDepartament());
		}

//		for(Persoana i : hartaAngajati.keySet()) {
//			System.out.println("key" + i + " value " + hartaAngajati.get(i));
//		}

		//schimbareDepartament(hartaAngajati);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introdu id-ul și numele persoanei:");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume newline

		String nume = scanner.nextLine();

		Persoana cheie = new Persoana(id, nume);

		if (hartaAngajati.containsKey(cheie)) {
			System.out.println("Aceasta persoana exista deja!");
		} else {
			if (hartaAngajati.containsKey(cheie)) {
				Departament departamentActual = hartaAngajati.get(cheie);

				System.out.println("Introdu noul departament pentru " + nume + ":");
				String numeNouDepartament = scanner.nextLine();

				Departament departamentNou = new Departament(numeNouDepartament);

				if (departamentNou.equals(departamentActual)) {
					System.out.println(nume + " deja este în departamentul " + numeNouDepartament);
				} else {
					hartaAngajati.put(cheie, departamentNou);
					System.out.println("Departamentul lui " + nume + " a fost schimbat cu succes la " + numeNouDepartament);
				}
			} else {
				System.out.println("Persoana cu id-ul " + id + " și numele " + nume + " nu există.");
			}
		}


	}

	}

//	private static void schimbareDepartament(Map<Persoana, Departament> hartaAngajati) {
//
//}
