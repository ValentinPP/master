package saptamana4.tema4.proiect.dataAccessObject;

import saptamana4.tema4.proiect.database.BazaDate;
import saptamana4.tema4.proiect.modal.Curs;

public interface CursDao {

	void adaugaCurs(BazaDate curs);

	void adaugaCurs(Curs curs);

	String cautaCurs(String numeCurs);


}
