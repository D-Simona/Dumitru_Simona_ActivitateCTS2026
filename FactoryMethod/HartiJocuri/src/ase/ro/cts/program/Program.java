package ase.ro.cts.program;

import ase.ro.cts.clase.Harta;
import ase.ro.cts.factory.FabricaAbstracta;
import ase.ro.cts.factory.OceanFactory;

public class Program {
    private static void printareHarti (FabricaAbstracta fabrica, String monstru) {
        Harta harta = fabrica.creareHarta(monstru);
        System.out.println(harta.toString());
    }

    public static void main(String[] args) {
        printareHarti(new OceanFactory(), "crocobaur");

    }
}
