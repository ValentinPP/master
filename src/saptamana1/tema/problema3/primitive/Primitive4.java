package saptamana1.tema.problema3.primitive;

/**
 * Rezolvati greselile din acest cod
 */
public class Primitive4
{
	public static void main(String[] args)
	{
		int x = 3;
		char c = 'c';

        /*
            Este posibil sa adun o variabila de tip int cu o variabila de tip char?
            Practic un numar cu un caracter?
            Raspuns: DA! Deoarece variabilele de tip char sunt reprezentate de numere
            link: https://www.javatpoint.com/char-keyword-in-java (Primitiva 'char').
            Acest link va ajuta pentru a intelge primitiva 'char' https://www.asciitable.com/
         */
		int adunare = x + c;
		System.out.println(adunare);

		int num1=97;
		char char1=(char)num1;

		int num2=65;
		char char2=(char)num2;

		System.out.println("char1: "+char1);
		System.out.println("char2: "+char2);
	}
}
