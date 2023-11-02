package saptamana3.curs1.polimorfism;

public class Exemplul6 {
	public static void main(String[] args) {

		Animal animal = new Pisica();

		animal.zice();

		System.out.println(animal.nume);

		boolean x = animal instanceof Pisica;
		System.out.println(x);

		if(animal instanceof Animal){
			System.out.println("obiectul este de tip Pisica");
		} else {
			System.out.println("obiectul este de tip Caine");
		}

		Animal animal2 = new Caine();

		if(animal2 instanceof Caine){
			System.out.println("obiectul este de tip Caine");
		} else {
			System.out.println("obiectul este de tip Pisica");
		}

	}
}
