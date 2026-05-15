public class Comanda {
    private String produs;
    private int cantitate;
    private int grad; //grad de dificultate pentru a sti cine poate sa execute aceasta comanda

    public Comanda(String produs, int cantitate, int grad) {
        this.produs = produs;
        this.cantitate = cantitate;
        this.grad = grad;
    }

    public String getProdus() {
        return produs;
    }

    public int getCantitate() {
        return cantitate;
    }

    public int getGrad() {
        return grad;
    }
}
