public class ifCondizione {
    public static void main(String[] args) {
        int myAge = 25; // dichiarazione e inizializzazione variabile myAge
        int votingAge = 18; // dichiarazione e inizializzazione variabile votingAge
        System.out.println(myAge >= votingAge); // stampa true se myAge é maggiore di votingAge, altrimenti stampa false

        if (myAge >= votingAge) { // se myAge é maggiore di votingAge
            System.out.println("Puoi votare"); // stampa risposta affermativa
        } else { // altrimenti
            System.out.println("Non puoi votare"); // stampa risposta negativa
        }

    }
}
