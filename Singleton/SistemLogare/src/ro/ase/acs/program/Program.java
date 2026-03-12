package ro.ase.acs.program;

import ro.ase.acs.sistem_logare.SistemLogare;

public class Program {
    public static void main(String[] args) {
        SistemLogare sistem1 = SistemLogare.getInstance();
        SistemLogare sistem2 = SistemLogare.getInstance();
        sistem2.setDenumireTranzactie("Transfer card cumparaturi");
        System.out.println(sistem1.getDenumireTranzactie());
    }
}
