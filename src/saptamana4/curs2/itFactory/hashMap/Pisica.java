package com.itFactory.hashMap;

public class Pisica {

    private String nume;


    public Pisica(String nume) {
        this.nume = nume;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }


    @Override
    public String toString() {
        return "Pisica{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
