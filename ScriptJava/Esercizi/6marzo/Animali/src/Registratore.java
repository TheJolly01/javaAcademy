import java.util.Scanner;

public class Registratore {
    public static void RegistraAnimali(Felini felini, Canidi canidi, Anfibi anfibi, Roditori roditori, Altro altro){

        Scanner nomeAnim = new Scanner(System.in);  // scanner per nomi animali
        Scanner sceltaAnim = new Scanner(System.in); // scanner per scelta animali
        int sceltaAnimale;
        String nomeAnimale;

        //il ciclo si ripete fin quando non si esce
        do {
            //Menu richiesta animali da registrare
            System.out.println("Quale animale vuoi registrare?");
            System.out.println("[1] Felino");
            System.out.println("[2] Canidi");
            System.out.println("[3] Anfibi");
            System.out.println("[4] Roditori");
            System.out.println("[5] Altro");
            System.out.println("[6] Esci");
            sceltaAnimale = sceltaAnim.nextInt();

            switch (sceltaAnimale) {
                case 1: // chiede nome felino e aggiunge tutto all'array
                    System.out.println("Inserisci il nome del felino");
                    nomeAnimale = nomeAnim.nextLine();
                    felini.addNome(nomeAnimale);
                    break;
                case 2: // chiede nome canide e aggiunge tutto all'array
                    System.out.println("Inserisci il nome del canide");
                    nomeAnimale = nomeAnim.nextLine();
                    canidi.addNome(nomeAnimale);
                    break;
                case 3: // chiede nome anfibio e aggiunge tutto all'array
                    System.out.println("Inserisci il nome dell'anfibio");
                    nomeAnimale = nomeAnim.nextLine();
                    anfibi.addNome(nomeAnimale);
                    break;
                case 4: // chiede nome roditore e aggiunge tutto all'array
                    System.out.println("Inserisci il nome del roditore");
                    nomeAnimale = nomeAnim.nextLine();
                    roditori.addNome(nomeAnimale);
                    break;
                case 5: // chiede nome altro animale e aggiunge tutto all'array
                    System.out.println("Inserisci il nome dell'animale senza categoria'");
                    nomeAnimale = nomeAnim.nextLine();
                    altro.addNome(nomeAnimale);
                    break;
                case 6: // Stampa arrivederci ed esce dalla registrazione
                    System.out.println("Arrivederci");
                    break;
                default: // Stampa opzione non valida
                    System.out.println("Opzione non valida");
                    break;
            }
        } while(sceltaAnimale != 6);
    }




}
