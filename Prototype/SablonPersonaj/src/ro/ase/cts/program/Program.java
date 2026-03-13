package ro.ase.cts.program;

import ro.ase.cts.clase.Personaj;
import ro.ase.cts.clase.PersonajPrototip;

public class Program {
    public static void main(String[] args) {
        PersonajPrototip personaj = new Personaj("human","female",500);
        PersonajPrototip personaj1 = personaj.copiaza();
        ((Personaj)personaj1).setRasa("dwarf");

        System.out.println(personaj1.toString());
        System.out.println(personaj.toString());
    }
}
