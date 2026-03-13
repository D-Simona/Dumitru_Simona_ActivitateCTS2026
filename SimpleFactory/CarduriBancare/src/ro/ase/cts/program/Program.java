package ro.ase.cts.program;

import ro.ase.cts.clase.CardBancar;
import ro.ase.cts.factory.FabricaCarduri;
import ro.ase.cts.factory.TipCard;

public class Program {
    public static void main(String[] args) {
        FabricaCarduri fabrica = FabricaCarduri.getInstance();
        CardBancar debit = fabrica.getFabricaCarduri(TipCard.Debit, 123456);
    }
}
