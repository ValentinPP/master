package saptamana2.curs2.supraincarcare;

public class Exemplul7 {
	public static void main(String[] args) {

		Pisica pisica = new Pisica("Tom", 7);
		Pisica pisica1 = new Pisica();

		pisica.ziceMiau();
		pisica.ziceMiau(4);
		// pisica.ziceMiau("miau");

		System.out.println(pisica.ziceMiau("ham ham"));



	}

}
