package saptamana2.curs2.incapsulare;

public class Avion {

    private String companie;
    private int nrCursa;

    public Avion(String companie, int nrCursa) {
        this.companie = companie;
        this.nrCursa = nrCursa;
    }

    public Avion() {
    }

    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public int getNrCursa() {
        return nrCursa;
    }

    public void setNrCursa(int nrCursa) {
        this.nrCursa = nrCursa;
    }
}
