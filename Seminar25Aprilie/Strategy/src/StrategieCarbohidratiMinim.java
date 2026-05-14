import java.util.ArrayList;

public class StrategieCarbohidratiMinim implements IProcesabil{
    @Override
    public OfertaMeniu alefereMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
        OfertaMeniu ofertaMeniuCarbohidratiMinimi = listaMeniuri.get(0);
        for(OfertaMeniu oferta:listaMeniuri) {
            if(oferta.getNrCalorii()<ofertaMeniuCarbohidratiMinimi.getNrCalorii()) {
                ofertaMeniuCarbohidratiMinimi = oferta;
            }
        }
        return ofertaMeniuCarbohidratiMinimi;
    }
}
