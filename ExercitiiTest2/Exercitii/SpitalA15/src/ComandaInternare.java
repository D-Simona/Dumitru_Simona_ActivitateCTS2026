public class ComandaInternare implements IComanda {
    private Medic medic;
    private String numePacient;

    public ComandaInternare(Medic medic, String numePacient) {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    @Override
    public void executa() {
        medic.interneazaPacient(numePacient);
    }
}
