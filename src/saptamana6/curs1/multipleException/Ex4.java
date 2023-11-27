package saptamana6.curs1.multipleException;

public class Ex4 {
	public static void main(String[] args) {
		Angajat angajat = new Angajat();

		double salariulBrut = 8000;
		double salariulNetCalculat = 0;
		try {
			System.out.println("A");
			salariulNetCalculat = angajat.calculeazaSalariulNet(salariulBrut);
			System.out.println("B");
		} catch (InvalidSalaryException e) {
			System.out.println("C");
			System.out.println(e.getMessage());
		} catch (TooBigSalaryException e) {
			System.out.println("D");
			System.out.println(e.getMessage());
		}
		System.out.println("salariul este: " + salariulNetCalculat );
	}
}
