package ro.ase.cts.program;

import ro.ase.cts.clasa.AuthManager;

public class Main {
    public static void main(String[] args) {
        AuthManager autentificare1 = AuthManager.getInstance();
        AuthManager autentificare2 = AuthManager.getInstance();
        autentificare2.setToken("5mnb6");
        System.out.println(autentificare1.getToken());
    }
}
