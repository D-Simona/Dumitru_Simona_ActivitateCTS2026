package ro.ase.cts.clase.builder;

import ro.ase.cts.clase.Rezervare;

public class RezervareBuilder implements BuilderAbstract{
    //versiunea 1 - cu instanta
    private Rezervare rezervare =null;
    public RezervareBuilder(){
        rezervare=new Rezervare();
    }

    public RezervareBuilder setGenMuzical(String genMuzical){
        rezervare.setGenMuzical(genMuzical);
        return this;
    }
    public RezervareBuilder setNrPersoane(int nrPersoane){
        rezervare.setNrPersoane(nrPersoane);
        return this;
    }
    public RezervareBuilder setCuloarefataMasa(String culoarefataMasa){
        rezervare.setCuloareFatDeMasa(culoarefataMasa);
        return this;
    }
    public RezervareBuilder setLaGeam(boolean laGeam){
        rezervare.setLaGeam(laGeam);
        return this;
    }
    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic){
        rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }




    @Override
    public Rezervare build() {
        return null;
    }
}
