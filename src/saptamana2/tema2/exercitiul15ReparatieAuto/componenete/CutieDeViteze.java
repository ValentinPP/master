package saptamana2.tema2.exercitiul15ReparatieAuto.componenete;

public class CutieDeViteze {
	private String marcaProductie;
	private double pretVanare;
	private boolean automata;

	public CutieDeViteze(String marcaProductie, double pretVanare, boolean automata) {
		this.marcaProductie = marcaProductie;
		this.pretVanare = pretVanare;
		this.automata = automata;
	}

	public String getMarcaProductie() {
		return marcaProductie;
	}

	public double getPretVanare() {
		return pretVanare;
	}

	public boolean isAutomata() {
		return automata;
	}
}


