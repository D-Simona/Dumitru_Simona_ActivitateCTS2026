package ro.ase.cts.clase;

public class Nava extends Transport{
    public Nava(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Nava{");
        sb.append("nrInmatriculare='").append(super.nrInmatriculare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
