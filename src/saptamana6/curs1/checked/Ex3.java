package saptamana6.curs1.checked;

public class Ex3 {
	public static void main(String[] args) {
		try {
			System.out.println("A");
			doSomething(25);
			System.out.println("B");
		} catch (MyCheckedException e) {
			System.out.println("C");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} finally {
			System.out.println("D");
		}

	}

	public static void doSomething(int x) throws MyCheckedException {
		if (x > 10) {
			throw new MyCheckedException("Numarul esdte mai mare ca 10");
		}
		System.out.println("Totul este ok!");
	}
}
