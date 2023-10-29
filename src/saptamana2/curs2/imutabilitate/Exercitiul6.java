package saptamana2.curs2.imutabilitate;

import saptamana2.curs2.incapsulare.Avion;

public class Exercitiul6 {
	public static void main(String[] args) {
		Pisica pisica = new Pisica("Tom", 4);

		//pisica.setNume("Getuta");

		System.out.println(pisica.getNume() + " " + pisica.getVarsta());

		System.out.println("----------------------------------------------");

		Avion avion = new Avion("Tarom", 54);
		System.out.println(avion.getCompanie() + " " + avion.getNrCursa());
		avion.setCompanie("Wiz Air");
		System.out.println(avion.getCompanie() + " " + avion.getNrCursa());
	}
}
