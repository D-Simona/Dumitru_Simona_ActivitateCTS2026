import java.util.ArrayList;
import java.util.List;

public class OperatorBancar {
    private List<IComanda> comenziExxecutate;

    public OperatorBancar() {
        this.comenziExxecutate =new ArrayList<>();
    }

    public void executaComanda(IComanda comanda) {
        comanda.executa();
        comenziExxecutate.add(comanda);
    }

    public void undoUltimaComanda() {
        if(comenziExxecutate.size()>0){
            IComanda ultimaComanda=comenziExxecutate.get(comenziExxecutate.size()-1);
            ultimaComanda.undo();
            comenziExxecutate.remove(ultimaComanda);
        }else {
            System.out.println("Nu exista comenzi pentru undo");
        }
    }
}
