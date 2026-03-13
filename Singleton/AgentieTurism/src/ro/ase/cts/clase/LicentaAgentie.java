package ro.ase.cts.clase;

public class LicentaAgentie {
    private int nrLicenta;
    private String dataLicenta;
    private static LicentaAgentie instance=null;

    private LicentaAgentie(int nrLicenta, String dataLicenta) {
        this.nrLicenta = nrLicenta;
        this.dataLicenta = dataLicenta;
    }

    public int getNrLicenta() {
        return nrLicenta;
    }

    public void setNrLicenta(int nrLicenta) {
        this.nrLicenta = nrLicenta;
    }

    public String getDataLicenta() {
        return dataLicenta;
    }

    public void setDataLicenta(String dataLicenta) {
        this.dataLicenta = dataLicenta;
    }

    public static LicentaAgentie getInstance(){
        if(instance==null){
            instance = new LicentaAgentie(1, "01.01.2026");
        }
        return instance;
    }

}
