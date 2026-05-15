public class Ospatar extends AHandler{
    @Override
    void procesareComanda(Comanda comanda) {
        if(comanda.getGrad()<=5){
            System.out.println("Ospatarul a procesat comanda "+comanda.getProdus());
        }
        else {
            System.out.println("Ospatarul nu poate procesa aceasta comanda.");
            if(this.getNextHandler()!=null){
                this.getNextHandler().procesareComanda(comanda);
            }
        }
    }
}
