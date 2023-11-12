package saptamana4.curs1.proiect.modal;

public class CursProgramare extends Curs {

	private String dataInceput;

	public CursProgramare(String nume, int pret, String dataInceput) {
		super(nume, pret);
		this.dataInceput = dataInceput;
	}
	public String getDataInceput() {
		return dataInceput;
	}

	public void setDataInceput(String dataInceput) {
		this.dataInceput = dataInceput;
	}

	@Override
	public String toString() {
		return "CursProgramare{" +
				"dataInceput='" + dataInceput + '\'' +
				'}';
	}
}
