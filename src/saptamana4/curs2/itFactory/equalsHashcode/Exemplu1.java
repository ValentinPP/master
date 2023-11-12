package com.itFactory.equalsHashcode;

public class Exemplu1 {

    public static void main(String[] args) {

        Mar mar1 = new Mar("rosu", 4.50);
        Mar mar2 = new Mar("galben", 4.50);

        boolean x = mar1 == mar2;

        System.out.println(x);

        System.out.println("mar1 este: " + mar1 + " mar2 este: " + mar2);

        System.out.println("mar1 este: " + mar1.getCuloare() + " " + mar1.getPret());

        boolean y = mar1.equals(mar2);

        System.out.println("Merele sunt egale: " + y);

        Pisica pisica = new Pisica();
        pisica.setCuloare("rosu");
        pisica.setPret(4.50);

        System.out.println("---------------------------------------");

        System.out.println(mar1.equals(pisica));


        String valoareCaString = mar1.toString();
        System.out.println(valoareCaString);




    }

}
