/*
 * Aggiungere la ricerca di un numero nella sequenza, quindi dare la scelta all'utente se stampare la sequenza oppure cercare il numero.
 */

import java.util.Scanner;

public class fibonacci2 {

    public static void main(String[] args) {

        Scanner lunghezzaSerie = new Scanner(System.in);
        Scanner menu = new Scanner(System.in);
        Scanner ricNumero = new Scanner(System.in);

        int numero1 = 0; // dichiarazione e inizializzazione variabile numero1
        int numero2 = 1;// dichiarazione e inizializzazione variabile numero2
        int numero = 0;// dichairazione e inizializzazione variabile numero
        boolean check = false;

        System.out.println("Cosa vuoi fare?");
        System.out.println("[1] Stampa serie completa");
        System.out.println("[2] Trova numero");
        int rispostaMenu = menu.nextInt();

        System.out.println("Quanto deve essere lunga la serie?");
        int nVolte = lunghezzaSerie.nextInt();


        if (rispostaMenu == 1) {
            
            
            for (int i = 0; i < nVolte; i++) { // ciclo for per ripetizione operazioni per ottenimento numeri di fibonacci

                numero = numero1 + numero2; // primo passaggio fibonacci
                numero1 = numero2; // secondo passaggio fibonacci
                numero2 = numero; // terzo passaggio fibonacci

                System.out.println(numero); // stampa numero

            }
        }else if(rispostaMenu == 2){

            System.out.println("Quale numero vuoi cercare?");
            int ricercaNumero = ricNumero.nextInt();

            for (int i = 0; i < nVolte; i++) { // ciclo for per ripetizione operazioni per ottenimento numeri di fibonacci

                numero = numero1 + numero2; // primo passaggio fibonacci
                numero1 = numero2; // secondo passaggio fibonacci
                numero2 = numero; // terzo passaggio fibonacci
                if(ricercaNumero == numero || ricercaNumero == 0){
                    System.out.println("Il tuo numero è presente"); // stampa numero
                    check = true;
                    break;
                }
            }
            if(check == false){
                System.out.println("Il tuo numero non è presente");
            }

        } else{
            System.out.println("OPERAZIONE NON VALIDA RIPROVA!");
        }

        lunghezzaSerie.close();
        menu.close();
        ricNumero.close();

    }

}