package saptamana3.tema3.exercitiul2Credit.banca;

import saptamana3.tema3.exercitiul2Credit.persoana.Persoana;

public class BancaPentruLocuinte implements UnitateBancara{
	@Override
	public double calculCredit(Persoana persoana) {
		double credit = persoana.getSalariuNet() * 100;
		return credit;
	}

//	@Override
//	public double calculDobanda(Persoana persoana) {
//		return 0;
//	}
}
