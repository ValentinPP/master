package saptamana4.curs2.equalsHashCode;

public class Ex1 {
	public static void main(String[] args) {
		Mar mar1 = new Mar("rosu", 4.50);
		Mar mar2 = new Mar("rosu", 4.50);
		Mar mar3 = new Mar("galben", 4.50);

		boolean x = mar1 == mar2; // nu sunt egale pentru ca desi au valoare egala nu sunt stocate pe acceasi pozitie si daca locatia de unde se stocheaza e diferita desi valoarea este egala ele sunt diferite

		System.out.println("asta este x: " + x);

		System.out.println("mar1 este: " + mar1 + " mar2 este: " + mar2);
		System.out.println("mar1 este: " + mar1.getCuloare() + " " + mar1.getPret());

		boolean y = mar1.equals(mar2);
		System.out.println("asta este y: " + y);

		y = mar1.equals(mar2);
		System.out.println("asta este new y: " + y);

		boolean z = mar1 == mar3; // echivalare de pret
		System.out.println("asta este z: " + z);

		Pisica pisica = new Pisica();
		pisica.setCuloare("rosu");
		pisica.setPret(4.50);

		System.out.println("aici " + mar1.equals(pisica)); //clasele nu sunt egale
	}
}
