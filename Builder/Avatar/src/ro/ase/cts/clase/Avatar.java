package ro.ase.cts.clase;

public class Avatar {
    private String nume;
    private String porecla;
    private String costum;
    private String accesorii;
    private int nivelDificultate;

    public static class Builder implements AvatarAbstract{
        private String nume;
        private String porecla;
        private String costum;
        private String accesorii;
        private int nivelDificultate;

        @Override
        public Avatar build() {
            return new Avatar(nume, porecla, costum, accesorii, nivelDificultate);
        }

        @Override
        public AvatarAbstract setNume(String nume) {
           this.nume=nume;
            return this;
        }

        @Override
        public AvatarAbstract setPorecla(String porecla) {
            this.porecla=porecla;
            return this;
        }

        @Override
        public AvatarAbstract setCostum(String costum) {
            this.costum=costum;
            return this;
        }

        @Override
        public AvatarAbstract setAccesorii(String accesorii) {
            this.accesorii=accesorii;
            return this;
        }


        @Override
        public AvatarAbstract setNivelDificultate(int nivelDificultate) {
            this.nivelDificultate=nivelDificultate;
            return this;
        }


    }
    public Avatar(String nume, String porecla, String costum, String accesorii, int nivelDificultate) {
        this.nume = nume;
        this.porecla = porecla;
        this.costum = costum;
        this.accesorii = accesorii;
        this.nivelDificultate = nivelDificultate;
    }

    public Avatar() {
        this.nume = "nume";
        this.porecla = "porecla";
        this.costum = "costum";
        this.accesorii = "accesorii";
        this.nivelDificultate = 1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Avatar{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", porecla='").append(porecla).append('\'');
        sb.append(", costum='").append(costum).append('\'');
        sb.append(", accesorii='").append(accesorii).append('\'');
        sb.append(", nivelDificultate=").append(nivelDificultate);
        sb.append('}');
        return sb.toString();
    }
}
