package ro.ase.cts.clase;

public class ConfigurarePC {
    private String procesor;
    private int RAM;
    private boolean placaVideo;

    public static class Builder implements AConfigurarePC{
        private String procesor;
        private int RAM;
        private boolean placaVideo;

        @Override
        public ConfigurarePC build() {
            return new ConfigurarePC(procesor, RAM, placaVideo);
        }

        @Override
        public AConfigurarePC setProcesor(String procesor) {
            this.procesor=procesor;
            return this;
        }

        @Override
        public AConfigurarePC setRAM(int RAM) {
            this.RAM=RAM;
            return this;
        }

        @Override
        public AConfigurarePC setPlacaVideo(boolean placaVideo) {
            this.placaVideo=placaVideo;
            return this;
        }
    }


    public ConfigurarePC(String procesor, int RAM, boolean placaVideo) {
        this.procesor = procesor;
        this.RAM = RAM;
        this.placaVideo = placaVideo;
    }

    public ConfigurarePC(){
        this.procesor = "";
        this.RAM = 0;
        this.placaVideo = false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConfigurarePC{");
        sb.append("procesor='").append(procesor).append('\'');
        sb.append(", RAM=").append(RAM);
        sb.append(", placaVideo=").append(placaVideo);
        sb.append('}');
        return sb.toString();
    }
}
