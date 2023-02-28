/*
 * Creare un sistema di inserimento che crei una classe utente di 3 diversi tipi, chef , chef capo, e magazziniere che
 *  devono avere la stessa classe d'origine ovvero utente ma carrateristiche diverse in base ai parametri
 * infatti chiamanda nomeutente.Cosasei deve dirci di che tipo è
 *
 * */
import java.util.Scanner;
public class Utente {

    String tipoUtente;
    String nomeUtente;
    String password;


    public Utente(boolean passLiv1){
        tipoUtente = "Magazziniere";
    }
    public Utente(boolean passLiv1, boolean passLiv2){
        tipoUtente = "Chef";
    }
    public Utente(boolean passLiv1, boolean passLiv2, boolean passLiv3){
        tipoUtente = "CapoChef";
    }

    public void inserimento(){
        Scanner nome = new Scanner(System.in);
        Scanner psw = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome");
        nomeUtente = nome.nextLine();

        System.out.println("Inserisci la tua password");
        password = psw.nextLine();
    }






    public static void main(String[] args) {



        int rispostaTipo = 0;
        boolean passLiv1, passLiv2, passLiv3;
        passLiv1 = true;
        passLiv2 = true;
        passLiv3 = true;


        Scanner rispTipo = new Scanner(System.in);
        Utente utente = null;


        System.out.println("Cosa vuoi essere?");
        System.out.println("[1]MAGAZZINIERE");
        System.out.println("[2]CHEF");
        System.out.println("[3]CAPO CHEF");
        rispostaTipo = rispTipo.nextInt();

        if(rispostaTipo == 1){
            System.out.println("Hai ottenuto il pass di livello 1");
            utente = new Utente(passLiv1);
            utente.inserimento();
        }
        if(rispostaTipo == 2){
            System.out.println("Hai ottenuto il pass di livello 1 e di livello 2");
            utente = new Utente(passLiv1, passLiv2);
            utente.inserimento();
        }
        if(rispostaTipo == 3){
            System.out.println("Hai ottenuto il pass di livello 1, 2 e 3");
            utente = new Utente(passLiv1, passLiv2, passLiv3);
            utente.inserimento();
        }

        if(rispostaTipo == 1 || rispostaTipo == 2 || rispostaTipo == 3){
            System.out.println(utente.nomeUtente);
            System.out.println(utente.password);
            System.out.println(utente.tipoUtente);
        }







    }
}
