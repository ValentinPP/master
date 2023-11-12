package saptamana4.curs1.proiect.dataAccessObject;

import saptamana4.curs1.proiect.database.BazaDate;
import saptamana4.curs1.proiect.modal.Curs;

public interface CursDao {

	void adaugaCurs(BazaDate curs);

	void adaugaCurs(Curs curs);

	String cautaCurs(String numeCurs);


}
