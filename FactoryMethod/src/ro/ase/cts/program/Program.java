package ro.ase.cts.program;

import ro.ase.cts.clase.Harta;
import ro.ase.cts.factory.FabricaAbstracta;
import ro.ase.cts.factory.OceanFactory;

public class Program {
    private static void printareHarti (FabricaAbstracta fabrica, String monstru) {
        Harta harta = fabrica.creareHarta(monstru);
        System.out.println(harta.toString());
    }

    public static void main(String[] args) {
        printareHarti(new OceanFactory(), "crocobaur");

    }
}
