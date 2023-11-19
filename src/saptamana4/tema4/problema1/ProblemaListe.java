package saptamana4.tema4.problema1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Sa se creeze o clasa simpla (ProblemaListe) in care se va defini doar main.
//Se cere sa se creeze o lista de numere intregi (folosind List din java).
//Folosind o bucla while se cere sa se genereze numere intregi (folosind Random) pana in momentul in care numarul generat este 10. (cand se genereaza 10 se iese din bucla).
//Fiecare numar generat pana la intalnirea lui 10 este introdus in lista de mai sus.
//Mai departe, daca lista va contine elemente se vor numara cate aparitii ale numarului 5 sunt.
//Indicatii:
//1.Se va folosi metoda isEmpty() din obietul de tip lista pentru verificare daca lista este goala
//Exemplu de rulare:
//Presupunem ca s-au generat numerele 2 5 4 16 5 11 18 5 7 10 (la 10 ma opresc)
//Introduc numerele intr-0 lista.
//Parcurg lista si cand intalnesc valoarea 5 incrementez un contor.
// (Un contor inseamna  ca ne definim o variabila de tip int pe care o incrementam cand intalnim valoarea 5 in lista).
public class ProblemaListe {
	public static void main(String[] args) {

		Random random = new Random();

		List<Integer> numbers = new ArrayList<>();

		while (true) {
			int randomNumber = random.nextInt(11);
			numbers.add(randomNumber);

			System.out.println("Numarul generat este: " + randomNumber);

			if (randomNumber >= 10) {
				break;
			}
		}
		int givenNumber = 5;

		if(numbers.isEmpty()){
			System.out.println("Lista este goala!");
		} else {
			System.out.println("Numerele generate sunt: " + numbers);

			int searchNumber = 0;
			for (int number : numbers) {
				if ( number == givenNumber) {
					searchNumber++;
				}
			}
			System.out.println("Numarul aparitiilor numarului dat -> '" + givenNumber + "' este de: " + searchNumber);
		}
	}
}
