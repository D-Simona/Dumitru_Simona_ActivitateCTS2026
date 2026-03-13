package ro.ase.cts.factory;

import ro.ase.cts.clase.CardBancar;
import ro.ase.cts.clase.Credit;
import ro.ase.cts.clase.Debit;
import ro.ase.cts.clase.Gold;


public class FabricaCarduri {
    private static FabricaCarduri instance=null;

    public static synchronized FabricaCarduri getInstance(){
        if(instance==null){
            instance=new FabricaCarduri();
        }
        return instance;
    }

    public FabricaCarduri() {
    }

    public CardBancar getFabricaCarduri(TipCard tipCard, int nrCard){
        return switch(tipCard){
            case TipCard.Credit -> new Credit(nrCard);
            case TipCard.Debit -> new Debit(nrCard);
            case TipCard.Gold -> new Gold(nrCard);
            default->null;
        };
    }
}
