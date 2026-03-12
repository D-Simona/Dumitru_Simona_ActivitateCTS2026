package ro.ase.cts.abonamente;

public class Vip extends Abonament{
    public Vip(String denumire) {
        super(denumire);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vip{");
        sb.append("denumire='").append(super.denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
