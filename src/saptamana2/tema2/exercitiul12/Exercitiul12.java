package saptamana2.tema2.exercitiul12;
/**
 * Se dau resursele din proiectul TemaCapitolul3:
 * Se cer urmatoarele implementari.
 * 1.Sa se ajusteze clasa Laptop in care sa se adauge doua proprietati.
 * Una va fi de tip Ram, iar cealalata va fi de tipul MemorieSSD.
 * Ambele proprietati vor fi declarate cu modificatorul de access "private".
 * 2. Ajustati corespunzator constructorii (in cazul in care sunt) si implementati getters & setters pentru noile valori.
 * Atentie: Unde nu s-au implementat pentru proprietatile din clasa, implementati corespunzator.
 * 3. in clasa com.itfactory.Main, in metoda main se va crea un obiect de tipul Laptop si se vor atribui valori tutoror proprietatilor, corespunzator.
 * (Atentie: Unde aveti constructor cu parametrii, folositi-l. Pentru simplitate, daca doriti va puteti crea constructori cu parametri in clase).
 * 4. Se vor afisa toate detaliile unui obiect creat de tipul Laptop.

 * Exemplu de afisare:
 * Detalii laptop:
 * Marca: Asus
 * Culoare: Negru
 * Dimensiune Ecran: 15.6

 * Memorie RAM:
 * Tip memorie RAM: DDR3
 * Unitate de Masura Memorie RAM: GB
 * Capacitate memorie RAM: 16

 * Spatiu de stocare SSD:
 * Capacitate stocare SSD: 256
 * Unitate de masura stocare SSD: GB
 **/

import saptamana2.tema2.exercitiul12.componente.Laptop;
import saptamana2.tema2.exercitiul12.electronice.Ram;
import saptamana2.tema2.exercitiul12.electronice.MemorieSSD;

public class Exercitiul12 {
	public static void main(String[] args) {
		Laptop laptop = new Laptop("HP", "negru", 15.6, "DDR4", "GB", 16, 1024, "GB");
		System.out.println(
				"Detalii laptop: \n\n" +
						" Marca: " + laptop.getMarca() + "\n" +
						" Culoare: " + laptop.getCuloare() + "\n" +
						" Dimensiune ecran: " + laptop.getDimensiuneEcran() + "\n\n" +
						"Memorie RAM: \n\n" +
						" Tip memorie RAM: " + Ram.getTipRAM() + "\n" +
						" Unitate de Masura Memorie RAM: " + Ram.getMasuraRAM() + "\n" +
						" Capacitate memorie RAM: " + Ram.getCapacitateRAM() + "\n\n" +
						"Spatiu de stocare SSD: \n\n" + "" +
						" Capacitate de stocare SSD: " + MemorieSSD.getCapacitateSSD() + "\n" +
						" Unitate de masura stocare SSD: " + MemorieSSD.getMasuraSSD());
	}
}
