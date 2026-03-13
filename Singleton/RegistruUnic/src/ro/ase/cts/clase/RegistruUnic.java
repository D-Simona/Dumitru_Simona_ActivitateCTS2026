package ro.ase.cts.clase;

public class RegistruUnic {
    private int nrInregistrare;
    private String dataInregistrare;
    private static RegistruUnic instance=null;


    private RegistruUnic(int nrInregistrare, String dataInregistrare) {
        this.nrInregistrare = nrInregistrare;
        this.dataInregistrare = dataInregistrare;
    }

    public int getNrInregistrare() {
        return nrInregistrare;
    }

    public void setNrInregistrare(int nrInregistrare) {
        this.nrInregistrare = nrInregistrare;
    }

    public String getDataInregistrare() {
        return dataInregistrare;
    }

    public void setDataInregistrare(String dataInregistrare) {
        this.dataInregistrare = dataInregistrare;
    }

    public static RegistruUnic getInstance(){
        if(instance==null){
            instance=new RegistruUnic(123, "12.03.2026");
        }
        return instance;
    }

}
