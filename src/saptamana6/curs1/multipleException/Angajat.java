package saptamana6.curs1.multipleException;

public class Angajat {
	public double calculeazaSalariulNet(double salariulBrut) throws InvalidSalaryException, TooBigSalaryException {
		if (salariulBrut <= 0) {
			throw new InvalidSalaryException("Salariul brut nu trebuie sa fie mai mic sau egal cu zero");
		}
		if (salariulBrut > 10000) {
			throw new TooBigSalaryException("Salariul este mult prea mare. Valoare maxima este de 10000");
		}
		double salariulNet = salariulBrut * 0.56;

		return salariulNet;
	}
}
