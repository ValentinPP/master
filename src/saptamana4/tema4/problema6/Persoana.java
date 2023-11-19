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
			int result = Integer.hashCode(id);
			result = 31 * result + nume.hashCode();
			return result;
		}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Persoana person = (Persoana) obj;
		return id == person.id && nume.equals(person.nume);
	}

	@Override
	public String toString() {
		return "Nume{" +
				"nume='" + nume + '\'' +
				'}';
	}

}
