package saptamana2.curs2.metode;

public class Angajat {
	String numeMic;
	double salariuBrut;

	public Angajat(String nume, double salariuBrut) {
		this.numeMic = nume;
		this.salariuBrut = salariuBrut;
	}

	public Angajat(){

	}


	public double calculeazaSalariuNet(int salariu){
		double salariuNet =  salariu * 0.45;
		return salariuNet;

	}

	public double calculeazaSalariuNet(){
		double salariuNet =  this.salariuBrut * 0.45;
		return salariuNet;

	}
}
