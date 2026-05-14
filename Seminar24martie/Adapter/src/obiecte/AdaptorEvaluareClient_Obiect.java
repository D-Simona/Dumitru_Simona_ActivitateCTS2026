package obiecte;

import RestaurantA.IEvaluareClientFirmaA;
import RestaurantB.Client;
import RestaurantB.IEvaluareClientFrimaB;

public class AdaptorEvaluareClient_Obiect implements IEvaluareClientFrimaB {
    private IEvaluareClientFirmaA evaluareFirmaA;

    public AdaptorEvaluareClient_Obiect(IEvaluareClientFirmaA evaluareFirmaA) {
        this.evaluareFirmaA = evaluareFirmaA;
    }

    //metoda folosita pentru pregatire input pentru evaluare client firma A
    private int costTotalEvenimente(Client client) {
        System.out.println("Transformare input din client in float (total)");
        int costTotalEvenimente = 0;
        for(int i=0;i<client.getNrEvenimente();i++) {
            costTotalEvenimente+=client.getCostEvenimente()[i];
        }
        return costTotalEvenimente;
    }


    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Pare ca ar face  B-ul analiza clientului dar...");
        this.evaluareFirmaA.analizaClientFirmaA(costTotalEvenimente(client));
    }
}
