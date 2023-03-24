import java.util.ArrayList;

public class Admin extends Utente implements comandiAdmin{

    private static String password = "123456";

    public Admin(String nomeUtente) {
        super(nomeUtente);
    }

    @Override
    public void deleteUser(ArrayList<Utente> utenti, int x) {
        utenti.remove(x);
    }

    @Override
    public void showUsers(ArrayList<Utente> utenti){
        for(int i = 0; i < utenti.size(); i++){
            System.out.println("[" + i + "]" + utenti.get(i).nomeUtente);
        }
    }

    public static String getPassword() {
        return password;
    }
}
