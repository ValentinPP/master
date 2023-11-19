package saptamana4.tema4.problema2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Sa se un program in Java pe baza urmatoarelor cerinte.
//1. Sa se creeze o interfata Task in care se va declara metoda executa. ("void executa();")
//2. Se va crea o clasa Printer care va implementa implementa interfata Task. Aceasta clasa va avea un parametru de tip String (folositi constructor cu parametri). Metoda execute implementata din interfata va afisa string-ul respectiv.
//3. Se va crea o clasa Insumare care va implementa implementa interfata Task. Aceasta clasa va avea doi parametri de tip int(folositi constructor cu parametri). Metoda execute implementata din interfata va afisa suma celor doua numeree.
//4. Se va crea o clasa Main cu metoda main unde se va initializa o lista de Task-uri (folosind List din java).
//5. Se va crea o bucla for de 10 iteratii in care la fiecare iteratie se va genera un numar random intre 0 si 1. Daca numarul generat este 0 atunci se va introduce in lista un task de tipul Printer. Daca numarul generat este 1 se va introduce in lista un task de tipul Insumare. La constructie alegeti voi parametrii.
//6. Se va parcurge lista si se vor executa task-urile fiecarui element.

public class Main {
	public static void main(String[] args) {
		List<Task> listaTaskuri = new ArrayList<>();

		for (int i = 0; i < 10; i++){
			Random random = new Random();
			int tipTask = random.nextInt(2);

			if(tipTask == 0) {
				listaTaskuri.add(new Printer("textul pentru Printer " + i));
			} else {
				int a = random.nextInt(100);
				int b = random.nextInt(100);
				listaTaskuri.add(new Insumare(a,b));
			}
		}
		for (Task task : listaTaskuri){
			task.executa();
		}
	}
}
