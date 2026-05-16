public class ComandaConstituire implements IComanda {
    private ContBancar contBancar;

    public ComandaConstituire(ContBancar contBancar) {
        this.contBancar = contBancar;
    }

    @Override
    public void executa() {
        contBancar.constituieCont();
    }

    @Override
    public void undo() {
        contBancar.anuleazaConstituirea();
    }
}
