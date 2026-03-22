package ro.ase.cts.factory;

import ro.ase.cts.clase.Camion;
import ro.ase.cts.clase.Transport;

public class CamionFabrica implements TransportFabrica{
    @Override
    public Transport creazaMijlocTransport(String nrInmatriculare) {
        return new Camion(nrInmatriculare);
    }
}
