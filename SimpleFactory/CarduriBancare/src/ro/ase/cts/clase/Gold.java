package ro.ase.cts.clase;

public class Gold extends CardBancar{
    public Gold(int nrCard) {
        super(nrCard);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gold{");
        sb.append("nrCard=").append(super.nrCard);
        sb.append('}');
        return sb.toString();
    }
}
