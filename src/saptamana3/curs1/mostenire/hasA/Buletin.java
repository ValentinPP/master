package saptamana3.curs1.mostenire.hasA;

public class Buletin {

	String cnp;
	String serie;


	public Buletin(String cnp, String serie) {
		this.cnp = cnp;
		this.serie = serie;
	}

	public String getCnp() {
		return cnp;
	}

	public void setCnp(String cnp) {
		this.cnp = cnp;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}
}
