package saptamana3.curs1.hidingFields;

public class Exemplul3 {
	public static void main(String[] args) {
		Masina masina = new Masina();

		Autovehicul autovehicul = new Masina(); // POLIMORFISM

		System.out.println(masina.numeConstructor);
		System.out.println(autovehicul.numeConstructor);




	}
}
