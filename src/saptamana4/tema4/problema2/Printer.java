package saptamana4.tema4.problema2;

public class Printer implements Task{
	private String text;

	public Printer(String text) {
		this.text = text;
	}

	@Override
	public void executa() {
		System.out.println("Printeaza " + text);
	}
}
