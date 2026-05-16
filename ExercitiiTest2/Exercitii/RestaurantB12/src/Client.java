public class Client implements IObserver {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul "+name+" a primit notificarea: "+mesaj);
    }
}
