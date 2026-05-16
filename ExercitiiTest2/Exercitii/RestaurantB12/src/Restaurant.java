import java.util.ArrayList;
import java.util.List;

public class Restaurant implements ISubject {
    private String nume;
    private List<IObserver> listaAbonati;

    public Restaurant(String nume) {
        this.nume = nume;
        this.listaAbonati=new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IObserver observer) {
        listaAbonati.add(observer);
    }

    @Override
    public void stergeObserver(IObserver observer) {
        listaAbonati.remove(observer);

    }

    @Override
    public void notificaObserver(String mesaj) {
        for(IObserver observer:listaAbonati) {
            observer.primesteNotificare(mesaj);
        }
    }

    public void adaugaOfertaNoua(String descriereOferta) {
        String mesaj="Restaurantul "+nume+" a introdus o oferta noua "
                +descriereOferta;
        notificaObserver(mesaj);
    }

    public void meniuNou(String denumireMeniu) {
        String mesaj = "Restaurantul "+nume+"a introdus un meniu nou: "
                +denumireMeniu;
        notificaObserver(mesaj);
    }
}
