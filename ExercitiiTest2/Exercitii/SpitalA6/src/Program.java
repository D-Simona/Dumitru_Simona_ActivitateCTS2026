public class Program {
    public static void main(String[] args) {
        Medic medic = new Medic("Dr Georgescu");
        Salon salon = new Salon(50, 1);

        FacadeInternare facadeInternare = new FacadeInternare(medic, salon);

        Pacient p1 = new Pacient("Ana", 8);
        Pacient p2 = new Pacient("Ion", 5);
        Pacient p3 = new Pacient("Florica", 9);

        facadeInternare.verificaInternarea(p1);
        facadeInternare.verificaInternarea(p2);
        facadeInternare.verificaInternarea(p3);

    }

}
