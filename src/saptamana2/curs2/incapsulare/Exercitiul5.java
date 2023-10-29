package saptamana2.curs2.incapsulare;

public class Exercitiul5 {
	public static void main(String[] args) {

		Avion avion1 = new Avion();
		Avion avion2 = new Avion("Tarom",24);

		System.out.println(avion2.getCompanie() + avion2.getNrCursa());

		avion1.setCompanie("Wizz=Air");
		avion1.setNrCursa(33);

		System.out.println(avion1.getCompanie() + " " + avion1.getNrCursa());
	}
}
