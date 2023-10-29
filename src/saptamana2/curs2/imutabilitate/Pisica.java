package saptamana2.curs2.imutabilitate;

public class Pisica {
	private String nume;
	private int varsta;

	public Pisica(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
	}

	public String getNume() {
		return nume;
	}

	public int getVarsta() {
		return varsta;
	}


	private Pisica() {
	}
}
