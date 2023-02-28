public class Main {
    public static void main(String[] args) {
        String nome = "Antonio"; // dichiarazione e inizializzazione stringa nome
        String cognome = "Delrio"; // dichiarazione e inizializzazione stringa cognome
        String anni = "21"; // dichiarazione e inizializzazione anni
        System.out.println("Stampa1"); // stampa scritta stampa 1
        System.out.println(nome + " " + cognome + " " + anni); // stampa nome cognome e anni

        System.out.println("-------------------------"); // stampa divisore delle stampe

        String dati = nome + " " + cognome + " " + anni; // unione stringhe nome cognome e dati in un unica stringa
        System.out.println("Stampa2"); // stampa scritta stampa 2
        System.out.println(dati); // stampa stringa dati

    }
}