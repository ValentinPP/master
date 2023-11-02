package saptamana3.curs2.execitiuTema;

public class Dreptunghi implements FormeGeometrice, Test{

	private int lungime;
	private int latime;

	public Dreptunghi(int lungime, int latime) {
		this.lungime = lungime;
		this.latime = latime;
	}

	public Dreptunghi() {
	}

	public int getLungime() {
		return lungime;
	}

	public void setLungime(int lungime) {
		this.lungime = lungime;
	}

	public int getLatime() {
		return latime;
	}

	public void setLatime(int latime) {
		this.latime = latime;
	}

	@Override
	public double calculeazaArie() {
		double arie = this.lungime * this.latime;
		return arie;
	}

	@Override
	public double calculeazaPerimetru() {
		return 2 * (lungime + latime); // se mai poate scrie si asa care este acelasi lucru ca cel de sus de la arie
	}
}
