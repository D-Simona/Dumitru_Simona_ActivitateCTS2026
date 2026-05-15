import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Vizitator v1 = new Vizitator("Ionica", true);
        Vizitator v2 = new Vizitator("Maricica", false);
        Vizitator v3 = new Vizitator("Mihaita", true);
        Vizitator v4 = new Vizitator("Martinel", true);

        ISpital spital = new Spital("Sf Maria");
        ISpital spitalProxy = new SpitalProxy(spital);

        spitalProxy.permiteAcces(v1);
        spitalProxy.permiteAcces(v2);
        spitalProxy.permiteAcces(v3);
        spitalProxy.permiteAcces(v4);

    }
}
