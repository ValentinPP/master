package curs1Intro.tema;

public class Tema1Exercitiul1 {
        public static void main(String[] args) {

            System.out.println("Problem nr 1 : divide to a number and display the leftover! ");
            for (int a = 10; a <= 20; a++) {
                int b = 3;
                int c = a / b;
                int remaining = a % b;
                System.out.println("Dividing " + a + " / " + b + " = " + c + " leftover " + remaining);
            }
        }

}
