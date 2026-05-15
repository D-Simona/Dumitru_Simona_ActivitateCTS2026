public class Persoana {
    private String nume;
    private boolean areAsigurare;

    public Persoana(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    @Override
    public String toString() {
        return this.nume;
    }
}
