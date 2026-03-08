package personal;

public class Medic extends PersonalSpital{
    public Medic(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("nume='").append(super.nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
