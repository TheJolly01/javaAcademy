public class forContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { // ciclo for per stampa numero
            if (i == 4) { // se il numero è uguale a 4
                continue; // salta il resto del codice e ritorna all'inizio del ciclo
            }
            System.out.println(i); // stampa numero
        }
    }
}
