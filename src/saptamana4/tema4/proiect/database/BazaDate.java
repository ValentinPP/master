package saptamana4.tema4.proiect.database;

import saptamana4.tema4.proiect.modal.Curs;

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
