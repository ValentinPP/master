package saptamana3.tema3.exercitiul2Credit.persoana;

import java.util.Scanner;

public class Persoana {
	private String nume;
	private String varsta;

	private String cnp;
	private double salariuNet;

	public Persoana(String nume, String varsta, String cnp, double salariuNet) {
		this.nume = nume;
		this.varsta = varsta;
		this.cnp = cnp;
		this.salariuNet = salariuNet;
	}

	public Persoana() {
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getVarsta() {
		return varsta;
	}

	public void setVarsta(String varsta) {
		this.varsta = varsta;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public double getSalariuNet() {
		return salariuNet;
	}

	public void setSalariuNet(double salariuNet) {
		this.salariuNet = salariuNet;
	}

	public static String validateCNP(Scanner keyboardInput) {
		String cnp;
		int cnpLength;

		do {
			System.out.println("Va rugam sa introduceti CNP-ul dumneavoastra:");
			cnp = keyboardInput.nextLine();
			cnpLength = cnp.length();

			if (cnpLength != 13) {
				System.out.println("CNP-ul nu are marimea corespunzătoare! ");
				break;
			}
		} while (cnpLength != 13);

		return cnp;
	}

	public static int calculateAgeFromCNP(String cnp) {

		String birthYearString = "";
		int cnpYear = Integer.parseInt(cnp.substring(1, 3));

		if(cnpYear > 30){birthYearString = "19" + cnp.substring(1, 3);
		} else {birthYearString = "20" + cnp.substring(1, 3);}

		int birthYear = Integer.parseInt(birthYearString);
		int currentYear = 2023;
		int age = currentYear - birthYear;

		return age;
	}
}


