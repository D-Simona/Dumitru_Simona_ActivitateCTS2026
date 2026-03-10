package ro.ase.cts.clase;

public class Rezervare {
    private boolean laGeam;
    private boolean scaunErgonomic;
    private String culoareFatDeMasa;
    private String genMuzical;
    private int nrPersoane;

    public Rezervare(boolean laGeam, boolean scaunErgonomic, String culoareFatDeMasa, String genMuzical, int nrPersoane) {
        this.laGeam = laGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.culoareFatDeMasa = culoareFatDeMasa;
        this.genMuzical = genMuzical;
        this.nrPersoane = nrPersoane;
    }
    public Rezervare() {
        this.laGeam = false;
        this.scaunErgonomic = false;
        this.culoareFatDeMasa = "alb";
        this.genMuzical = "Jazz";
        this.nrPersoane = 2;
    }

    public void setLaGeam(boolean laGeam) {
        this.laGeam = laGeam;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setCuloareFatDeMasa(String culoareFatDeMasa) {
        this.culoareFatDeMasa = culoareFatDeMasa;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("laGeam=").append(laGeam);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", culoareFatDeMasa='").append(culoareFatDeMasa).append('\'');
        sb.append(", genMuzical='").append(genMuzical).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
    }
}
