package ro.ase.cts.clase.builder2;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.builder.BuilderAbstract;
import ro.ase.cts.clase.builder.RezervareBuilder;

public class RezervareBuilder2 implements BuilderAbstract {
    //versiunea 2 - cu atribute copiate
    private boolean laGeam;
    private boolean scaunErgonomic;
    private String culoareFatDeMasa;
    private String genMuzical;
    private int nrPersoane;

    public RezervareBuilder2(){
        this.laGeam = false;
        this.scaunErgonomic = false;
        this.culoareFatDeMasa = "alb";
        this.genMuzical = "Jazz";
        this.nrPersoane = 2;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(laGeam, scaunErgonomic,culoareFatDeMasa,genMuzical,nrPersoane);
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
