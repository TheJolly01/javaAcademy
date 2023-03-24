import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Utente {

    String password;

    public static void opzioniAdmin(ArrayList<Utente> utenti){

        int rispostaAdmin;
        do{
             rispostaAdmin = inputInt("Vuoi gestire gli utenti?\n[1]SI\n[2]NO");

            for(int i = 0; i < utenti.size(); i ++){
                System.out.println("[" + i + "] " + utenti.get(i));
            }

            int scegliUtente = inputInt("Seleziona l'utente");

            int scegliLavoro = inputInt("Che lavoro deve fare l'utente?\n[1] Muratore\n[2] Pastore\n[3] Commerciante\n[4] Cuoco");

            if(scegliLavoro == 1) {
                utenti.get(scegliUtente).lavoro = "Muratore";
            }
            if(scegliLavoro == 2) {
                utenti.get(scegliUtente).lavoro = "Pastore";
            }
            if(scegliLavoro == 3) {
                utenti.get(scegliUtente).lavoro = "Commerciante";
            }
            if(scegliLavoro == 4) {
                utenti.get(scegliUtente).lavoro = "Cuoco";
            }

            utenti.get(scegliUtente).durataLavoro = inputInt("Quanto è la durata del lavoro?");

        }while(rispostaAdmin != 2);
    }

    public static int inputInt(String stringa){
        Scanner scanner = new Scanner(System.in);
        System.out.println(stringa);
        return scanner.nextInt();
    }
}
