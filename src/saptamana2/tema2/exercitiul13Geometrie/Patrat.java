package saptamana2.tema2.exercitiul13Geometrie;

public class Patrat {
		private int latura;

	public Patrat(int latura) {
		this.latura = latura;
	}
	public int getPerimetru() {
		return 4 * latura;
	}
	public int getAria() {
		return latura * latura;
	}
}
