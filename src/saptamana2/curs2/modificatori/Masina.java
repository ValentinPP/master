package saptamana2.curs2.modificatori;

public class Masina {

    public String constructorAuto;
    protected int roti;
    String model; //daca nu scriem nimic in fata este default ca si modificator de acces
    private String tipCaroserie;

    public Masina(String constructorAuto, int roti, String model, String tipCaroserie) {
        this.constructorAuto = constructorAuto;
        this.roti = roti;
        this.model = model;
        this.tipCaroserie = tipCaroserie;
    }

    public String getTipCaroserie(){
        return this.tipCaroserie;
    }

    protected String seOpreste() {
        return "Masina se opreste cu toate cele " + this.roti + " roti" + " si are o caroserie de tipul " + this.tipCaroserie;
    }

    private void porneste(){
        System.out.println("Masina porneste");
    }




}
