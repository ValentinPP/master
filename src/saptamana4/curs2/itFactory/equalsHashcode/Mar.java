package com.itFactory.equalsHashcode;

import java.util.Objects;

public class Mar {

    private String culoare;
    private double pret;


    public Mar(String culoare, double pret) {
        this.culoare = culoare;
        this.pret = pret;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mar mar = (Mar) o;
        return Double.compare(pret, mar.pret) == 0 && Objects.equals(culoare, mar.culoare);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Mar mar = (Mar) o;
//        return culoare.equals(mar.culoare);
//    }


    @Override
    public int hashCode() {
        return Objects.hash(culoare, pret);
    }

    @Override
    public String toString() {
        return "Mar{" +
                "culoare='" + culoare + '\'' +
                ", pret=" + pret +
                '}';
    }
}
