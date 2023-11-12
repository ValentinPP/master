package saptamana4.curs1.array;

public class Ex1 {
	public static void main(String[] args) {
		int x[] = new int[4];

		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		x[3] = 4;

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		System.out.println("-------------------");

		for (int y : x) { //for enhanced
			System.out.println(y);
		}

		System.out.println("-------------------");

		for (int y : x) { //for enhanced
			if (y % 2 == 0) {
				System.out.println("Este numar par " + y);
			}
		}
	}
}
