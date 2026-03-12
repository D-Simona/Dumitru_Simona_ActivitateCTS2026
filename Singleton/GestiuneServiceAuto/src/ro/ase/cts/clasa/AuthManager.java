package ro.ase.cts.clasa;

public class AuthManager {

    private String token;
    private int idUtilizator;
    public static AuthManager instance = new AuthManager("1skhg54akhf981", 5);

    private AuthManager(String token, int idUtilizator) {
        this.token = token;
        this.idUtilizator = idUtilizator;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static synchronized AuthManager getInstance(){
        return instance;
    }
}
