package ro.ase.cts.factory;

import ro.ase.cts.dispozitive.Dispozitiv;
import ro.ase.cts.dispozitive.Laptop;
import ro.ase.cts.dispozitive.Smartphone;
import ro.ase.cts.dispozitive.Smartwatch;

public class FabricaDispozitive {
    //instanta
    private static FabricaDispozitive instanta=null;

   //get instanta
    public static synchronized FabricaDispozitive getInstanta(){
        if(instanta==null){
            instanta=new FabricaDispozitive();
        }
        return instanta;
    }

    //constructor fara param
    public FabricaDispozitive() {
    }

   //get disp cu switch
    public Dispozitiv getDispozitiv(TipDispozitiv tip, int nivelBaterie){
        return switch(tip){
            case TipDispozitiv.Laptop -> new Laptop(nivelBaterie);
            case TipDispozitiv.Smartphone -> new Smartphone(nivelBaterie);
            case TipDispozitiv.Smartwatch -> new Smartwatch(nivelBaterie);
            default->null;
        };
    }
}
