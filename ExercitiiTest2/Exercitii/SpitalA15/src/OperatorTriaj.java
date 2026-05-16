import java.util.ArrayList;
import java.util.List;

public class OperatorTriaj {
    private List<IComanda> comenzi;

    public OperatorTriaj() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda(IComanda comanda) {
        comenzi.add(comanda);
        System.out.println("Operatoru a adaugat comanda in lista");
    }

    public void trimiteComenzi() {
        for(IComanda comanda: comenzi) {
            comanda.executa();
        }
        comenzi.clear();
    }
}
