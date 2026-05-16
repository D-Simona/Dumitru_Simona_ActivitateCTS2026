public interface ISubject {
    public void adaugaObserver(IObserver observer);
    public void stergeObserver(IObserver observer);
    public void notificaObserver(String mesaj);
}
