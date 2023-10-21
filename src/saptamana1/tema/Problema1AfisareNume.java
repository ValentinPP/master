package saptamana1.tema;

import java.util.Scanner;

/**
 * O să creați un program simplu în IntelliJ cu numele "AfisareNume". Base package-ul o sa fie același ca și în curs "com.itfactory".
 * O sa va rog ca in clasa creată by default "Main" să copiați aceasta metoda main de mai jos și sa rulati codul.
 * Este un exercițiu simplu în care sa introduceti de la tastatura un text (in cazul asta un nume) pe care il va afisa.
 * Este util sa va uitati în comentariile pe care le-am pus sa vedeti pașii și liniile de cod sa faceți o paralelă cu ce va afișează in consola cand rulati programul. Have fun. (Este un exercitiu de maxim 10 minute).
 * Important e sa fiți atenți la comentarii și la ce face. Este deja scris codul, doar trebuie sa il urmati si sa il executați.

 public static void main(String[] args)
 {
 //Initializez obiectul prin care am capabilitatea sa citesc de la tastatura
 Scanner scanner = new Scanner(System.in);

 //Afisesz un mesaj pentru cererea textului de la tastatura
 //Se va introduce textul cerut dupa care se apasa tasta Enter
 System.out.print("Introduceti numele dumneavoastra: ");
 //Linia de cod care va citi propriuzis textul de la tastatura

 //Definesc variable de tip String(sir de caractere) unde se va afisa textul introdus
 String numelePersoanei = scanner.nextLine();

 //Afisez numele persoanei introdus de la tastatura
 System.out.println("Numele introdus este: " + numelePersoanei);
 }
 **/

public class Problema1AfisareNume {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);  //Initializez obiectul prin care am capabilitatea sa citesc de la tastatura => REZULTATUL va fi ca: Afisesz un mesaj pentru cererea textului de la tastatura. Se va introduce textul cerut dupa care se apasa tasta Enter
		System.out.print("Introduceti numele dumneavoastra: ");

		String numelePersoanei = scanner.nextLine();  //Linia de cod care va citi propriuzis textul de la tastatura => //Definesc variable de tip String(sir de caractere) unde se va afisa textul introdus
		System.out.println("Numele introdus este: " + numelePersoanei);  //Afisez numele persoanei introdus de la tastatura
	}
}
