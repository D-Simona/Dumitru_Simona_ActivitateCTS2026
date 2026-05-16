public class ComandaTratareImediata implements IComanda {
    private Medic medic;
    private String numePacient;

    public ComandaTratareImediata(Medic medic, String numePacient) {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    @Override
    public void executa() {
        medic.trateazaImediatPacient(numePacient);

    }
}
