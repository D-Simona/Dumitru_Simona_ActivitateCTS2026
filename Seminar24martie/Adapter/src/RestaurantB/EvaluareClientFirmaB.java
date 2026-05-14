package RestaurantB;

public class EvaluareClientFirmaB implements IEvaluareClientFrimaB {
    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Metoda analiza cloent firma B");

        //aici vine logica de acordare discount in functie de client
        System.out.println("S-a oferit discount de 15% pentru client");
    }
}
