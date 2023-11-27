package saptamana6.curs1.resurse.ex1;

public class Ex7 {
	public static void main(String[] args) {
		int x = 10;
		ConexiuneBazaDeDate conexiuneBazaDeDate = null;

		try {
			conexiuneBazaDeDate = new ConexiuneBazaDeDate();
			conexiuneBazaDeDate.connect();

			if (x == 10) {
				throw new RuntimeException("A aparut o problemaaa");
			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} finally {
			if (conexiuneBazaDeDate != null) {
				conexiuneBazaDeDate.close();
			}
		}
	}
}
