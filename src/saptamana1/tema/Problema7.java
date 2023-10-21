package saptamana1.tema;

/**
 * Scrieți un program în care afișați toate numerele întregi de la -100 la 100,
 * mai puțin cele divizibile cu 2 sau cu 3.
 **/
public class Problema7 {
	public static void main(String[] args) {
		for( int i = -100; i <= 100; i++){
			if(i % 3 != 0 && i % 2 != 0) {
				System.out.println("Numerele care nu se impart la 2 si 3 sunt: " + i);
			}
		}
	}
}
