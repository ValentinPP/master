package saptamana4.tema4.problema6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Sa se creeze doua clase in Java si anume clasa Persoana cu fieldurile [id, nume] si clasa Departament cu fieldurile [numeDepartament].
// (Atentie la metodele pe care trebuie sa le generati/suprascrieti in clase)
//Intr-o clasa Main cu metoda main se va crea un map
// in care cheile (key) vor fi de tip Persoana
// iar valorile (value) vor fi de tip Departament.
//Se vor introduce initial (nu trebuie citit de la tastatura neaparat) un numar de persoane din acelasi departament.
// (Minim 3 persoane).
//Mai departe vom simula schimbarea departamentului unei persoane.
//Se cere sa se introduca de la tastatura id-ul si numele unei persoane.
// Daca Id-ul si numele coincid cu una din Persoanele introduse,
// se cere mai apoi sa se introduca numele departamentului nou in care o sa fie persoana respectiva.
//Daca departamentul este deja cel asignat persoanei,
// se va afisa un mesaj de eroare si programul se va incheia.
// Daca departamentul nu este asignat persoanei respective,
// se va crea departamentul si se va asigna persoanei respective.

public class Main {
	public static void main(String[] args) {
		Map<Persoana, Departament> hartaAngajati = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		hartaAngajati.put(new Persoana(1, "Vali"), new Departament("IT"));
		hartaAngajati.put(new Persoana(2, "Mihai"), new Departament("Vanzari"));
		hartaAngajati.put(new Persoana(3, "Ionut"), new Departament("Contabilitate"));

		System.out.println("\nHarta angajaților inițială:");
		for (Map.Entry<Persoana, Departament> entry : hartaAngajati.entrySet()) {
			Persoana persoana = entry.getKey();
			Departament departament = entry.getValue();
			System.out.println("Id: " + persoana.getId() + ", Nume: " + persoana.getNume() + ", Departament: " + departament.getNumeDepartament());
		}

		System.out.println("\nIntrodu id-ul persoanei:");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Introdu numele persoanei:");
		String nume = scanner.nextLine();

		Persoana cheie = new Persoana(id, nume);

		if (hartaAngajati.containsKey(cheie)) {

			System.out.println("Introdu noul departament pentru " + nume + ":");
			String numeNouDepartament = scanner.nextLine();

			Departament departamentCurent = hartaAngajati.get(cheie);
			if (!departamentCurent.equals(new Departament(numeNouDepartament))) {
				hartaAngajati.put(cheie, new Departament(numeNouDepartament));
				System.out.println("Departamentul lui " + nume + " a fost schimbat cu succes la " + numeNouDepartament);
			} else {
				System.out.println(nume + " deja este în departamentul " + numeNouDepartament);
			}
		} else {
			System.out.println("Persoana cu id-ul " + id + " și numele " + nume + " nu există.");
		}

		System.out.println("\nHarta updatata a angajaților");
		for (Map.Entry<Persoana, Departament> entry : hartaAngajati.entrySet()) {
			Persoana persoana = entry.getKey();
			Departament departament = entry.getValue();
			System.out.println("Id: " + persoana.getId() + ", Nume: " + persoana.getNume() + ", Departament: " + departament.getNumeDepartament());
		}



//


	}

}

