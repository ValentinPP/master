package saptamana1.tema.problema3.primitive;

/***
 * Creati un program simplu in care sa calculati si sa afisati perimetrul unui triunghi
 *  Pentru aceasta va trebui sa definiti variabilele necesare si sa afisati rezultatul
 * System.out.println("Perimetrul triunghiului este: " + perimetruTriunghi);

 * Ce este perimetrul unui triunghi?
 *** Este suma lungimilor laturilor
 */
public class Primitive5
{
	public static void main(String[] args)
	{
		int latura1 = 5;
		int latura2 = 7;
		int latura3 = 3;

		int perimetruTriunghi = latura1 + latura2 +latura3;

		System.out.println("Perimetrul triunghiului este: " + perimetruTriunghi);

		calculeazaPerimetrulTriunghiului(10, 15,20);
	}

	public static void calculeazaPerimetrulTriunghiului( int latura1, int latura2, int latura3) {
		int perimetrulTriunghiului = latura1 + latura2 +latura3;

		System.out.println("Perimetrul triunghiului folsind metoda este: " + perimetrulTriunghiului);
	}
}
