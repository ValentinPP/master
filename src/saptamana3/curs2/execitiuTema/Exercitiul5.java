package saptamana3.curs2.execitiuTema;

public class Exercitiul5 {
	public static void main(String[] args) {
		FormeGeometrice dreptunghi = new Dreptunghi(56,40);
		double arie = dreptunghi.calculeazaArie();
		double perimetru = dreptunghi.calculeazaPerimetru();

		System.out.println("aria este : " + arie + " perimetrul este: " + perimetru);

		FormeGeometrice formeGeometrice = new Patrat(36);

		double arie2 = formeGeometrice.calculeazaArie();
		double perimetru2 = formeGeometrice.calculeazaPerimetru();

		System.out.println("aria este : " + arie2 + " perimetrul este: " + perimetru2);
	}



}
