package saptamana6.curs1.multipleException;

public class Ex6 {
	public static void main(String[] args) {

		try {
			System.out.println("A");

			String litere[] = {"A", "B", "C"};

			int x = Integer.parseInt("1");

			System.out.println("B");

			String litera = litere[10];

			System.out.println("C");
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("D");
			e.printStackTrace();
		}
	}
}
