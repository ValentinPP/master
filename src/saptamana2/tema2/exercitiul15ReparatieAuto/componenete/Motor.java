package saptamana2.tema2.exercitiul15ReparatieAuto.componenete;

public class Motor {
	private String marcaProductie;
	private double capacitateMotor;
	private double pretDevanzare;

	public Motor(String marcaProductie, double capacitateMotor, double pretDevanzare) {
		this.marcaProductie = marcaProductie;
		this.capacitateMotor = capacitateMotor;
		this.pretDevanzare = pretDevanzare;
	}

	public String getMarcaProductie() {
		return marcaProductie;
	}

	public double getCapacitateMotor() {
		return capacitateMotor;
	}

	public double getPretDevanzare() {
		return pretDevanzare;
	}
}
