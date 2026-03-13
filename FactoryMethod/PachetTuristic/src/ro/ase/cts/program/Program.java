package ro.ase.cts.program;

import ro.ase.cts.clase.Pachet;
import ro.ase.cts.factory.FabricaPachet;
import ro.ase.cts.factory.TransportFactory;

public class Program {
    private static void afisarePachet(FabricaPachet fabrica, String denumire) {
        Pachet pachet = fabrica.crearePachet(denumire);
        System.out.println(pachet.toString());
    }

    public static void main(String[] args) {
        afisarePachet(new TransportFactory(), "avion");

    }
}
