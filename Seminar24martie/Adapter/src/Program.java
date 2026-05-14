import Clase.AdaptorEvaluareClient_Clase;
import RestaurantA.EvaluareClientiFirmaA;
import RestaurantA.IEvaluareClientFirmaA;
import RestaurantB.Client;
import RestaurantB.EvaluareClientFirmaB;
import RestaurantB.IEvaluareClientFrimaB;
import obiecte.AdaptorEvaluareClient_Obiect;

public class Program {
    public static void main(String[] args) {
        //RESTAURANT A
        System.out.println(".....ce se intampla in restaurant A.....");
        IEvaluareClientFirmaA evA = new EvaluareClientiFirmaA();
        evA.analizaClientFirmaA(1200);

        //RESTAURANT B
        System.out.println(".....ce se intampla in restaurant B.....");
        int[] costEvenimente = new int[]{1000,2000,20000,1000,5000};
        Client client = new Client("XYZ", 5, costEvenimente);
        IEvaluareClientFrimaB evB = new EvaluareClientFirmaB();
        evB.analizaClientFirmaB(client);


        //IN ACEST PUNCT RESTAURANT B A FOST CUMPARAT DE RESTAURANTUL A
        //TREBUIE ADAUGAT UN BRIDGE/CONEXIUNE/ADAPTER INTRE CELE 2 FRAMEWORK-URI

        //folosind adapter pe clase
        System.out.println(".....ce se intampla in restaurant B dupa ce a fost cumparat.....");
        int[] costEvenimente2 = new int[]{1000,2000,20000,1000,5000};
        Client client2 = new Client("XYZ", 5, costEvenimente2);
        IEvaluareClientFrimaB evB2 = new AdaptorEvaluareClient_Clase();
        evB2.analizaClientFirmaB(client2);

        //folosind adapter pe obiecte
        System.out.println(".....ce se intampla in restaurant B dupa ce a fost cumparat.....");
        int[] costEvenimente3 = new int[]{1000,2000,20000,1000,5000};
        Client client3 = new Client("XYZ", 5, costEvenimente3);
        IEvaluareClientFrimaB evB3 = new AdaptorEvaluareClient_Obiect(new EvaluareClientiFirmaA());
        evB2.analizaClientFirmaB(client3);
    }
}
