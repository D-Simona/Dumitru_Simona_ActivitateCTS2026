package ro.ase.cts.abonamente;

public class Silver extends Abonament{
    public Silver(String denumire) {
        super(denumire);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Abonament{");
        sb.append("denumire='").append(super.denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
