import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuFibonacci {


    // Menu per avvio programma
    public void Menu() {

        Scanner nDaTrovare = new Scanner(System.in);   //crea scanner per numero da trovare
        Scanner nSequenza = new Scanner(System.in); //crea scanner per numero sequenza

        System.out.println("Inserisci il numero che vuoi cercare ");
        int numeroDaTrovare = nDaTrovare.nextInt();
        System.out.println("Quanti numeri deve essere lunga la sequenza?");
        int lunghezzaSequenza = (nSequenza.nextInt() + 2);
        ArrayList<Integer> sequenza = new ArrayList<>(List.of());
        sequenza.add(0);
        sequenza.add(1);
        sequenza.add(1);
        sequenza = Fibonacci.Sequenza(sequenza, lunghezzaSequenza);
        Fibonacci.trovaNumero(sequenza, numeroDaTrovare);
        nDaTrovare.close(); //chiude scanner
        nSequenza.close(); //chiude scanner
    }

}
