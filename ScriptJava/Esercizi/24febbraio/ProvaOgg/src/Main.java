import java.util.Scanner;
public class Main {

    String nomeUtente;
    String password;

    public static void main(String[] args) {

        Main user1 = new Main();

        Scanner insNome = new Scanner(System.in);
        Scanner insPassword = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome utente");
        user1.nomeUtente = insNome.nextLine();

        System.out.println("Inserisci il la tua password");
        user1.password = insPassword.nextLine();

        System.out.println("Nome utente: " + user1.nomeUtente);
        System.out.println("Password: " + user1.password);

    }
}
