package ro.ase.cts.program;

import ro.ase.cts.abonamente.Abonament;
import ro.ase.cts.factory.FactoryAbonamente;
import ro.ase.cts.factory.TipAbonament;

public class Program {
    public static void main(String[] args) {
        FactoryAbonamente factory = FactoryAbonamente.getInstance();
        Abonament silver = factory.getAbonament(TipAbonament.Silver, "silver");
        Abonament gold = factory.getAbonament(TipAbonament.Gold, "gold");
        Abonament vip = factory.getAbonament(TipAbonament.Vip, "vip");

        System.out.println(silver.toString());
    }
}
