package saptamana3.tema3.exercitiul1Magazin;

public class Produs {
	String nume;
	double pret;
	int discount;

	public Produs(String nume, double pret, int discount) {
		this.nume = nume;
		this.pret = pret;
		setDiscount(discount);
	}

	public void setDiscount(int discount) {
		if (discount >= 0 && discount <= 100) {
			this.discount = discount;
		} else {
			throw new IllegalArgumentException("Discount-ul trebuie să fie între 0 și 100.");
		}
	}

	public double calculPretCuDiscount() {
		double pretCuDiscount = pret - (pret * discount / 100);
		return pretCuDiscount;
	}
}

