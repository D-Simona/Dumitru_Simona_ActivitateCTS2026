package ro.ase.cts.clase;

public class Transport extends Pachet{
    public Transport(String denumire) {
        super(denumire);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transport{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
