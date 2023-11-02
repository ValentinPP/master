package saptamana3.curs2.execitiuTema;

public class Patrat implements FormeGeometrice{
	private int latura;

	public Patrat(int latura) {
		this.latura = latura;
	}

	@Override
	public double calculeazaArie() {
		return latura * latura;
	}

	@Override
	public double calculeazaPerimetru() {
		return latura * 4;
	}
}
