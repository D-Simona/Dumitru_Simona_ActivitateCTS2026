public class ComandaPizza implements IComanda {
    private String pizza;
    private String tipBlat;
    private Bucatar bucatar;

    public ComandaPizza(String pizza, String tipBlat, Bucatar bucatar) {
        super();
        this.pizza = pizza;
        this.tipBlat = tipBlat;
        this.bucatar = bucatar;
    }

    @Override
    public void prelucreaza() {
        this.bucatar.preparePizza(pizza, tipBlat);

    }
}
