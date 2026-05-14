//clasa Flyweight Factory din diagrama

import java.util.HashMap;

public class MesajPrintareFactory {
    //colectie obiecte flyweight
    //cheia de unicitate o reprezinta enumratia
    //obiectele stocate le reprezinta obj de tip generic Flyweight

    private static HashMap<ETipPrintare, IPrintare> listaMesaje = new HashMap<>();
    private static int nrBonuriPrintate = 0;

    //implementare de tip Late Inititalization (la cerere)
    //metoda getObiectFlyweight din diagrama
    public static IPrintare getMesajPrintare(ETipPrintare tipPrintare) {
        //versiunea curenta este de tip late initialization
        nrBonuriPrintate++;
        IPrintare mesajPrintare = listaMesaje.get(tipPrintare);
        if(mesajPrintare == null) {
            //daca nu s-a folosit pana acum acel medaj de printare, atunxi il construim si il adaugam in mapa
            mesajPrintare = new MesajPrintare(tipPrintare);
            //preluare info despre format printare dintr-o baza de date
            listaMesaje.put(tipPrintare, mesajPrintare);

        }
        return mesajPrintare;
    }

    //aceste metode statice sunt doar pentru a valida utilitatea DP-ului
    //cate bonuri s-au printat?
    public static int getNrBonuriPrintate(){
        return nrBonuriPrintate;
    }

    //cate obiecte de tip mesaj simpatic au fost stocate in memorie in tot procesul de printare?
    public static int getNrMatriteBonuri() {
        return listaMesaje.size();
    }
}
