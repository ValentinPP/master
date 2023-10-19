package curs2Java.wrapper;
/**
 * Fiecare primitiva care clasa sa wrapper. Rolul clasei wrapper este de a reprezenta
 * primitiva ca obiect. Instantele lor sunt imutabile exact ca instantele de String.
 *
 * Boxing   -> punerea unei primitive intr-o referinta/obiect corespunzatoare acelei primitive
 * Unboxing -> punerea unei instante a unei clase Wrapper in primitiva corespunzatoare.
 *
 *
 * byte    -> Byte
 * short   -> Short
 * int
 * */

public class Exercitiul3 {
	public static void main(String[] args) {
		int x = 30;

		Integer x1 =x; // boxing
		Integer x2 = 10;

		int x3 = Integer.valueOf(12); //unboxing
		int x4 = Integer.valueOf("12");

		System.out.println("Valoarea lui x1 este: " + x1);
		System.out.println("Valoarea lui x4 este: " + x4);

		Double d =x1.doubleValue();

		System.out.println("Valoarea lui d este: " + d);

		Boolean valoare1 = Boolean.valueOf(true);

		System.out.println("Valoarea lui valoare1 este: " + valoare1);

	}
}
