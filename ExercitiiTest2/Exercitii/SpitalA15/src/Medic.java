public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public void interneazaPacient(String numePacient) {
        System.out.println("Medicul "+nume+" interneaza pacientul "+numePacient);
    }

    public void trateazaImediatPacient(String numePacient) {
        System.out.println("Medicul "+nume+" trateaza imedicat pacientul "+numePacient);
    }
}
