package ro.ase.cts.factory;

import ro.ase.cts.clase.Desert;
import ro.ase.cts.clase.Harta;

public class DesertFactory implements FabricaAbstracta{
    @Override
    public Harta creareHarta(String monstru) {
        return new Desert(monstru);
    }
}
