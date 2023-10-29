package saptamana2.curs2.contructorThis;

public class Utilizator {
	String nume;
	int varsta;

	public Utilizator(String nume, int varsta) {
		this.nume = nume;
		this.varsta = varsta;
	}

	public Utilizator() {
		this("Gigel", 25);
	}


	public void doSomething(){
		int x = 3;
		System.out.println(this.varsta);
		x = 8;
	}

	public void doNothing(){
		//  x = 9;
		this.varsta = 8;
	}


}
