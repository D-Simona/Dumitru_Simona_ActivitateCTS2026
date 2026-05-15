public class Produs {
    private String denumire;
    private double pret;
    private int numarRecenzii;

    public Produs(String denumire, double pret, int numarRecenzii) {
        this.denumire = denumire;
        this.pret = pret;
        this.numarRecenzii = numarRecenzii;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    public int getNumarRecenzii() {
        return numarRecenzii;
    }

    @Override
    public String toString() {
        return denumire + " - pret: "+pret+" lei, recenzii: "+numarRecenzii;
    }
}
