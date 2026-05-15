public class Program {
    public static void main(String[] args) {
        IRezervare rezervareResturant = new RezervareRestaurant();
        IRezervare rezervareProxy = new ProxyRezervareRestaurant(rezervareResturant);

        rezervareProxy.relizeazaRezervarea("Ana", 2);
        rezervareProxy.relizeazaRezervarea("Robert", 6);
        rezervareProxy.relizeazaRezervarea("Ioana", 4);
    }
}
