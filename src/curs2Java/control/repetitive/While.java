package curs2Java.control.repetitive;

public class While {
	public static void main(String[] args) {
		int i = 0;

		while (i <= 10) {
			System.out.println(i);
			i = i + 1; //i++
		}

		while (i >= -10) {
			System.out.println(i);
			i--;
		}
	}
}
