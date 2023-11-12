package saptamana4.tema4.proiect.modal;

public abstract class Curs {
	private String nume;
	private int pret;

	public Curs(String nume, int pret) {
		this.nume = nume;
		this.pret = pret;
	}

	public Curs(String nume) {
		this.nume = nume;
	}
	public Curs(int pret){
		this.pret = pret;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getPret() {
		return pret;
	}

	public void setPret(int pret) {
		this.pret = pret;
	}

	@Override
	public String toString() {
		return "Curs{" +
				"nume='" + nume + '\'' +
				", pret=" + pret +
				'}';
	}
}
