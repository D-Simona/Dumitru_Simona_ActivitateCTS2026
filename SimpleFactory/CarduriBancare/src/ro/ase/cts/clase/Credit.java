package ro.ase.cts.clase;

public class Credit extends CardBancar{
    public Credit(int nrCard) {
        super(nrCard);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Credit{");
        sb.append("nrCard=").append(super.nrCard);
        sb.append('}');
        return sb.toString();
    }
}
