package saptamana2.tema2;

/**
 * Se da urmatorul text:
 * "Am DecIs Sa ImI faC TeMa AstAzI"
 * Scrieti un program prin care sa se afiseze textul scris cu litere mici
 * iar apoi sa se afiseze textul scris cu litere mari.
 **/
public class Exercitiul8 {
	public static void main(String[] args) {
		String givenText = "Am DecIs Sa ImI faC TeMa AstAzI";
		System.out.println("Original: " + givenText);

		String litereMici = givenText.toLowerCase();
		System.out.println("Litere mici: " + litereMici);

		String litereMari = givenText.toUpperCase();
		System.out.println("Litere mari: " + litereMari);

	}
}
