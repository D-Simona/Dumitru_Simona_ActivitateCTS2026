package ro.ase.cts.clase.builder;

import ro.ase.cts.clase.Rezervare;

public class RezervareBuilder implements BuilderAbstract{
    //versiunea 1 - cu instanta
    private Rezervare rezervare =null;
    public RezervareBuilder(){
        rezervare=new Rezervare();
    }

    public BuilderAbstract setGenMuzical(String genMuzical){
        rezervare.setGenMuzical(genMuzical);
        return this;
    }
    public BuilderAbstract setNrPersoane(int nrPersoane){
        rezervare.setNrPersoane(nrPersoane);
        return this;
    }
    public BuilderAbstract setCuloareFataMasa(String culoareFataMasa){
        rezervare.setCuloareFatDeMasa(culoareFataMasa);
        return this;
    }
    public BuilderAbstract setLaGeam(boolean laGeam){
        rezervare.setLaGeam(laGeam);
        return this;
    }
    public BuilderAbstract setScaunErgonomic(boolean scaunErgonomic){
        rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }




    @Override
    public Rezervare build() {
        return rezervare;
    }
}
