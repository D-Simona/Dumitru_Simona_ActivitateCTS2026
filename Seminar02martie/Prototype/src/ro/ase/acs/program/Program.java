package ro.ase.acs.program;

import ro.ase.acs.clase.Prototype;
import ro.ase.acs.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        Prototype rezervare = new Rezervare("Vasilescu", "1111111111", 2);
        Prototype rezervare2 = rezervare.copiaza();
        ((Rezervare)rezervare2).setNrPersoane(20);

        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());

    }
}
