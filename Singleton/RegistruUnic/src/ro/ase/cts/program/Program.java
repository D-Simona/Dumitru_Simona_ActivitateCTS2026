package ro.ase.cts.program;

import ro.ase.cts.clase.RegistruUnic;

public class Program {
    public static void main(String[] args) {
        RegistruUnic inregistrare = RegistruUnic.getInstance();
        RegistruUnic inregistrare2 = RegistruUnic.getInstance();
        inregistrare2.setDataInregistrare("15.03.2026");

        System.out.println(inregistrare.getDataInregistrare());
    }
}
