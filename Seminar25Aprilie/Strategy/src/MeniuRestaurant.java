import java.util.ArrayList;

//clasa context/Obiect din diagramele GoF
public class MeniuRestaurant {
    private ArrayList<OfertaMeniu> listaMeniuri = new ArrayList<>();
    private IProcesabil strategieAlegere; //referinta strategiei curente

    public void addOfertaMeniu(OfertaMeniu ofertaMeniu) {
        this.listaMeniuri.add(ofertaMeniu);
    }

    //metoda care permite schimbarea strategiei curente
    public void setStrategieAlegere(IProcesabil strategieAlegere) {
        this.strategieAlegere=strategieAlegere;
    }

    //metoda care pe baza strategiei curente rezolva cerinta principala, adica alegerea unui meniu
    public OfertaMeniu alegereOferta() {
        if(strategieAlegere!=null){
            return strategieAlegere.alefereMeniu(listaMeniuri);
        }
        else throw new UnsupportedOperationException();
    }
}
