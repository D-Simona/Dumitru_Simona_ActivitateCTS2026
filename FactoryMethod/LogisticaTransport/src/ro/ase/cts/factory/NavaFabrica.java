package ro.ase.cts.factory;

import ro.ase.cts.clase.Nava;
import ro.ase.cts.clase.Transport;

public class NavaFabrica implements TransportFabrica{
    @Override
    public Transport creazaMijlocTransport(String nrInmatriculare) {
        return new Nava(nrInmatriculare);
    }
}
