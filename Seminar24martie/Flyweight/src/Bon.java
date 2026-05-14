
//zona nepartajabila, zona unshared, zona extrinseca
public class Bon {
    //starea temporara din diagrama GoF
    private int nrMasa;
    private float CostTotal;

    public Bon(int nrMasa, float costTotal) {
        super();
        this.nrMasa = nrMasa;
        CostTotal = costTotal;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public float getCostTotal() {
        return CostTotal;
    }
}
