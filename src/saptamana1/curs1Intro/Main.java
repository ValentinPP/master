package saptamana1.curs1Intro;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
        System.out.println("Problem nr 1 : divide to a number and display the leftover ");
        for (int a = 10; a <= 20; a++) {
            int b = 3;
            int c = a / b;
            int remaining = a % b;
            System.out.println("Dividing " + a + " / " + b + " = " + c + " leftover " + remaining);
        }
    }
}

