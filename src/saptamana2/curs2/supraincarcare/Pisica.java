package saptamana2.curs2.supraincarcare;

public class Pisica {
	String nume;
	int varsta;

	public Pisica(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
	}

	public Pisica() {
	}

	public Pisica(String nume) {
		this.nume = nume;
	}

	public Pisica(int varsta) {
		this.varsta = varsta;
	}

	public void ziceMiau(){
		System.out.println("Pisica zice miau");
	}

	public String ziceMiau(String miau){
		return "Pisica zice " + miau;
	}

	public void ziceMiau(int x){
		System.out.println("Pisica zice miau de " + x + " ori");
	}
}
