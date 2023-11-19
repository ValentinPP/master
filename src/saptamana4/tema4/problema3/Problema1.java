package saptamana4.tema4.problema3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

// Se da o lista de numere întregi. Sa se afișeze cel mai mare număr din lista
public class Problema1 {
	public static void main(String[] args) {
		List<Integer> listaNumere = new ArrayList<>();

		listaNumere.add(1);
		listaNumere.add(2);
		listaNumere.add(3);
		listaNumere.add(4);
		listaNumere.add(5);
		listaNumere.add(6);
		listaNumere.add(7);
		listaNumere.add(8);
		listaNumere.add(9);

		System.out.println("Lista initiala " + listaNumere);

		List<Integer> extendedList = new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70,80,90));
		System.out.println("Lista numarul 2 " + extendedList);

		listaNumere.addAll(extendedList);

		System.out.println("Lista 1 + Lista 2 " + listaNumere);

		List<Integer> randomNumbers = new ArrayList<>();
		Random random = new Random();

		for(int i = 0; i < 9; i++){
			int randomNumber = random.nextInt(101);
			randomNumbers.add(randomNumber);
		}
		System.out.println("Numerele generate random sunt: " + randomNumbers);

		listaNumere.addAll(randomNumbers);
		System.out.println("Lista 1 + Lista 2 + Lista din Random " + listaNumere);

		int bigNumber = 0;
		for (int numar : listaNumere){
			if (numar > bigNumber) {
				bigNumber = numar;
			}
		}
		System.out.println("Cel mai mare numar din lista este: " + bigNumber);

	}
}
