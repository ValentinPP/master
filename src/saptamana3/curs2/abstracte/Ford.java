package saptamana3.curs2.abstracte;

public class Ford extends Masina {
	public Ford(String nume) {
		super(nume);
	}

	public Ford() {
	}

	@Override
	public String merge(String merge) {
		return "Masina mea nu mai merge asa de " + merge;
	}

	@Override
	public void franeaza() {
		System.out.println("Fordul nu mai franeaza pentru ca i s-au stricat franele");
	}
}
