public class Vizitator {
    private String nume;
    private boolean areScrisoareAcceptare;
    private boolean areEchipamentProtectie;

    public Vizitator(String nume, boolean areScrisoareAcceptare) {
        this.nume = nume;
        this.areScrisoareAcceptare = areScrisoareAcceptare;
        this.areEchipamentProtectie = areEchipamentProtectie;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreScrisoareAcceptare() {
        return areScrisoareAcceptare;
    }

    public boolean isAreEchipamentProtectie() {
        return areEchipamentProtectie;
    }

    public void echipeazaCuProtectie() {
        this.areEchipamentProtectie=true;
        System.out.println("Vizitatorul "+ nume + " a primit echipament de protectie");
    }


}
