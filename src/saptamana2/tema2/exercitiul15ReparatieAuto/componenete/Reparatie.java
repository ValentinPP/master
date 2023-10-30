package saptamana2.tema2.exercitiul15ReparatieAuto.componenete;

import saptamana2.tema2.exercitiul15ReparatieAuto.componenete.Motor;
import saptamana2.tema2.exercitiul15ReparatieAuto.componenete.CutieDeViteze;
public class Reparatie {
	private String marcaProductie;
	private double costReparatie;
	private Motor motor;
	private CutieDeViteze cutieDeViteze;

	public Reparatie(String marcaProductie, double costReparatie, Motor motor, CutieDeViteze cutieDeViteze) {
		this.marcaProductie = marcaProductie;
		this.costReparatie = costReparatie;
		this.motor = motor;
		this.cutieDeViteze = cutieDeViteze;
	}
	public double calculatiCostulDeReparatie() {
		if (marcaProductie.equals(motor.getMarcaProductie()) && marcaProductie.equals(cutieDeViteze.getMarcaProductie())) {
			double costFinal = costReparatie + motor.getPretDevanzare() + cutieDeViteze.getPretVanare();
			if (cutieDeViteze.isAutomata()) {
				costFinal = costFinal + 2150.75;
			}
			return costFinal;
		} else {
			System.out.println("Costul de productie nu poate fi stabilit. Componente gresite");
			return 0;
		}
	}
}
