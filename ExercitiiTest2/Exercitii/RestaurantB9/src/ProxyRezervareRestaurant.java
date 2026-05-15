public class ProxyRezervareRestaurant implements IRezervare {

    private IRezervare rezervareResturant;

    public ProxyRezervareRestaurant(IRezervare rezervareResturant) {
        this.rezervareResturant = rezervareResturant;
    }

    @Override
    public void relizeazaRezervarea(String numeClient, int numarPersoane) {
        if(numarPersoane>=4) {
            rezervareResturant.relizeazaRezervarea(numeClient, numarPersoane);
        }else {
            System.out.println("Rezervarea pentru " + numeClient
                    + " nu a fost realizata. Pentru " + numarPersoane
                    + " persoane, clientii sunt rugati sa se prezinte direct la restaurant.");
        }
    }
}
