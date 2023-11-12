package saptamana4.curs1.proiect.database;

import saptamana4.curs1.proiect.modal.Curs;

import java.util.ArrayList;
import java.util.List;

public class BazaDate {

	private List<Curs> listaCursuri = new ArrayList<>();

	public List<Curs> getListaCursuri() {
		return listaCursuri;
	}

	@Override
	public String toString() {
		return "BazaDate{" +
				"listaCursuri=" + listaCursuri +
				'}';
	}
}
