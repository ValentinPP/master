package saptamana3.tema3.exercitiul1Magazin.produse;

import saptamana3.tema3.exercitiul1Magazin.Produs;

public class IngrijirePersonala extends Produs {
	private boolean esteReturnabil;

	public IngrijirePersonala(String nume, double pret, int discount, boolean esteReturnabil) {
		super(nume, pret, discount);
		this.esteReturnabil = esteReturnabil;
	}
}
