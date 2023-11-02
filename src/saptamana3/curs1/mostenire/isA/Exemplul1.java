package saptamana3.curs1.mostenire.isA;

public class Exemplul1 {
	public static void main(String[] args) {
		Pisica pisica = new Pisica(5, "Tom");


		System.out.println(pisica.varsta);
		System.out.println(pisica.nume);

		pisica.ziceMiau();
	}

}
