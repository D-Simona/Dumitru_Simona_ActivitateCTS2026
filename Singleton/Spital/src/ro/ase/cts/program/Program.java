package ro.ase.cts.program;

import ro.ase.cts.spital.Spital;

public class Program {
    public static void main(String[] args) {
        Spital spital1 = Spital.getInstanta();
        Spital spital2=Spital.getInstanta();
        spital2.setNume("Obregia");

        System.out.println(spital1.getNume());
        System.out.println(spital2.getNume());

    }
}
