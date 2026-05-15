import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital {
    private String denumire;

    public Spital(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void permiteAcces(Vizitator vizitator) {
        System.out.println("Vizitatorul " + vizitator.getNume() + "a fost primit in salonul spitalului"+denumire);
    }
}
