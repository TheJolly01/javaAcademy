public class whileContinue2 {
    public static void main(String[] args) {
        int i = 0; // dichiarazione e inizializzazione variabile i
        while (i < 10) { // ciclo while finchè i non raggiunge valore 10
            if (i == 4) { // se i = 4
                i++; // incrementa i di 1
                continue; // salta resto del codice e riprendi dall`inizio del while
            }
            System.out.println(i); // stampa variabile i
            i++; // incrementa i di 1
        }
    }
}
