package saptamana6.curs1.resurse.ex2;

public class Ex8 {
	public static void main(String[] args) {
		int x = 10;

		try (ConexiunebazaDeDate2 conexiune1 = new ConexiunebazaDeDate2(); ConexiunebazaDeDate2 conexiune2 = new ConexiunebazaDeDate2()){
			System.out.println("A");

			conexiune1.connect();
			conexiune2.connect();

			if (x == 10 ){
				throw new RuntimeException("A aparut o problema");

			}System.out.println("B");
		}
		catch (Exception e){
			System.out.println("C");
		}
		finally {
			System.out.println("D");

		}
	}
}
