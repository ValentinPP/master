package saptamana2.tema2.exercitiul12.componente;

import saptamana2.tema2.exercitiul12.electronice.MemorieSSD;
import saptamana2.tema2.exercitiul12.electronice.Ram;

public class Laptop {
	private String marca;
	private String culoare;
	private double dimensiuneEcran;
	private Ram ram;

	private MemorieSSD memorieSSD;

	public Laptop(String marca, String culoare, double dimensiuneEcran, String tipRam, String masuraRAM, int capacitateRAM, int capacitateSSD, String masuraSSD) {
		this.marca = marca;
		this.ram = new Ram(tipRam, masuraRAM, capacitateRAM);
		this.culoare = culoare;
		this.dimensiuneEcran = dimensiuneEcran;
		this.memorieSSD = new MemorieSSD(capacitateSSD, masuraSSD);

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public double getDimensiuneEcran() {
		return dimensiuneEcran;
	}

	public void setDimensiuneEcran(double dimensiuneEcran) {
		this.dimensiuneEcran = dimensiuneEcran;
	}

}