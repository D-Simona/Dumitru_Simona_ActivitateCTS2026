package ro.ase.cts.clase;

public class ConexiuneUnica {
    private int idAngajat;
    private String numeAngajat;
    private static ConexiuneUnica instance=null;

    private ConexiuneUnica(int idAngajat, String numeAngajat) {
        this.idAngajat = idAngajat;
        this.numeAngajat = numeAngajat;
    }

    public int getIdAngajat() {
        return idAngajat;
    }

    public void setIdAngajat(int idAngajat) {
        this.idAngajat = idAngajat;
    }

    public String getNumeAngajat() {
        return numeAngajat;
    }

    public void setNumeAngajat(String numeAngajat) {
        this.numeAngajat = numeAngajat;
    }

    public static ConexiuneUnica getInstance(){
        if(instance==null){
            instance=new ConexiuneUnica(5, "Ionescu");
        }
        return instance;
    }
}
