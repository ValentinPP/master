package saltamana2.curs1.stringuri;

public class Ex4 {
	public static void main(String[] args) {
		String s1 = "Afara este rece!            " ;

		if(s1.isEmpty() == false) {  //(!s1.isEmpty)
			System.out.println("lungimea sirului este: " + (s1.length()));
			s1 = s1.trim(); //am creat un nou sstring
			System.out.println("Lungimea sirului de caractere dupa indepartarea spatiilor goale " +
					(s1.length()));
		} else {
			System.out.println("Sirul nu contine nici un caracter");
		}
	}
}
