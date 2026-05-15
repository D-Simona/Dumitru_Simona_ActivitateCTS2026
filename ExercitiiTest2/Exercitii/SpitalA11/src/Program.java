public class Program {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Popescu Ion");

        pacient.setModPlata(new PlataCash());
        pacient.platesteSpitalizare(500);

        pacient.setModPlata(new PlataCard());
        pacient.platesteSpitalizare(750);
    }

}
