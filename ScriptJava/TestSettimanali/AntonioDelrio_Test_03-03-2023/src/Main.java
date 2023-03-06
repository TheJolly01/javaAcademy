import java.util.ArrayList;
import java.util.Scanner;
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
        int accesso = 0;

        do {
            Scanner access = new Scanner(System.in);

            do {
                System.out.println("ACCEDERE ALLA BIBLIOTECA?\n[1] SI\n[2] NO");
                accesso = access.nextInt();
                if (accesso > 2) {
                    System.out.println("Opzione ignota riprova");
                }
            } while(accesso > 2 || accesso < 1);
            if(accesso == 1) {
                do {
                    checkLogin = login.MenuLogin(listaAccount);
                } while (checkLogin);
                do {
                    checkMenu = menu.MenuBiblioteca(biblioteca);
                } while (checkMenu);
            }
        } while (accesso != 2);

    }
}