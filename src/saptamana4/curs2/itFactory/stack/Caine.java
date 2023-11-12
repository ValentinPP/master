package com.itFactory.stack;

public class Caine {
    private String nume;

    public Caine(String nume) {
        this.nume = nume;
    }

    public Caine() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Caine{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
