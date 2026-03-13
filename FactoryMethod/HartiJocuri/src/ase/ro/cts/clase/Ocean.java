package ase.ro.cts.clase;

public class Ocean extends Harta{
    public Ocean(String monstru) {
        super(monstru);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ocean{");
        sb.append("monstru='").append(super.monstru).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
