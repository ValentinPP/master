package saptamana3.tema3.exercitiul1Magazin.produse.electronice;

import saptamana3.tema3.exercitiul1Magazin.produs.Produs;

public class Electronice extends Produs {
	int voltaj;

	public Electronice(String productName, double productPrice, double applicableDiscount, boolean esteReturnabil, int voltaj) {
		super(productName, productPrice, applicableDiscount, esteReturnabil);
		this.voltaj = voltaj;
	}

	public void setVoltaj(int voltaj) {
		this.voltaj = voltaj;
	}

	public int getVoltaj() {
		return voltaj;
	}

	public int checkVoltageNeeds() {
		if (this.voltaj >= 220 && this.voltaj <= 240) {
			return this.voltaj;
		} else {
			System.out.println("Voltajul nu este in parametri necesari! Aparatul nu functioneaza in reateaua energetica EU.");
		}
		return this.voltaj;
	}

	public boolean canBeUsed() {
		if (this.voltaj >= 220 && this.voltaj <= 240) {
			System.out.println("Aparatul se poate folosi!");
		} else {
			System.out.println("Aparatul NU se poate folosi!");
		}

		return false;
	}

//	public void canBeUsed() {
//		if (voltaj >= 220 && voltaj <= 240) {
//			this.voltaj = voltaj;
//		} else {
//			throw new IllegalArgumentException("Voltajul trebuie să fie între 220 și 240.");
//		}
//	}

}

