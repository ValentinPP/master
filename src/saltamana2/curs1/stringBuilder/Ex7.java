package saltamana2.curs1.stringBuilder;

public class Ex7 {


	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Ana");
		sb.append(" are");
		sb.append(" mere");

		sb.reverse();
		System.out.println(sb);

		sb.replace(0,2,"RRRRRRRRRR");
		System.out.println(sb);


	}
}