package saptamana3.tema3.exercitiul2Credit.banca;

import saptamana3.tema3.exercitiul2Credit.persoana.Persoana;

public class BancaPentruNevoiePersonale implements UnitateBancara{

	@Override
	public double calculCredit(Persoana persoana) {
		double credit = persoana.getSalariuNet() * 10;
		return credit;
	}

	@Override
	public double calculDobanda(Persoana persoana) {
		double dobanda = persoana.getSalariuNet() * 10 * 0.08;
		return dobanda;
	}
}
