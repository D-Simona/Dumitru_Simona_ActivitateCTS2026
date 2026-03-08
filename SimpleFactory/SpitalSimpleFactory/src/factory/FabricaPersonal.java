package factory;

import personal.Asistent;
import personal.Brancardier;
import personal.Medic;
import personal.PersonalSpital;

public class FabricaPersonal {
    private static FabricaPersonal instanta=null;

    public static synchronized FabricaPersonal getInstanta() {
        if(instanta==null) {
            instanta = new FabricaPersonal();
        }
        return instanta;
    }

    public FabricaPersonal() {
    }

    public PersonalSpital getPersonalSpital(TipPersonal tip, String nume) {
         return switch (tip) {
             case TipPersonal.Brancardier -> new Brancardier(nume);
             case TipPersonal.Asistent -> new Asistent(nume);
             case TipPersonal.Medic -> new Medic(nume);
             default -> null;
         };
    }
}
