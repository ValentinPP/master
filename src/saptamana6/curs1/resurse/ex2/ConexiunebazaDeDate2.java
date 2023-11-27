package saptamana6.curs1.resurse.ex2;

public class ConexiunebazaDeDate2 implements AutoCloseable{

	public void connect(){
		System.out.println("Am deschis conexiunea");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Am inchis conexiunea");
	}
}
