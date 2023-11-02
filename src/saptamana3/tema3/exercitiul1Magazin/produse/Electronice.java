package saptamana3.tema3.exercitiul1Magazin.produse;

import saptamana3.tema3.exercitiul1Magazin.Produs;

public class Electronice extends Produs {
	private int voltaj;

	public Electronice(String nume, double pret, int discount, int voltaj) {
		super(nume, pret, discount);
		setVoltaj(voltaj);
	}

	public void setVoltaj(int voltaj) {
		if (voltaj >= 220 && voltaj <= 240) {
			this.voltaj = voltaj;
		} else {
			throw new IllegalArgumentException("Voltajul trebuie să fie între 220 și 240.");
		}
	}
}
