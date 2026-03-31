package ro.ase.cts.program;

import ro.ase.cts.clase.ANod;
import ro.ase.cts.clase.Meniu;
import ro.ase.cts.clase.Produs;
import ro.ase.cts.clase.Structura;

public class Program {
    public static void main(String[] args) {
        //definire nivel 0 arborescenta
        Structura structuraMeniu = new Structura("Meniu restaurant");

        Meniu meniu = new Meniu(structuraMeniu, "Pizzeria ASE");

        //definire nivel 1 arborescenta
        ANod structuraBauturi = new Structura("Bauturi");
        ANod structuraMancare = new Structura("Mancare");
        structuraMeniu.adaugaNod(structuraBauturi);
        structuraMeniu.adaugaNod(structuraMancare);

        //definire noduri nivel 2 arborescenta(bauturi)
        structuraBauturi.adaugaNod(new Produs("CocaCola", 10));
        structuraBauturi.adaugaNod(new Produs("Pepsi", 9));



    }
}
