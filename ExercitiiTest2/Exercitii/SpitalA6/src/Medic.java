public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public boolean confirmaInternarea(Pacient pacient) {
        if(pacient.areStareGrava()) {
            System.out.println("Medicul "+nume+ " confirma internarea pacientului "
            +pacient.getNume());
            return true;
        }
        System.out.println("Medicul "+nume+" nu confirma internarea pacientului "+pacient.getNume());
        return false;
    }
}
