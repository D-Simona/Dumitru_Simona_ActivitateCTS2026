package ase.ro.cts.clase;

public class Desert extends Harta{
    public Desert(String monstru) {
        super(monstru);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("monstru='").append(super.monstru).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
