package saltamana2.curs1.stringuri;

public class MetodeStringEx3 {
	public static void main(String[] args) {

		String s1 = "Hello World!";

		System.out.println("lungimea stringului s1 este: " + s1.length());

		String s2 = ""; // acelasi lucru cu String s2 = null
		String s3 = null; //null doar pentru stringuri

		System.out.println("Stringul nu contine numic: " + (s2.isEmpty()));
		System.out.println("Stringul nu contine numic: " + (s3.isEmpty()));

		String nume = "GigeL";
		System.out.println(nume.toUpperCase());
		System.out.println(nume.toLowerCase());

		String nume3 = "Vasile          "; //CTRL + ALT + L refactorizeaza , aliniaza intreg codul
		System.out.println((nume3.toLowerCase().trim()));

		String s5 = "            Hello World              ";
		System.out.println("x" + s5 + "x");
		System.out.println("x" + s5.trim() + "x");

		String s6 = "Hello World";
		String s7 = "Hello WORLD";
		System.out.println("Pentru ca literele nu sunt egale si Java este case senziteive " + (s6.equals(s7))); //Java este case senzitive
		System.out.println("Pentru a ignora diferentele de litere: " + (s6.equalsIgnoreCase(s7))); //ca sa ignore literele ca marime




	}
}
