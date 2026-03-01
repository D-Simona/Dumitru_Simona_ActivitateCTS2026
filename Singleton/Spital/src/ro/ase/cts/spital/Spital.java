package ro.ase.cts.spital;

public class Spital {
    private String nume;
    private int nrPaturi;
    private String adresa;
    private static Spital instanta=null;

    private Spital(String nume, int nrPaturi, String adresa) {
        this.nume = nume;
        this.nrPaturi = nrPaturi;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String noulNume) {
        this.nume = noulNume;
    }

    public static Spital getInstanta(){
        if(instanta==null){
            instanta = new Spital ("Marie Curie", 200, "Bucuresti");
        }
        return instanta;
    }
}
