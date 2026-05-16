public class Pacient implements IObserver {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Pacientul " + nume + " a primit notificarea: " + mesaj);
    }
}
