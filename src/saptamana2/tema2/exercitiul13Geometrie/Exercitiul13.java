package saptamana2.tema2.exercitiul13Geometrie;

/**
 * Creati un proiect cu titlul FormeGeometrice in care se cere sa se implementeze urmatoarele cerinte:
 * 1. Veti avea pachetul de baza com.itfactory
 * TRIUNGHI:
 * 2. Se va crea o clasa Triunghi impreuna cu 3 proprietati, si anume laturile acestuia. (Pentru fiecare latura definiti un field in clasa)
 * 3. Constructorul va fi ales la alegere (Daca o sa implementati constructor cu parametri, nu va fie nevoie de setters si getters)
 * 4. Sa se creeze o metoda in clasa Triunghi care returneaza perimetrul triunghiului calculat.
 * PATRAT:
 * 5. Se va crea o clasa Patrat impreuna cu o proprietate care este dimensiunea unei laturi.
 * 6. Se cere sa se creeze doua metode in clasa, una care calculeaza perimetrul unui patrat, iar unul care calculeaza aria unui patrat.
 * (Perimetrul este suma laturilor unui patrat iar aria este latura la patrat. Atentie: Patratul are toate laturile egale).
 * DREPTUNGHI:
 * 5. Se va crea o clasa Dreptunghi impreuna cu doua proprietati care reprezinta lungimea si latimea
 * 6. Se cere sa se creeze doua metode in clasa, una care calculeaza perimetrul unui dreptunghi, iar unul care calculeaza aria unui dreptunghi.
 * (Perimetrul este suma latimilor si a lungimilor unui dreptunghi iar aria este produsul lungimii cu cel al latimii. Atentie: Dreptunghiul are cate 2 laturi egale).
 *
 * ATENTE: Toate metodele create vor returna valorile calculate dupa caz.
 * Se va crea o clasa Main unde va fi metoda main. In acea metoda main din clasa Main veti instantia obiectele cerute si veti folosi obiectele pentru a calcula, dupa caz, perimetrele, ariile.
 * Se vor afisa tot in metoda main din clasa Main.
 **/
public class Exercitiul13 {
	public static void main(String[] args) {
		Triunghi triunghi = new Triunghi(1,2,3);
		int perimetru = triunghi.getPerimetru();
		System.out.println("___________________________________________________________");
		System.out.println("Perimetrul triunghiului cu laturile date este: " + perimetru);

		Patrat patrat = new Patrat(3);
		int perimetruPatrat = patrat.getPerimetru();
		int aria = patrat.getAria();
		System.out.println("___________________________________________________________");
		System.out.println("Perimetrul patratului cu latura data este: " + perimetruPatrat);
		System.out.println("Aria patratului cu latura data este: " + aria);

		Dreptunghi dreptunghi = new Dreptunghi(3,5);
		int perimetruDreptunghi = dreptunghi.getPerimetru();
		int ariaDreptunghi = dreptunghi.getAria();
		System.out.println("___________________________________________________________");
		System.out.println("Perimetrul dreptunghiului cu laturile date este: " + perimetruDreptunghi);
		System.out.println("Aria dreptunghiului cu laturile date este: " + ariaDreptunghi);
	}
}
