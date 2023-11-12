package saptamana4.tema4.proiect.modal;

public class CursLimbiStraine extends Curs{
	private String numeProfesor;

	public CursLimbiStraine(String nume, int pret, String numeProfesor) {
		super(nume, pret);
		this.numeProfesor = numeProfesor;
	}

	public String getNumeProfesor() {
		return numeProfesor;
	}

	public void setNumeProfesor(String numeProfesor) {
		this.numeProfesor = numeProfesor;
	}

	@Override
	public String toString() {
		return "CursLimbiStraine{" +
				"numeProfesor='" + numeProfesor + '\'' +
				'}';
	}
}
