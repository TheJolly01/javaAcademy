/*
 * 
 * Creare un sistema di inserimento che permetta di registrarsi tramite lo
 * stesso metodo ma che abbia più livelli (almeno 3 normale, admin, capo c'è ne può essere solo uno)
 * 
 * Alla fine deve stapare i dati di tutti gli utenti
 * 
 */

import java.util.Scanner;

public class firstOverload {

    public static void main(String[] args) {

        Scanner nUtente = new Scanner(System.in);
        Scanner pUtente = new Scanner(System.in);
        Scanner rispCod = new Scanner(System.in);
        Scanner codAd = new Scanner(System.in);
        Scanner registraUt = new Scanner(System.in);

        String codiceAdmin = "1234";

        String codiceBoss = "4321";
        int registraUtente = 0;

        do {

            System.out.println("Vuoi registrarti?");
            System.out.println("[1] SI");
            System.out.println("[2] NO");
            registraUtente = registraUt.nextInt();

            System.out.println("Inserisci il tuo nome");
            String nomeUtente = nUtente.nextLine();

            System.out.println("Inserisci la tua password");
            String passwordUtente = pUtente.nextLine();

            System.out.println("Hai un codice admin?");
            System.out.println("[1] SI");
            System.out.println("[2] NO");
            int rispostaCodice = rispCod.nextInt();

            if (rispostaCodice == 1) {

                System.out.println("Inserisci il codice");
                String codiceAd = codAd.nextLine();

                if (codiceAd.equals("1234")) {

                    System.out.println("Sei un Admin");

                } else if (codiceAd.equals("4321")) {

                    System.out.println("Oddio sei tu, il capo dei capi");

                } else {
                    System.out.println("Hai inserito il codice sbagliato, sei bugiardo");
                }

            }
        } while (registraUtente != 2);

    }
}
