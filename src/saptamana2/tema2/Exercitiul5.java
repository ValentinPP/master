package saptamana2.tema2;

//Andrei este elev in clasa a5-a.
//Andrei a fost obraznic iar profesoara l-a pus sa scrie pe tabla de 100 de ori "Nu o sa mai fiu obraznic".
//Andrei este insa inteligent si se foloseste de programare pentru a scrie pe table mesajul de 100 de ori.
//Ajutati-l pe Andrei.

public class Exercitiul5 {
	public static void main(String[] args) {
		int counter = 0;
		for (int i = 1; i <= 100; i++){
			System.out.println(i + " Nu o sa mai fiu obraznic! " );
			counter++;
		}
		System.out.println("Numarul iteratiilor " + counter);
	}
}
