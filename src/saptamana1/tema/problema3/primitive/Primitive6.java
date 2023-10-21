package saptamana1.tema.problema3.primitive;

/***
 * Creati un program simplu in care sa calculati si sa afisati aria unui dreptunghi.
 * Pentru aceasta va trebui sa definiti variabilele necesare si sa afisati rezultatul
 * System.out.println("Aria dreptunghiului este: " + arieDreptunghi);

 * Ce este aria unui dreptunghi?
 *** Este produsul lungimii si al latimii
 */
public class Primitive6
{
	public static void main(String[] args){
		int lungime = 10;
		int latime = 5;

		int arieDreptunghi = lungime * latime;
		System.out.println("Aria dreptunghiului este: " + arieDreptunghi);

		calculeazaAria(10, 15);
	}

	public static void calculeazaAria(int latime , int lungime){
		int aria = latime * lungime;
		System.out.println("Aria dreptunghiului folosind metoda este: " + aria);

	}
}
