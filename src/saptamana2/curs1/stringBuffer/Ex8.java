package saptamana2.curs1.stringBuffer;

public class Ex8 {


	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Ana");
		sb.append(" are");
		sb.append(" mere");

		sb.reverse();
		System.out.println(sb);

		sb.replace(0,2,"RRRRRRRRRR");
		System.out.println(sb);


	}
}