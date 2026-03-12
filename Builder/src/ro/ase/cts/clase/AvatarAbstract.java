package ro.ase.cts.clase;

public interface AvatarAbstract {
    Avatar build();

    AvatarAbstract setNume(String nume);
    AvatarAbstract setPorecla(String porecla);
    AvatarAbstract setCostum (String costum);
    AvatarAbstract setAccesorii (String accesorii);
    AvatarAbstract setNivelDificultate (int nivelDificultate);
}
