import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Login login = new Login();
        ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
        ArrayList<Admin> listaAdmin = new ArrayList<Admin>();
        ListaAccount listaAccount = new ListaAccount(listaUtenti, listaAdmin);
        Menu menu = new Menu();

        boolean checkLogin = false;
        boolean checkMenu = false;

        do {
            do {
                checkLogin = login.MenuLogin(listaAccount);
            } while (checkLogin);
            if(checkLogin) {
                checkMenu = menu.MenuBiblioteca(biblioteca);
            }

        } while(!checkMenu);


    }
}