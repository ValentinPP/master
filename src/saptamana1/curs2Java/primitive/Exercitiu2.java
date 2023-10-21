package saptamana1.curs2Java.primitive;

public class Exercitiu2 {
	public static void main (String []args){
		int x = 10;
		final int Y = 11;
		final String NUMELE_MEU = "Gigel"; //e un const, nu se mai  modifica
		float a = 23.4567891237777777777777777777777777f; //limiteaza afisarea la 7 decimale
		double b = 55.12345678901234567890123; // limiteaza afisarea la 15 decimale

		System.out.println("valoarea lui x este:" + x);
		System.out.println("valoarea lui y este:" + Y);
		System.out.println("valoarea lui NUMELE_MEU este:" + NUMELE_MEU);
		System.out.println("valoarea lui a este:" + a);
		System.out.println("valoarea lui b este:" + b);

		x = 20;
		//int Y = 12; //daa este declarata ca si final nu se mai poate modifica

		System.out.println("valoarea lui x este:" + x);
	}
}
