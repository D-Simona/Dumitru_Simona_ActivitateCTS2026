package ro.ase.cts.clase;

public class Debit extends CardBancar{
    public Debit(int nrCard) {
        super(nrCard);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Debit{");
        sb.append("nrCard=").append(super.nrCard);
        sb.append('}');
        return sb.toString();
    }
}
