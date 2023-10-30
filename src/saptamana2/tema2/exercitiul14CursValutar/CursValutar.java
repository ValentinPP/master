package saptamana2.tema2.exercitiul14CursValutar;

public class CursValutar {
	private double cursEUR;
	private double cursUSD;
	private double cursGBP;

	// Constructor
	public CursValutar(double cursEUR, double cursUSD, double cursGBP) {
		this.cursEUR = cursEUR;
		this.cursUSD = cursUSD;
		this.cursGBP = cursGBP;
	}

	public double schimbaInEUR(double sumaRON) {
		return sumaRON / cursEUR;
	}

	public double schimbaInUSD(double sumaRON) {
		return sumaRON / cursUSD;
	}

	public double schimbaInGBP(double sumaRON) {
		return sumaRON / cursGBP;
	}

	public void setCursEUR(double cursEUR) {
		this.cursEUR = cursEUR;
	}

	public void setCursUSD(double cursUSD) {
		this.cursUSD = cursUSD;
	}

	public void setCursGBP(double cursGBP) {
		this.cursGBP = cursGBP;
	}
	public void schimbaCursulMonedei(String moneda, double noulCurs) {
		switch (moneda.toUpperCase()) {
			case "EUR":
				cursEUR = noulCurs;
				break;
			case "USD":
				cursUSD = noulCurs;
				break;
			case "GBP":
				cursGBP = noulCurs;
				break;
			default:
				System.out.println("Monedă invalidă!");
				break;
		}
	}
}

