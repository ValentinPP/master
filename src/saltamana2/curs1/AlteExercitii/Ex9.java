package saltamana2.curs1.AlteExercitii;

public class Ex9 {
	public static void main(String[] args) {
		String x = null;

		//System.out.println(x.isEmpty());

		User user = new User();
		user.username = "Gigel";

		System.out.println(user.username);

		user = null;

		//System.out.println(user.username);

		if (user != null){
			System.out.println("obiectul nu este null");
		} else {
			System.out.println("obiectul este null");
			//String f = user.username;
		}

	}
}
