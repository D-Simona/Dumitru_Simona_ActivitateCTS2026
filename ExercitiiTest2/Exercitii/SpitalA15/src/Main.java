public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic("Popescu");

        OperatorTriaj operatorTriaj = new OperatorTriaj();

        operatorTriaj.adaugaComanda(new ComandaInternare(medic, "Ana"));
        operatorTriaj.adaugaComanda(new ComandaTratareImediata(medic, "Ion"));
        operatorTriaj.adaugaComanda(new ComandaInternare(medic, "Florica"));

        operatorTriaj.trimiteComenzi();

    }
}
