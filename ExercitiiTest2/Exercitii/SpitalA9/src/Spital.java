import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital {
    private String denumire;
    private List<Persoana> listaPersoane;

    public Spital(String denumire) {
        this.denumire = denumire;
        this.listaPersoane = new ArrayList<>();
    }

    @Override
    public void permiteInternare(Persoana persoana) {
        this.listaPersoane.add(persoana);
        System.out.println("Persoana " + persoana + " poate fi internata");
    }
}
