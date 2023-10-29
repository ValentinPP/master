package saptamana2.curs2.metode;

public class Caine {


    String nume;
    int varsta;

    public Caine(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }


    public void latra(){
        System.out.println("Cainele latra dupa pisici");
    }

    public void alearga(String tipAlergare){
        System.out.println(this.nume + " alearga " + tipAlergare + " dupa pisici si are varsta de " + this.varsta);
    }



}
