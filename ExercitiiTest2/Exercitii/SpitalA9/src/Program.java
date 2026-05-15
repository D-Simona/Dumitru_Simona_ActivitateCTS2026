public class Program {
    public static void main(String[] args) {
        Persoana p1 = new Persoana("Georgel", true);
        Persoana p2 = new Persoana("Maria", false);
        Persoana p3 =new Persoana("Ion", true);

        ISpital spital = new Spital("Sf Maria");
        ISpital spitalProxy = new SpitalProxy(spital);
        spitalProxy.permiteInternare(p1);
        spitalProxy.permiteInternare(p2);
        spitalProxy.permiteInternare(p3);


    }
}
