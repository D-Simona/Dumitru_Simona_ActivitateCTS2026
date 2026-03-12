package ro.ase.cts.factory;

import ro.ase.cts.clase.Harta;
import ro.ase.cts.clase.Ocean;

public class OceanFactory implements FabricaAbstracta{
    @Override
    public Harta creareHarta(String monstru) {
        return new Ocean(monstru);
    }
}
