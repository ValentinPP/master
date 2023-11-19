package saptamana4.tema4.problema3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Se dau doua liste de numere întregi (sau string-uri la alegerea voastră).
// Sa se creeze o lista ce conțin elementele comune din cele doua liste
public class Problema3 {
	public static void main(String[] args) {
		List<Integer> primaLista = new ArrayList<>();
		List<Integer> aDouaLista = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 10; i++){
			int randomNumbers = random.nextInt(101);
			primaLista.add(randomNumbers);
		}
		System.out.println("Numerele generate pentru prima lista sunt: " + primaLista);

		for (int i = 0; i < 10; i++){
			int randomNumbers = random.nextInt(101);
			aDouaLista.add(randomNumbers);
		}
		System.out.println("Numerele generate pentru prima lista sunt: " + aDouaLista);

		List<Integer> elementeComune = new ArrayList<>();
		boolean existaElementeComune = false;

		for(int numar : primaLista){
			if(aDouaLista.contains(numar)){
				elementeComune.add(numar);
				existaElementeComune = true;
			}
		}
		if(!existaElementeComune){
			System.out.println("Nu exista nici un numar comun!");
		} else {
			System.out.println("Elementele comune sunt: " + elementeComune);
		}
	}
}
