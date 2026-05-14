import java.util.ArrayList;

public class StategieCaloriiMinim implements IProcesabil{
    @Override
    public OfertaMeniu alefereMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
        OfertaMeniu ofertaMeniuCaloriiMinime = listaMeniuri.get(0);
        for(OfertaMeniu oferta:listaMeniuri) {
            if(oferta.getNrCalorii()<ofertaMeniuCaloriiMinime.getNrCalorii()) {
                ofertaMeniuCaloriiMinime = oferta;
            }
        }
        return ofertaMeniuCaloriiMinime;
    }
}
