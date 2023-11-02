package saptamana3.curs1.mostenire.hasA;

public class Exemplul2 {
	public static void main(String[] args) {
		Adresa adresa= new Adresa("Calea Mosilor", "1000");
		adresa.setStrada("Bld. Regina Maria");
		adresa.setNumar("7654");

		Buletin buletin = new Buletin("1800303101010", "RX");

		Persoana persoana = new Persoana();
		persoana.setNume("Gigel");
		persoana.setAdresa(adresa);
		persoana.setBuletin(buletin);

		System.out.println(persoana.getAdresa().getStrada());
		System.out.println(persoana.getBuletin().getCnp());
		System.out.println(persoana.getAdresa().getNumar());

		Persoana persoan2 = new Persoana("Ionel", buletin, adresa);
	}
}
