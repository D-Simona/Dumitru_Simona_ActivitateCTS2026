public class ContBancar {
    private String iban;
    private double sold;

    public ContBancar(String iban, double sold) {
        this.iban = iban;
        this.sold = sold;
    }

    public void constituieCont() {
        System.out.println("Contul bancar "+iban+ " a fost constituit");
    }

    public void anuleazaConstituirea() {
        System.out.println("Constituiea contului bancar "+iban+" a fost anulata");
    }

    public void depunere(double suma) {
        sold+=suma;
        System.out.println("S-a depus suma de "+suma+" lei in contul"
        +iban+". Sold curent" + sold+" lei");
    }

    public void retragere(double suma) {
        if(sold>=suma) {
            sold-=suma;
            System.out.println("S-a retras suma de " + suma + " lei din contul " + iban
                    + ". Sold curent: " + sold + " lei.");
        }else {
            System.out.println("Fonduri insuficiente pentru retragerea sumei de " + suma
                    + " lei din contul " + iban + ".");
        }
    }
}
