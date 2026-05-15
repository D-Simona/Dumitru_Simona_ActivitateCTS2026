public class SpitalProxy implements ISpital {
    private ISpital spital;

    public SpitalProxy(ISpital spital) {
        super();
        this.spital = spital;
    }

    @Override
    public void permiteInternare(Persoana persoana) {
        if(persoana.isAreAsigurare()) {
            spital.permiteInternare(persoana);
        }
        else
            System.out.println("Persoana " + persoana.getNume()+" nu are asigurare de sanatate");

    }
}
