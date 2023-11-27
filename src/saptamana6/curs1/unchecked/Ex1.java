package saptamana6.curs1.unchecked;

public class Ex1 {
	public static void main(String[] args) {
		try{
			System.out.println("A");
			doSomething(25);
			System.out.println("B");
		} catch (MyRuntimeException e){
			System.out.println("C");
			System.out.println(e.getMessage());
			System.out.println("F");
		} finally {
			System.out.println("D");
		}
		//doSomething(25);

	}

	public static void doSomething(int x){
		if(x>10){
			throw new MyRuntimeException("Numarul este mai mare ca 10");
		}
		System.out.println("Totul este ok!");
	}
}
