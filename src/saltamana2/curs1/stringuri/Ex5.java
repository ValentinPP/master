package saltamana2.curs1.stringuri;

public class Ex5 {
	public static void main(String[] args) {
		String s1 = "Hello World";

		String s2 = s1.substring(0,3); // de la 0 la 3 dar fara 3 [0,3)
		System.out.println(s2);

		String s3 = "Aceasta propozitie este prea mare" ;

		if(s3.length() >10 ) {
			System.out.println("Aceasta fraza este prea mare pt ca are " + s3.length() + " caractere");
		} else {
			System.out.println("fraza nu este prea mare");
		}

		System.out.println("..........................");

		for (int i = 0; i < s3.length(); i++){
			System.out.println("Fraza este prea mare printat e numarul lungimii stringului");
		}
	}
}
