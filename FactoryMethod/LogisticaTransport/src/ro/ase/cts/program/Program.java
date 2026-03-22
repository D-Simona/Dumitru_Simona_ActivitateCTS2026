package ro.ase.cts.program;

import ro.ase.cts.clase.Transport;
import ro.ase.cts.factory.CamionFabrica;
import ro.ase.cts.factory.TransportFabrica;

public class Program {
    private static void alegeMijlocTransport(TransportFabrica fabrica, String nrInmatriculare) {
        Transport mijlocTransport = fabrica.creazaMijlocTransport(nrInmatriculare);
        System.out.println(mijlocTransport.toString());
    }
    public static void main(String[] args) {
        alegeMijlocTransport(new CamionFabrica(), "B01CAM");
    }
}
