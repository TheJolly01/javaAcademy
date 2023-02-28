import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Scanner numero = new Scanner(System.in);
        Scanner numero2 = new Scanner(System.in);
        Scanner stringa= new Scanner (System.in);

        System.out.println("Inserisci un numero da 1 a 10");
        int numeroInt = numero.nextInt();

        System.out.println("Inserisci la stringa che vuoi dividere");
        String stringaAdd = stringa.nextLine();

        numero.close();
        stringa.close();

        while (numeroInt != 0){
            if(numeroInt % 2 == 0){
                numeroInt/=2;
                System.out.println("Il numero è pari e diviso 2 fa: " + numeroInt);
            }
            else{
                numeroInt = numeroInt - (numeroInt%2);
                System.out.println("Il numero è dispari e, se ci sottraggo il suo modulo 2 diventa: " + numeroInt);
            }
        }
        System.out.println("Il tuo numero ormai è stato distrutto, ora è uno 0, sorry.");

        String[] nuovaStringa =stringaAdd.split("a");
        System.out.println("La tua stringa ora è: " + Arrays.toString(nuovaStringa));

        numero2.close();


    }
}


//Creare un ciclo che permette di scegliere un numero da 1 a 10 e che lo divide per 2 
//o modulo in base a se è pari o dispari