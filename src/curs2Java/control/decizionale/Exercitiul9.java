package curs2Java.control.decizionale;

public class Exercitiul9 {
	public static void maine(String[] args) {

		//true + true = toate conditia este true
		if (( 3 >2) && (5 > 4 )){
			System.out.println("True + True = true");
		}else {
			System.out.println("Un sau amble conditii sunt adevarate");
		}

		if (( 3 <= 2) && (5 > 4 )){
			System.out.println("False + True = false");
		}else {
			System.out.println("Un sau amble conditii sunt adevarate");
		}

		// true ||  // false = true
		//False || // False
	}
}
