public class ComandaDepunere implements IComanda {
    private ContBancar contBancar;
    private double suma;

    public ComandaDepunere(ContBancar contBancar, double suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    @Override
    public void executa() {
        contBancar.depunere(suma);
    }

    @Override
    public void undo() {
        contBancar.retragere(suma);
    }
}
