import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    public void MenuFibonacci() { // Input numero da cercare e lunghezza serie

        Scanner trovaNumero = new Scanner(System.in);
        Scanner lungSequenza = new Scanner(System.in);

        System.out.println("Inserisci il numero che vuoi cercare ");
        int numeroDaTrovare = trovaNumero.nextInt();

        System.out.println("Quanti numeri deve essere lunga la sequenza?");
        int lunghezzaSequenza = (lungSequenza.nextInt() + 2);

        ArrayList<Integer> sequenza = new ArrayList<>(List.of());
        sequenza.add(0);
        sequenza.add(1);
        sequenza.add(1);
        sequenza = CreaSequenza(sequenza, lunghezzaSequenza);
        trovaNumero(sequenza, numeroDaTrovare);
        trovaNumero.close();
        lungSequenza.close();
    }

    public static void trovaNumero(ArrayList<Integer> sequenza, int sceltaNumeroUtente) { // Metodo per la ricerca del numero e controllo pari dispari
        boolean b = false;
        int x = 0;
        for (int i = 0; i < sequenza.size(); i++) {
            if (sequenza.get(i) == sceltaNumeroUtente) {
                System.out.print(" <--- ");
                b = true;
                x = i + 1;
            }

            if (sequenza.get(i) % 2 == 0)
                System.out.println(sequenza.get(i) + " - pari");
            else
                System.out.println(sequenza.get(i) + " - dispari");
        }
        StampaRisultati(b, sceltaNumeroUtente, x);
    }

    public static ArrayList<Integer> CreaSequenza(ArrayList<Integer> sequenza, int loop) { // Creazione Successione di
        // Fibonacci

        if (sequenza.size() == loop) {
            return sequenza;
        }
        int x = sequenza.size();
        int n1 = sequenza.get(x - 2);// Numero sequenza
        int n2 = sequenza.get(x - 1);// Numero sequenza
        // Numero Somma 0 + 1
        int n3 = n1 + n2; // somma numero attuale sequenza e precedente
        sequenza.add(n3);
        sequenza = CreaSequenza(sequenza, loop);
        return sequenza;

    }

    public static void StampaRisultati(boolean b, int sceltaNumeroUtente, int x) { // Stampa risultati

        if (!b) {
            System.out.println("Il numero " + sceltaNumeroUtente + " non è presente tra questi numeri");
        } else {
            System.out.println("Numero " + sceltaNumeroUtente + " è presente in posizione " + x);

        }

    }

}
