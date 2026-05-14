package RestaurantA;

public class EvaluareClientiFirmaA implements IEvaluareClientFirmaA{

    @Override
    public void analizaClientFirmaA(int costTotalEveniment) {
        System.out.println("Metoda analiza client firma A");
        double procentDiscount=0;

        if(costTotalEveniment>1000) {
            procentDiscount=0.10;
        }
        else if (costTotalEveniment>500) {
            procentDiscount=0.05;
        }
        else procentDiscount=0.00;

        System.out.println("S-a oferit un discount de: " + procentDiscount);
    }
}
