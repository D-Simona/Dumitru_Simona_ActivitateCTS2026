public class Pacient {
    private String nume;
    private IModPlata modPlata;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteSpitalizare(double suma) {
        if(modPlata==null) {
            System.out.println("Pacientul nu a ales un mod de plata");
        } else {
            System.out.println("Pacientul: "+nume);
            modPlata.plateste(suma);
        }
    }
}
