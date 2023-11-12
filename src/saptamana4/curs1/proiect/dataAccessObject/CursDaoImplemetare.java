package saptamana4.curs1.proiect.dataAccessObject;

import saptamana4.curs1.proiect.database.BazaDate;
import saptamana4.curs1.proiect.modal.Curs;
import saptamana4.curs1.proiect.modal.CursLimbiStraine;
import saptamana4.curs1.proiect.modal.CursProgramare;

import java.util.List;

public class CursDaoImplemetare implements CursDao {

	private final BazaDate bazaDate;

	public CursDaoImplemetare(BazaDate bazaDate) {
		this.bazaDate = bazaDate;
	}

	@Override
	public void adaugaCurs(BazaDate curs) {

	}

	@Override
	public String toString() {
		return "CursDaoImplemetare{" +
				"bazaDate=" + bazaDate +
				'}';
	}

	@Override
	public void adaugaCurs(Curs curs) {
		List<Curs> listaCursuri = bazaDate.getListaCursuri();

		if (curs instanceof CursProgramare programare) {
			System.out.println("Am adaugat cursul de: " + programare.getNume() + " cu pret: " + programare.getPret() + " RON cu data de inceput: " + programare.getDataInceput() + "\n");
		}

		if (curs instanceof CursLimbiStraine limbiStraine) {
			System.out.println("Am adaugat cursul de: " + limbiStraine.getNume() + " cu pret: " + limbiStraine.getPret() + " RON cu profesor: " + limbiStraine.getNumeProfesor().toUpperCase() + "\n");
		}

		listaCursuri.add(curs);
	}

	@Override
	public String cautaCurs(String numeCurs) {
		List<Curs> listaCursuri = bazaDate.getListaCursuri();

		for (Curs curs : listaCursuri) {
			if (curs.getNume().equalsIgnoreCase(numeCurs)) {
				if (curs instanceof CursProgramare programare) {
					return "Numele: " + programare.getNume() + " la pretul de: " + programare.getPret() + " RON cu data de inceput: " + programare.getDataInceput() ;
				} else if (curs instanceof CursLimbiStraine limbiStraine) {
					return "Numele: " + limbiStraine.getNume() + " la pretul de: " + limbiStraine.getPret() + " RON cu Profesorul: " + limbiStraine.getNumeProfesor().toUpperCase();
				}
			}
		}
		return null; // Cursul nu exista
	}


}


