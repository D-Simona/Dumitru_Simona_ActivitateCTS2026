package ro.ase.cts.program;

import ro.ase.cts.clase.ConfigurarePC;

public class Program {
    public static void main(String[] args) {
        ConfigurarePC computer = new ConfigurarePC.Builder().setRAM(16).build();
        System.out.println(computer.toString());
    }
}
