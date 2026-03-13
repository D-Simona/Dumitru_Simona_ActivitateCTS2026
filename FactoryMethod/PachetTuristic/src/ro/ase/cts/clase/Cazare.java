package ro.ase.cts.clase;

public class Cazare extends Pachet{
    public Cazare(String denumire) {
        super(denumire);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cazare{");
        sb.append("denumire='").append(super.denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
