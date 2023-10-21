package saptamana1.curs1Intro.packageExercitiul1;

public class ClassExercitiuPrintln {
    public static void main (String[] args){
        System.out.println("Linia 1");
        System.out.println("Linia 2");
        System.out.println("Linia 3");
        System.out.println("Linia 4");
        System.out.println("Linia 5");
        System.out.println("Linia 6");
        System.out.println("Linia 7");
        System.out.println("Linia 8");
        System.out.println("Linia 9");
        System.out.println("Linia 10");

        System.out.print("Line 1 ");
        System.out.print("Line 2 ");
        System.out.print("Line 3 ");

        System.out.println(" ");   //This is needed for the next print to go on the next line

        Integer(1);              //This calls the extra methods to main
        Double(2.2);            //This calls the extra methods to main
        Character('a');         //This calls the extra methods to main
    }
    public static void Integer (int i){
        System.out.println("Integer number: " + i);
    }

    public static void Double (double v) {
        System.out.println("Double number is: " + v);
    }

    public static void Character (char a){
        System.out.println("The character variable is: " + a);
    }

}
