package saptamana1.curs2Java.control.decizionale;

public class Exercitiul11 {
	//psvm
	public static void main(String[] args) {
		int x = 4;
		int y = 5;
		double z = 3.2;

		String raspuns = (y > x) ? " y este mai mare ca x" : "x este mai mare ca y";

		System.out.println(raspuns);

		String valoare = valoareMaiMare(5,6);
		double suma = calculeazaSuma(x, z);

		System.out.println(suma);

	}

	public static String valoareMaiMare(int x, int y) {
		if(y > x) {
			return "y este mai mare ca x";}
		else {
			return "x este mai mare ca y";
		}
	}

	public static double calculeazaSuma( int x, double z){
		double suma = x + z;
		return suma;
	}
}
