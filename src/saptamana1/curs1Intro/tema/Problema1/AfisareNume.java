package saptamana1.curs1Intro.tema.Problema1;

import java.util.Scanner;

public class AfisareNume {
	public static void main(String[] args)
	{
		//Initializez obiectul prin care am capabilitatea sa citesc de la tastatura
		Scanner scanner = new Scanner(System.in);

		//Afisesz un mesaj pentru cererea textului de la tastatura
		//Se va introduce textul cerut dupa care se apasa tasta Enter
		System.out.print("Introduceti numele dumneavoastra: ");

		//Linia de cod care va citi propriu-zis textul de la tastatura
		//Definesc variable de tip String(sir de caractere) unde se va afisa textul introdus
		String numelePersoanei = scanner.nextLine();

		//Afisez numele persoanei introdus de la tastatura
		System.out.println("Numele introdus este: " + numelePersoanei);
	}

}
