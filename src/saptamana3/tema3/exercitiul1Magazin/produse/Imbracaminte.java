package saptamana3.tema3.exercitiul1Magazin.produse;

public class Imbracaminte {
	private String nume;
	private double pret;
	private int discount;

	private String tipProdusImbracaminte;

	public Imbracaminte(String nume, double pret, int discount, String tipProdusImbracaminte) {
		this.nume = nume;
		this.pret = pret;
		this.discount = discount;
		this.tipProdusImbracaminte = tipProdusImbracaminte;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double calculPretCuDiscount() {
		if (this.nume.equalsIgnoreCase("pantaloni")) {
			return this.pret - (this.pret * 10 / 100); // Apply a 10% discount for trousers
		} else if (this.nume.equalsIgnoreCase("bluza")) {
			return this.pret - (this.pret * 20 / 100); // Apply a 20% discount for blouse
		} else if (this.nume.equalsIgnoreCase("accesoriu")) {
			return this.pret - (this.pret * 30 / 100); // Apply a 30% discount for accessories
		} else {
			System.out.println("Tip de îmbrăcăminte necunoscut!");
			return this.pret;
	}
	}
}
