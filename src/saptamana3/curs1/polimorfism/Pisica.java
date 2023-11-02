package saptamana3.curs1.polimorfism;

public class Pisica extends Animal {
	String nume;

	public Pisica() {
		this.nume= "nume din clasa Pisica";
		super.nume = "nume din clasa Animal";
	}

	@Override
	public void zice() {
		System.out.println("Motoda apelata din clasa Pisica");
	}
}
