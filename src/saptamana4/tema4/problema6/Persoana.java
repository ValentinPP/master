package saptamana4.tema4.problema6;

public class Persoana {
	private int id;
	private String nume;

	public Persoana(int id, String nume) {
		this.id = id;
		this.nume = nume;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
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
		return "Nume{" +
				"nume='" + nume + '\'' +
				'}';
	}

//	@Override
//	public Integer toString() {
//		return id;
//	}


}
