import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner rispAccesso = new Scanner(System.in);
        int rispostaAccesso = 0;

        boolean check;
        do {
            System.out.println("VUOI ACCEDERE AL SITO?");
            System.out.println("[1]SI");
            System.out.println("[2]NO");
            rispostaAccesso = rispAccesso.nextInt();

            if(rispostaAccesso == 1) {
                do {
                    check = CreazioneUtente.menuCreazioneUtente();
                } while (!check);
                Utente utente = new Utente();


                utente.nome = CreazioneUtente.arrNomi.get(CreazioneUtente.ID);
                utente.password = CreazioneUtente.arrPassword.get(CreazioneUtente.ID);
                utente.budget = CreazioneUtente.arrBudget.get(CreazioneUtente.ID);
                utente.budget -= GestioneRistorante.avviaRistorante();
            }
        }while(rispostaAccesso != 2);

    }

}