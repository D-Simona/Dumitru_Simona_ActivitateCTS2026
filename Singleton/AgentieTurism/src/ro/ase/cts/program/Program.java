package ro.ase.cts.program;

import ro.ase.cts.clase.LicentaAgentie;

public class Program {
    public static void main(String[] args) {
        LicentaAgentie licenta1 = LicentaAgentie.getInstance();
        LicentaAgentie licenta2=LicentaAgentie.getInstance();
        licenta2.setDataLicenta("02.05.2026");

        System.out.println(licenta1.getDataLicenta());
    }
}
