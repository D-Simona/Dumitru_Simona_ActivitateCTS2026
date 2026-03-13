package ase.ro.cts.factory;

import ase.ro.cts.clase.Harta;
import ase.ro.cts.clase.Ocean;

public class OceanFactory implements FabricaAbstracta{
    @Override
    public Harta creareHarta(String monstru) {
        return new Ocean(monstru);
    }
}
