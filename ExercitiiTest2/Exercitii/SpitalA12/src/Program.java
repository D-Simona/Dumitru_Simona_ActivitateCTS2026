public class Program {
    public static void main(String[] args) {
        Spital spital = new Spital("Municipal");

        Pacient p1 = new Pacient("Marinescu");
        Pacient p2 = new Pacient("Ionescu");
        Pacient p3 = new Pacient("Georgescu");

        spital.adaugaObserver(p1);
        spital.adaugaObserver(p2);
        spital.adaugaObserver(p3);

        spital.anuntaUrgentaVirus("Covid 19");

        spital.stergeObserver(p2);

        spital.anuntaUrgentaVirus("gripal");

    }
}
