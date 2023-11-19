package saptamana4.curs1.array;

import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {

		String x[] = {"gigel", "ionel", "vasile"};
		System.out.println("Asta este x: " + x);

		for (String s : x) {
			System.out.println("this is s: " + s);
//			if (!s.equalsIgnoreCase("gigel")) {
//				System.out.println("Remove ce nu este egal " + s + "\n");
//			}
		}
		for( int s=0 ; s< x.length; s++){
			System.out.println("Classic loop " + x[s]);

		}

		Arrays.stream(x)
				//.filter(e -> e.equals("gigel"))  //returneaza doar ce este specificat in flitru
				.forEach(s -> System.out.println(s));
	}
}
