package saptamana4.tema4.problema6;

public class Departament {
	private String numeDepartament;

	public Departament(String numeDepartament) {
		this.numeDepartament = numeDepartament;
	}

	public String getNumeDepartament() {
		return numeDepartament;
	}

	public void setNumeDepartament(String numeDepartament) {
		this.numeDepartament = numeDepartament;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Departament{" +
				"numeDepartament='" + numeDepartament + '\'' +
				'}';
	}
}
