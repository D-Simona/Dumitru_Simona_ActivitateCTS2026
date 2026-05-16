import java.util.ArrayList;
import java.util.List;

public class Spital implements ISubject {
    private String nume;
    private List<IObserver> pacientiAbonati;

    public Spital(String nume) {
        this.nume = nume;
        this.pacientiAbonati=new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IObserver observer) {
        pacientiAbonati.add(observer);
    }

    @Override
    public void stergeObserver(IObserver observer) {
        pacientiAbonati.remove(observer);
    }

    @Override
    public void notificaObserver(String mesaj) {
        for(IObserver observer:pacientiAbonati){
            observer.primesteNotificare(mesaj);
        }
    }

    public void anuntaUrgentaVirus(String virus) {
        String mesaj = "Urgenta medicala! A aparut virusul " + virus
                + " ! Respectati recomandarile spitalului "+nume;
        notificaObserver(mesaj);
    }
}
