public class RezervareRestaurant implements IRezervare {


    @Override
    public void relizeazaRezervarea(String numeClient, int numarPersoane) {
        System.out.println("Rezervarea pentru "+numeClient+" a fost realizata pentru "+ numarPersoane+" persoane");
    }
}
