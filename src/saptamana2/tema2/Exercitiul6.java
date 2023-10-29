package saptamana2.tema2;
/**Se da urmatorul text:
		"Ma numesc NumePrenume si sunt cursant la cursul de testare din cadrul companiei facebook."
		Sa se scrie un program prin care sa se corecteze textul si sa se inlocuiasca cuvintele gresite:
		Aspecte:
		1. "NumePrenume" - se va inlocui cu numele cursantului.
		2. "testare" - se va inlocui cu tipul de curs la care participati.
		3. "facebook" - se va inlocui cu numele companiei unde participati la curs.

**/
public class Exercitiul6 {
	public static void main(String[] args) {
		String givenText = "Ma numesc NumePrenume si sunt cursant la cursul de testare din cadrul companiei facebook.";

		System.out.println("Textul inainte de a fi editat este: " + givenText);

		givenText = givenText.replace("NumePrenume", "Valentin Paun");
		givenText = givenText.replace("testare", "JAVA");
		givenText = givenText.replace("facebook", "itFactory");

		String afterReplace = givenText;

		System.out.println("Textul dupa modificare este: " + afterReplace);

		//Using predefined variables:

		String nume = "Valentin Paun";
		String curs = "JAVA";
		String companie = "itFactory";

		System.out.println("Textul cu modificarea stricta a variabliei este: " + "Ma numesc " + nume + " si sunt cursant la " + curs + " de testare din cadrul companiei " + companie + ". ");

	}
}
