public class ComandaRetragere implements IComanda {
    private ContBancar contBancar;
    private double suma;

    public ComandaRetragere(ContBancar contBancar, double suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    @Override
    public void executa() {
        contBancar.retragere(suma);
    }

    @Override
    public void undo() {
        contBancar.depunere(suma);
    }
}
