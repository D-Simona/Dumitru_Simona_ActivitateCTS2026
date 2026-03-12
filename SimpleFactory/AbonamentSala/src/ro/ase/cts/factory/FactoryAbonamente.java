package ro.ase.cts.factory;

import ro.ase.cts.abonamente.Abonament;
import ro.ase.cts.abonamente.Gold;
import ro.ase.cts.abonamente.Silver;
import ro.ase.cts.abonamente.Vip;

public class FactoryAbonamente {
    private static FactoryAbonamente instance = null;

    public static synchronized FactoryAbonamente getInstance(){
        if(instance==null){
            instance = new FactoryAbonamente();
        }
        return instance;
    }

    public FactoryAbonamente() {
    }

    public Abonament getAbonament(TipAbonament tip, String denumire){
        return switch(tip){
            case TipAbonament.Silver -> new Silver(denumire);
            case TipAbonament.Gold -> new Gold(denumire);
            case TipAbonament.Vip -> new Vip(denumire);
            default -> null;
        };
    }
}
