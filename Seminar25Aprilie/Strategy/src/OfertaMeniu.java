public class OfertaMeniu {
    private String denumireMeniu;
    private int nrCalorii;
    private int nrCarbohidrati;

    public OfertaMeniu(String deumireMeniu, int nrCalorii, int nrCarbohidrati) {
        this.denumireMeniu = deumireMeniu;
        this.nrCalorii = nrCalorii;
        this.nrCarbohidrati = nrCarbohidrati;
    }

    public String getDeumireMeniu() {
        return denumireMeniu;
    }

    public int getNrCalorii() {
        return nrCalorii;
    }

    public int getNrCarbohidrati() {
        return nrCarbohidrati;
    }

    @Override
    public String toString() {
        return "Oferta Meniu [denumireMeniu=" + denumireMeniu + ", nrCalorii="
                + nrCalorii + ", nrCarbohidrati=" + nrCarbohidrati + "]";
    }
}
