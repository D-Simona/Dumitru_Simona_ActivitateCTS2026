public class Bucatar {
    private String numeBucatar;

    public Bucatar(String numeBucatar) {
        super();
        this.numeBucatar = numeBucatar;
    }

    public void preparePizza(String pizza, String tipBlat) {
        System.out.println("Bucatarul "+ this.numeBucatar + " a pregatit pizaa "+pizza+" cu blatul "+tipBlat);
    }

    public void preparePaste(String paste) {
        System.out.println("Bucatarul "+this.numeBucatar+" a pregatit paste "+paste);
    }
}
