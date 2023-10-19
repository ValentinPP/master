package curs2Java.control.repetitive;

import java.util.Scanner;

public class ExercitiuScanner {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Introdu nume: ");
//		String name = scanner.nextLine();
//
//		System.out.println("Salut: " + name);
//
//	}
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

		System.out.print("Introduceti prenumele dumneavoastra: ");
		String prenumelePersoanei = scanner.nextLine();
		System.out.println("Prenumele introdus este: " + prenumelePersoanei);

		System.out.println("Numele introduse sunt: " + numelePersoanei + " " + prenumelePersoanei);
	}

}
