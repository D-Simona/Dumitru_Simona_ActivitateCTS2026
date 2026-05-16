public class Program {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("La Bunica");
        Client c1 = new Client("Ana");
        Client c2 = new Client("Ion");
        Client c3=new Client("Florica");

        restaurant.adaugaObserver(c1);
        restaurant.adaugaObserver(c2);
        restaurant.adaugaObserver(c3);

        restaurant.adaugaOfertaNoua(" 20% reducere la meniul zilei");
        restaurant.stergeObserver(c1);
        restaurant.meniuNou("Meniu vegetarian");


    }
}
