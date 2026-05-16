public class Program {
    public static void main(String[] args) {
        ContBancar contBancar = new ContBancar("abc", 1000);

        OperatorBancar operatorBancar = new OperatorBancar();

        operatorBancar.executaComanda(new ComandaConstituire(contBancar));
        operatorBancar.executaComanda(new ComandaDepunere(contBancar, 500));
        operatorBancar.executaComanda(new ComandaRetragere(contBancar, 200));

        operatorBancar.undoUltimaComanda();
        operatorBancar.undoUltimaComanda();
        operatorBancar.undoUltimaComanda();
        operatorBancar.undoUltimaComanda();



    }
}
