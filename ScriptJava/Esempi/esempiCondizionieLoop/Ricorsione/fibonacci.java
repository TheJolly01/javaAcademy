public class fibonacci {

    public static void main(String[] args) {
        int numero1 = 0; // dichiarazione e inizializzazione variabile numero1
        int numero2 = 1;// dichiarazione e inizializzazione variabile numero2
        int numero = 0;// dichairazione e inizializzazione variabile numero
        int nVolte = 20;// dichiarazione e inizializzazione variabile nVolte

        for (int i = 0; i < nVolte; i++) { // ciclo for per ripetizione operazioni per ottenimento numeri di fibonacci

            numero = numero1 + numero2; // primo passaggio fibonacci
            numero1 = numero2; // secondo passaggio fibonacci
            numero2 = numero; // terzo passaggio fibonacci

            System.out.println(numero); // stampa numero

        }

    }

}