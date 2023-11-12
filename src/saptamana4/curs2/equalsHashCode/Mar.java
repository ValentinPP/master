package saptamana4.curs2.equalsHashCode;

import java.util.Objects;

public class Mar {
	private String culoare; //declarare
	private double pret;

	public Mar(String culoare, double pret) { // initializare
		this.culoare = culoare;
		this.pret = pret;
	}

	public String getCuloare() { //vizualizare
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	@Override
	public boolean equals(Object o) { //se pot face egale 2 obiecte in functie de selectie
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Mar mar = (Mar) o;
		return Double.compare(pret, mar.pret) == 0 && Objects.equals(culoare, mar.culoare);
	}

	@Override  //se foloseste pentru gruparea elementelor din interiorul hashmap.hashset
	public int hashCode() {
		return Objects.hash(culoare, pret);
	}

	@Override
	public String toString() {
		return "Mar{" +
				"culoare='" + culoare + '\'' +
				", pret=" + pret +
				'}';
	}
}
