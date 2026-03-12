package ro.ase.acs.sistem_logare;

public class SistemLogare {
    private String denumireTranzactie;
    private int codTranzactie;
    private static SistemLogare instance = null;

    private SistemLogare(String denumireTranzactie, int codTranzactie) {
        this.denumireTranzactie = denumireTranzactie;
        this.codTranzactie = codTranzactie;
    }

    public String getDenumireTranzactie() {
        return denumireTranzactie;
    }

    public void setDenumireTranzactie(String denumireTranzactie) {
        this.denumireTranzactie = denumireTranzactie;
    }

    public static SistemLogare getInstance() {
        if (instance==null){
            instance = new SistemLogare("Transfer intre conturi", 123);
        }
        return instance;
    }
}
