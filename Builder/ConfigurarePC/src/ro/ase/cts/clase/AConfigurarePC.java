package ro.ase.cts.clase;

public interface AConfigurarePC {
    ConfigurarePC build();

    AConfigurarePC setProcesor(String procesor);
    AConfigurarePC setRAM(int RAM);
    AConfigurarePC setPlacaVideo(boolean placaVideo);
}
