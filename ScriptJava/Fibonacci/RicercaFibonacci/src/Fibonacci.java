import java.util.ArrayList;


public class Fibonacci {

    //Funzione per trovare numero in base alla sequenza e dire se pari o dispari
    public static void trovaNumero(ArrayList<Integer> sequenza, int sceltaNumeroUtente) {
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
        Risultato(b, sceltaNumeroUtente, x);
    }

    // Metodo che crea la sequenza di fibonacci
    public static ArrayList<Integer> Sequenza(ArrayList<Integer> sequenza, int i) {

        if (sequenza.size() == i) {
            return sequenza;
        }
        int x = sequenza.size();
        int n1 = sequenza.get(x - 2);
        int n2 = sequenza.get(x - 1);
        int n3 = n1 + n2;
        sequenza.add(n3);
        sequenza = Sequenza(sequenza, i);
        return sequenza;
    }


    // Funzione che stampa se il numero è presente
    public static void Risultato(boolean x, int nScelto, int i) {
        if (!x) {
            System.out.println("Il numero " + nScelto + " non è presente tra questi numeri");
        } else {
            System.out.println("Numero " + nScelto + " è presente in posizione " + i);
        }
    }
}
