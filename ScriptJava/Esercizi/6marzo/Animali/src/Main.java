/*
 Creare una classe registratore che registri gli ingressi e faccia istanziare
 quattro tipi in ingresso in base al tipo di animale che viene portato. Creare un
 sistema per l'inserimento, che richieda che animale è stato portato, e stampare alla
 fine la lista completa.

 (Felini, Canidi, Anfibi, Roditori)

 */

public class Main {
    public static void main(String[] args) {

        Felini felini = new Felini();   // crea oggetto felini
        Canidi canidi = new Canidi();   // crea oggetto canidi
        Anfibi anfibi = new Anfibi();   // crea oggetto anfibi
        Roditori roditori = new Roditori(); // crea oggetto roditori
        Altro altro = new Altro(); // crea oggetto altro

        Registratore.RegistraAnimali(felini, canidi, anfibi, roditori, altro); // metodo per registrare animali entrati e il numero

        Visualizza.visualizzaCompleto(felini, canidi, anfibi, roditori, altro); // metodo per visualizare tutti gli animali

    }
}