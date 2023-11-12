package saptamana4.curs1.array;

import java.util.Arrays;

public class Ex2 {
	public static void main(String[] args) {

		String x[] = {"gigel", "ionel", "vasile"};

		for (String s : x) {
			if (!s.equalsIgnoreCase("gigel")) {
				System.out.println("Remove ce nu este egal " + s + "\n");
			}
		}

		Arrays.stream(x)
				//.filter(e -> e.equals("gigel"))  //returneaza doar ce este specificat in flitru
				.forEach(s -> System.out.println(s));
	}
}
