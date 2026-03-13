package ro.ase.cts.program;

import ro.ase.cts.clase.ConexiuneUnica;

public class Prograam {
    public static void main(String[] args) {
        ConexiuneUnica conexiune1=ConexiuneUnica.getInstance();
        ConexiuneUnica conexiune2 = ConexiuneUnica.getInstance();
        conexiune2.setNumeAngajat("Marinescu");

        System.out.println(conexiune1.getNumeAngajat());
    }
}
