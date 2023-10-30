package saptamana2.tema2.exercitiul15ReparatieAuto.componenete;

/**
 * Creati un proiect cu titlul ReparatieAuto in care se cere sa se implementeze urmatoarele cerinte:
 * 1. Veti avea pachetul de baza com.itfactory
 * 2. In pachetul de baza com.itfactory veti crea un pachet numit "componente"
 *
 * Clase pe care va trebui sa le creati in pachetul componente: clasa Motor si clasa CutieDeViteze
 * 1.Clasa Motor cu proprietatile: marcaProductie (numele marcii de productie), capacitateMotor, pretDeVanzare. Va trebui sa definiti voi corect tipurile de date.
 * 2.Clasa CutieDeViteze cu proprietatile: marcaProductie (numele marcii de productie), pretVanzare, automata (Va trebui sa folositi un tip de data simplu care sa ateste daca cutia este automata sau nu).
 *
 * 3. Clasa Reparatie care va fi creata in pachetul com.itfactory
 * Clasa Reparatie va avea ca proprietati: marcaProductie, costReparatie, Motor, CutieDeViteze.
 * Se vor crea constructori (Daca o sa implementati constructor cu parametri, nu va fie nevoie de setters si getters)
 * In clasa Reparatie se va crea o metoda care va verifica daca marca de productie este aceeasi cu cea a motorului (Se va returna valoarea daca este egal sau nu. Atentie la verificarea egalitatii)
 * In clasa Reparatie se va crea o metoda care va verifica daca marca de productie este aceeasi cu cea a cutiei de viteze (Se va returna valoarea daca este egal sau nu. Atentie la verificarea egalitatii)
 *
 * 4. Se va crea o metoda main in pachetul com.itfactory in care se va crea un obiect de tipul clasei Reparatie, de asemenea si pentru Motor / Cutie de viteze care vor fi parte din obiectul clasei Reparatie.
 *
 * Cerintele programului:
 * 1. Daca marcaDeProductie este aceeasi cu a motorului si a cutiei de viteze, sa se calculeze costul de reparatie.
 * 2. Daca cutia de viteze este automata, se va adauga la pretul final valoarea de 2150.75
 * 3. Daca marca de productie nu este aceeasi cu a motorului si a cutiei de viteze afisati un mesaj: "Costul de productie nu poate fi stabilit. Componente gresite"
 *
 *
 * ATENTE: Toate metodele create vor returna valorile calculate dupa caz.
 * Se va crea o clasa Main unde va fi metoda main. In acea metoda main din clasa Main veti instantia obiectele cerute si veti folosi obiectele pentru a calcula, dupa caz cerintele.
 * Se vor afisa tot in metoda main din clasa Main.
 */
public class Exercitiul15 {
	public static void main(String[] args) {
		Motor motor = new Motor("WV", 3.0,5000.0);
		CutieDeViteze cutieDeViteze = new CutieDeViteze("WV",1500.0, true);

		Reparatie reparatie = new Reparatie("WV",1000.0,motor, cutieDeViteze );
		double costReparatie = reparatie.calculatiCostulDeReparatie();

		System.out.println("Cost de reparatie total: " + costReparatie + "RON! ");
	}
}
