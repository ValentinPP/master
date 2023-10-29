package saptamana2.curs1.stringuri;

public class StringExemplul1 {
	public static void main(String[] args) {

		String s1 = "Hello World!";
		String s2 = "Hello World!";

		String s3 = new String("Hello World!");
		boolean x = s1 == s2;

		System.out.println(x);

		System.out.println("Folosing echivalare in acelasi string pool -> " + (s1 == s2));
		System.out.println("Folosind doar caracterele indiferent de locatia tringului ->" + (s1 == s3));
		System.out.println("Folosind equals -> " + s1.equals(s3));

		String s4 = "Hello";
		String s5 = "Hello";
		System.out.println("Date din pool -> " + (s4.equals(s5)));

		s5 = s5 + "World";  // se poate folosi pt lucruri care nu pot stat in memorie mult timp - ex o parola a.i cand se face memory dump se poate sterge rapidd
		System.out.println("Redeclarare si adaugare de date -> "  + (s4.equals(s5)));

	}
}
