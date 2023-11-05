package saptamana3.tema3.exercitiul2Credit;

import saptamana3.tema3.exercitiul2Credit.banca.BancaPentruLocuinte;
import saptamana3.tema3.exercitiul2Credit.banca.BancaPentruNevoiePersonale;
import saptamana3.tema3.exercitiul2Credit.banca.UnitateBancara;
import saptamana3.tema3.exercitiul2Credit.persoana.Persoana;

import java.util.Scanner;

import static saptamana3.tema3.exercitiul2Credit.persoana.Persoana.calculateAgeFromCNP;
import static saptamana3.tema3.exercitiul2Credit.persoana.Persoana.validateCNP;

public class Exercitiul2 {
	public static void main(String[] args) {
		System.out.println("\nBine ati venit la sistemul nostru de calcul al creditelor! \n\n" +
				"Pentru a putea incepe avem nevoie de cateva date pesronale \n" +
				"Confirmati acordul cu 'Da' / 'Nu' \n");
		Scanner keyboardInput = new Scanner(System.in);

		String accept = "Da";
		String reject = "Nu";
		String raspuns = keyboardInput.nextLine();

		if(raspuns.equalsIgnoreCase(reject)){
			System.out.println("Va multumim pentru acces, dar nu va putem oferi informatii fara datele necesare \n" +
					"La revedere!");
		} else if (raspuns.equalsIgnoreCase(accept)) {
			System.out.println("Va multumim pentru confirmare. \n" +
					"Putem incepe: ");
			System.out.println("Va rugam introduceti numele dumneavoastra: ");
			String nume = keyboardInput.nextLine();

			System.out.println("Bun venit " + nume);

			String validateCNP = validateCNP(keyboardInput);
			int age = calculateAgeFromCNP(validateCNP);

			System.out.println("Varsta dumneavoastra potrivit CNP este: " + age);

			if(age <= 18){
				System.out.println("Persoana introdusa " + nume + "are varsta " + age +
						" si nu este eligibila pentru un credit");
				return;
			} else if (age >18 && age <= 40){
				System.out.println("Va rugam sa introduteti salariul dumneavoastra NET: ");
				double salariuNet = keyboardInput.nextInt();

				UnitateBancara unitateBancara = new BancaPentruLocuinte();
				Persoana persoana = new Persoana();

				persoana.setSalariuNet(salariuNet);

				double credit = unitateBancara.calculCredit(persoana);
				double dobanda = unitateBancara.calculDobanda(persoana);

				System.out.println("Valoarea creditului pentru " + nume + " cu vasta " + age +
						" este de -> " + credit + "RON");
				System.out.println("Valoarea dobanzii pentru " + nume + " cu vasta " + age +
						" cu creditul de " + credit + "RON este in valoare de " + dobanda + "RON");
			} else {
				System.out.println("Va rugam sa introduteti salariul dumneavoastra NET: ");
				double salariuNet = keyboardInput.nextInt();

				UnitateBancara unitateBancara = new BancaPentruNevoiePersonale();
				Persoana persoana = new Persoana();

				persoana.setSalariuNet(salariuNet);

				double credit = unitateBancara.calculCredit(persoana);
				double dobanda = unitateBancara.calculDobanda(persoana);

				System.out.println("Valoarea creditului pentru " + nume + " cu vasta " + age +
						" este de -> " + credit + "RON");
				System.out.println("Valoarea dobanzii pentru " + nume + " cu vasta " + age +
						" cu creditul de " + credit + "RON este in valoare de " + dobanda + "RON");
			}
		} else {
			System.out.println("Raspuns invalid! \n" +
					"Iesire! ");
		}

//		Persoana persoana = new Persoana();
//		persoana.setCnp("1830309401214");
//		persoana.setNume("Gigel");
//		persoana.setVarsta("40");
//		persoana.setSalariuNet(10000);
//
//		UnitateBancara unitateBancara = new BancaPentruLocuinte();
//
//		double credit = unitateBancara.calculCredit(persoana);
//
//		System.out.println("Valoarea creditului pentru " + persoana.getNume() + " este de -> " + credit);
	}
}
