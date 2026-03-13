package ro.ase.cts.factory;

import ro.ase.cts.clase.Pachet;
import ro.ase.cts.clase.Transport;

public class TransportFactory implements FabricaPachet{
    @Override
    public Pachet crearePachet(String denumire) {
        return new Transport(denumire);
    }
}
