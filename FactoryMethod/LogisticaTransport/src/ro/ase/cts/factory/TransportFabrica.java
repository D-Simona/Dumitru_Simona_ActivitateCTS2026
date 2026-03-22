package ro.ase.cts.factory;

import ro.ase.cts.clase.Transport;

public interface TransportFabrica {
    public Transport creazaMijlocTransport(String nrInmatriculare);
}
