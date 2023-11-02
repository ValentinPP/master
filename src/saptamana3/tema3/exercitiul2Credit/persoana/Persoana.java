package saptamana3.tema3.exercitiul2Credit.persoana;

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
}
