package saptamana4.tema4.problema2;

public class Insumare implements Task {
	private int a;
	private int b;

	public Insumare(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void executa() {
		System.out.println("Insumarea numerelor date '" + a + "' si a numarului '" + b + "' este egala cu " + (a + b));
	}
}
