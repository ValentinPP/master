package saptamana2.curs2.metode;

public class Exercitiul3 {
	public static void main(String[] args) {

		Caine caine = new Caine("Azorel", 5);
		Caine caine2 = new Caine("Grivei", 20);

		// caine = null;

		caine.latra();
		caine.alearga("tare");

		System.out.println("--------------------------");

		caine2.alearga("incet");


		Angajat angajat = new Angajat("Ionel", 5000);
		Angajat angajat1 = new Angajat("Gigel", 90000);

		double salariu = angajat1.calculeazaSalariuNet(6000);
		double salariu1 = angajat1.calculeazaSalariuNet();
		System.out.println(salariu);

		System.out.println(salariu1);

	}
}
