package ro.ase.cts.factory;

import ro.ase.cts.clase.Cazare;
import ro.ase.cts.clase.Pachet;

public class CazareFactory implements FabricaPachet{
    @Override
    public Pachet crearePachet(String denumire) {
        return new Cazare(denumire);

    }
}
