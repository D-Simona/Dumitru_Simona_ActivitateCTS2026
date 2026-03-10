package ro.ase.cts.builder_corect;

public class RezervareFinal {
    private boolean laGeam;
    private boolean scaunErgonomic;
    private String culoareFatDeMasa;
    private String genMuzical;
    private int nrPersoane;

    public static class Builder implements BuilderAbstract {
        private boolean laGeam;
        private boolean scaunErgonomic;
        private String culoareFatDeMasa;
        private String genMuzical;
        private int nrPersoane;

        @Override
        public RezervareFinal build() {
            return new RezervareFinal(laGeam,scaunErgonomic,culoareFatDeMasa,genMuzical,nrPersoane);
        }

        @Override
        public BuilderAbstract setGenMuzical(String genMuzical) {
            this.genMuzical=genMuzical;
            return this;
        }

        @Override
        public BuilderAbstract setNrPersoane(int nrPersoane) {
            this.nrPersoane=nrPersoane;
            return this;
        }

        @Override
        public BuilderAbstract setCuloareFataMasa(String culoareFataMasa) {
            this.culoareFatDeMasa=culoareFataMasa;
            return this;
        }

        @Override
        public BuilderAbstract setLaGeam(boolean laGeam) {
            this.laGeam=laGeam;
            return this;
        }

        @Override
        public BuilderAbstract setScaunErgonomic(boolean scaunErgonomic) {
            this.scaunErgonomic=scaunErgonomic;
            return this;
        }
    }

    private RezervareFinal(boolean laGeam, boolean scaunErgonomic, String culoareFatDeMasa, String genMuzical, int nrPersoane) {
        this.laGeam = laGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.culoareFatDeMasa = culoareFatDeMasa;
        this.genMuzical = genMuzical;
        this.nrPersoane = nrPersoane;
    }
    private RezervareFinal() {
        this.laGeam = false;
        this.scaunErgonomic = false;
        this.culoareFatDeMasa = "alb";
        this.genMuzical = "Jazz";
        this.nrPersoane = 2;
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
