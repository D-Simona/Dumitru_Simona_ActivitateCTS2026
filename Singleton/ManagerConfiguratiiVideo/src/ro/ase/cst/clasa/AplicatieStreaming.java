package ro.ase.cst.clasa;

public class AplicatieStreaming {
    private String rezolutie;
    private int bitrate;
    public static AplicatieStreaming instance = new AplicatieStreaming("1080p", 6000);

    private AplicatieStreaming(String rezolutie, int bitrate) {
        this.rezolutie = rezolutie;
        this.bitrate = bitrate;
    }

    public static synchronized AplicatieStreaming getInstance(){
        return instance;
    }
}
