import java.util.Scanner;
public class ProvaOgg {

    String nomeUtente;
    String password;

    public static void main(String[] args){

        ProvaOgg user1 = new ProvaOgg();

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
