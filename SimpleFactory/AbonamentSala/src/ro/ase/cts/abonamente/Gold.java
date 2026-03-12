package ro.ase.cts.abonamente;

public class Gold extends Abonament{
    public Gold(String denumire) {
        super(denumire);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gold{");
        sb.append("denumire='").append(super.denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
