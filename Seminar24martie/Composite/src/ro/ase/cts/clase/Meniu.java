package ro.ase.cts.clase;

public class Meniu {

    //nu este necesar in diagrama GoF
    private Structura structura; //nidul radacina
    private String numeRestaurant;

    public Meniu(Structura structura, String numeRestaurant) {
        this.structura = structura;
        this.numeRestaurant = numeRestaurant;
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public void setNumeRestaurant(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }
}
