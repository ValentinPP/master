package saptamana2.tema2.exercitiul13Geometrie;

public class Dreptunghi {
	private int latime;
	private int lungime;

	public Dreptunghi(int latime, int lungime) {
		this.latime = latime;
		this.lungime = lungime;
	}
	public int getPerimetru() {
		return 2 * (latime + lungime);
	}
	public int getAria() {
		return latime * lungime;
	}
}
