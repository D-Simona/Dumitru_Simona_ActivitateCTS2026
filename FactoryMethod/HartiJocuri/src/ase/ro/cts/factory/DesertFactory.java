package ase.ro.cts.factory;

import ase.ro.cts.clase.Desert;
import ase.ro.cts.clase.Harta;

public class DesertFactory implements FabricaAbstracta{
    @Override
    public Harta creareHarta(String monstru) {

        return new Desert(monstru);
    }
}
