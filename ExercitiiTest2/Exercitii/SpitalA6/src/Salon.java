public class Salon {
    private int numarSalon;
    private int paturiLibere;

    public Salon(int numarSalon, int paturiLibere) {
        this.numarSalon = numarSalon;
        this.paturiLibere = paturiLibere;
    }

    public boolean arePatLiber() {
        return paturiLibere>0;
    }

    public void ocupaPat() {
        if(arePatLiber()) {
            paturiLibere--;
            System.out.println("A fost ocupat un pat in salonul "+numarSalon
            +". Paturi ramase libere: "+paturiLibere);
        }
    }
}
