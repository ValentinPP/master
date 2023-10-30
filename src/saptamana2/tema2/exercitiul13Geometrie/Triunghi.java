package saptamana2.tema2.exercitiul13Geometrie;

public class Triunghi {
	private int latura1;
	private int latura2;
	private int latura3;

	public Triunghi(int latura1, int latura2, int latura3) {
		this.latura1 = latura1;
		this.latura2 = latura2;
		this.latura3 = latura3;
	}

	public int getPerimetru() {
		return latura1 + latura2 + latura3;
	}
}
