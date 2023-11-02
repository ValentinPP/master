package saptamana3.tema3.exercitiul2Credit;

import saptamana3.tema3.exercitiul2Credit.banca.BancaPentruLocuinte;
import saptamana3.tema3.exercitiul2Credit.banca.UnitateBancara;
import saptamana3.tema3.exercitiul2Credit.persoana.Persoana;

public class Exercitiul2 {
	public static void main(String[] args) {
		Persoana persoana = new Persoana();
		persoana.setCnp("1830309401214");
		persoana.setNume("Gigel");
		persoana.setVarsta("40");
		persoana.setSalariuNet(10000);

		UnitateBancara unitateBancara = new BancaPentruLocuinte();

		double credit = unitateBancara.calculCredit(persoana);

		System.out.println("Valoarea creditului pentru " + persoana.getNume() + " este de -> " + credit);
	}
}
