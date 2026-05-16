public class FacadeInternare {
    private Medic medic;
    private Salon salon;

    public FacadeInternare(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void verificaInternarea(Pacient pacient) {
        if(!pacient.areStareGrava()) {
            System.out.println("Pacient respins, nu are stare grava");
            return;
        }

        if(!medic.confirmaInternarea(pacient)){
            System.out.println("Internare respinsa, medicul nu a confirmat internarea");
            return;
        }
        if(!salon.arePatLiber()) {
            System.out.println("Internare respinsa, nu exista paturi libere");
            return;
        }
        salon.ocupaPat();
        System.out.println("Pacientul "+pacient.getNume()+" a fosy internat");
    }
}
