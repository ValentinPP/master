package saptamana3.curs1.mostenire.hasA;

public class Persoana {
	private String nume;
	private Buletin buletin;
	private Adresa adresa;

	public Persoana(String nume, Buletin buletin, Adresa adresa) {
		this.nume = nume;
		this.buletin = buletin;
		this.adresa = adresa;
	}

	public Persoana() {
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Buletin getBuletin() {
		return buletin;
	}

	public void setBuletin(Buletin buletin) {
		this.buletin = buletin;
	}

	public Adresa getAdresa() {
		return adresa;
	}

	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
}
