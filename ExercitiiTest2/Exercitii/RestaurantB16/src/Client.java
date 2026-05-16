public class Client {
    private String nume;
    private String numarTelefon;
    private String adresaEmail;

    public Client(String nume, String numarTelefon, String adresaEmail) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresaEmail = adresaEmail;
    }

    public String getNume() {
        return nume;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public String getAdresaEmail() {
        return adresaEmail;
    }
}
