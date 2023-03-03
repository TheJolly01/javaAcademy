public class Utente {

    public String nomeUtente;
    private String password;


    public Utente(String nomeUtente, String password){

        this.nomeUtente = nomeUtente;
        this.password = password;

    }


    // GETTER
    public String getPassword() {
        return password;
    }

    // SETTER
    public void setPassword(String password) {
        this.password = password;
    }
}
