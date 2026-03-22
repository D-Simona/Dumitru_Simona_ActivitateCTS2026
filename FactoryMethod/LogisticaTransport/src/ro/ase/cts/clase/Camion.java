package ro.ase.cts.clase;

public class Camion extends Transport {
    public Camion(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Camion{");
        sb.append("nrInmatriculare='").append(super.nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
