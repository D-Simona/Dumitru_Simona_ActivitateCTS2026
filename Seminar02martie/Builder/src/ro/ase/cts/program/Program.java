/*package ro.ase.cts.program;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.builder.BuilderAbstract;
import ro.ase.cts.clase.builder.RezervareBuilder;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(true, true, "Rosu cu Alb", "Romantic", 2);
        Rezervare rezervare2 = new Rezervare(true, true, "Rosu cu Alb", "Romantic", 2);

        Rezervare rezervare3=new Rezervare();
        rezervare3.setLaGeam(true);
        rezervare3.setNrPersoane(4);
        System.out.println(rezervare3.toString());

        BuilderAbstract builder = new RezervareBuilder();
        Rezervare rezervare5= builder.setNrPersoane(4).setCuloareFataMasa("Verde").build();
        Rezervare rezervare6 = new RezervareBuilder().setNrPersoane(1).build();
    }
}*/
