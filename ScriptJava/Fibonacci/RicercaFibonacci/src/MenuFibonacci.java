import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuFibonacci {


    // Menu per avvio programma
    public void Menu(SerieFibonacci serieFibonacci) {

        int rispostaAccesso = 0;

        do {
            rispostaAccesso = inputSelezione("Vuoi avviare il programma?\n[1] SI\n[2] NO");
            if(rispostaAccesso == 1) {
                int numeroDaTrovare = inputSelezione("Inserisci il numero che vuoi cercare");
                int lunghezzaSequenza = (inputSelezione("Quanti numeri deve essere lunga la sequenza?") + 2);
                ArrayList<Integer> sequenza = new ArrayList<>(List.of());
                sequenza.add(0);
                sequenza.add(1);
                sequenza.add(1);
                sequenza = serieFibonacci.Sequenza(sequenza, lunghezzaSequenza);
                serieFibonacci.trovaNumero(sequenza, numeroDaTrovare);
            } else if(rispostaAccesso != 2){
                System.out.println("ERRORE, riprova");
            }
        } while(rispostaAccesso !=2);
    }


    public int inputSelezione(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextInt();
    }


}
