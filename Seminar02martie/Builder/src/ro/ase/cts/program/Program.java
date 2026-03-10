package ro.ase.cts.program;

import ro.ase.cts.builder_corect.RezervareFinal;
import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.builder.BuilderAbstract;
import ro.ase.cts.clase.builder.RezervareBuilder;
import ro.ase.cts.clase.builder2.RezervareBuilder2;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(true, true, "Rosu cu Alb", "Romantic", 2);
        Rezervare rezervare2 = new Rezervare(true, true, "Rosu cu Alb", "Romantic", 2);

        Rezervare rezervare3=new Rezervare();
        rezervare3.setLaGeam(true);
        rezervare3.setNrPersoane(6);
        //System.out.println(rezervare3.toString());

        BuilderAbstract builder = new RezervareBuilder();
        Rezervare rezervare5 = builder.setNrPersoane(4).setCuloareFataMasa("Verde").build();
        Rezervare rezervare6 = new RezervareBuilder().setNrPersoane(1).build();

        //System.out.println(rezervare5.toString());
        //System.out.println(rezervare6.toString());

        BuilderAbstract builder2 = new RezervareBuilder2();
        Rezervare rezervare7 = builder2.setGenMuzical("blues").setNrPersoane(3).build();
        Rezervare rezervare8 = builder2.setNrPersoane(5).build();
        //System.out.println(rezervare7.toString());
        //System.out.println(rezervare8.toString());

       RezervareFinal rezervare9 = new RezervareFinal.Builder().setNrPersoane(3).build();
        System.out.println(rezervare9.toString());



    }
}
