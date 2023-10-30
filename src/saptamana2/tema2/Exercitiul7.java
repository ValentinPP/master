package saptamana2.tema2;

/**
 * Se da urmatorul text:
 * "avion avion avion avion avion avion avion avion , masina masina masina masina masina masina masina"
 * Scrieti un program prin care sa se inlcouiasca primele 5 instante ale cuvantului "avion" cu cuvantul "racheta"
 * si primele 3 instante ale cuvantului "masina" cu cuvantul "autobuz" din textul dat.
 * <p>
 * Aspecte.
 * 2. Output: racheta racheta racheta racheta racheta avion avion avion , autobuz autobuz autobuz masina masina masina masina
 **/
public class Exercitiul7 {
	public static void main(String[] args) {
		String givenText = "avion avion avion avion avion avion avion avion , masina masina masina masina masina masina masina";

		System.out.println("Inainte de editare: " + givenText);

		for( int avionReplaced = 0 ; avionReplaced < 5 ; avionReplaced++){
			givenText = givenText.replaceFirst("avion", "racheta");
		}

		for( int masinaReplaced = 0; masinaReplaced < 3; masinaReplaced++){
			givenText = givenText.replaceFirst("masina", "autobuz");
		}
		//replace - modifica toate iteratiile
		//replace first - modifica doar prima iteratie
		//daca folosim if cu replace first fara sa aiba incrementare se modifica doar prima iteratie

		System.out.println("Dupa editare: " + givenText);
	}
}





