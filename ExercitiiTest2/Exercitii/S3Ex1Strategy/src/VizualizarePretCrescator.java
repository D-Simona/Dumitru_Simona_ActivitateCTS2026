import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VizualizarePretCrescator implements IStrategieVizualizareProduse {

    @Override
    public void afiseazaProdus(List<Produs> produse) {
        List<Produs> listaSortata = new ArrayList<>(produse);
        Collections.sort(listaSortata, new Comparator<Produs>() {
            @Override
            public int compare(Produs p1, Produs p2) {
                if (p1.getPret() > p2.getPret()) {
                    return 1;
                } else if (p1.getPret() < p2.getPret()) {
                    return -1;
                }
                return 0;
            }
        });

        for (Produs produs : listaSortata) {
            System.out.println(produs);
        }
    }
}
