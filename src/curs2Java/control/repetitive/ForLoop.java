package curs2Java.control.repetitive;

public class ForLoop {
	public static void main(String[] args) {
		for(int i = 0; i <= 10 ; i++){
			System.out.println("valoarea lui i este: " + i);
		}

		for( int x = 0; x < 10 ; x++){
			System.out.println("valoarea lui x este: " + x);

			if ( x == 5){
				break;
			}
		}
	}
}
