/*
 * Andate a creare una serie di valori int salvati su variabili 2/3 e fate si che
 * tramite un menu che da lo start conti fino all raggiungimento della variabile
 * (1.2.3.4.5.6). Far si che il valore da raggiungere sia preso in input.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner rispMenu = new Scanner(System.in);
        Scanner varScelta = new Scanner(System.in);
        Scanner nConta = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int c = 2;
        int variabileConta = 0;
        int rispostaMenu = 0;

        do{
            System.out.println("Cosa vuoi fare?\n[1] Contare\n[Altro] Nulla");
            rispostaMenu = rispMenu.nextInt();

            if(rispostaMenu == 1){
                System.out.println("Preferisci iniziare a contare da: 0, 1 o 2?");
                int variabileScelta = varScelta.nextInt();

                System.out.println("Quanto vuoi contare?");
                int numeroConta = nConta.nextInt();

                if(variabileScelta == a){
                    variabileConta = a;
                } else if(variabileScelta == b){
                    variabileConta = b;
                } else if(variabileScelta == c){
                    variabileConta = c;
                } else{
                    System.out.println("ERRORE");
                }
                for (int i = variabileConta; i < numeroConta+1; i++){
                    System.out.println(i);
                }
            }else{
                System.out.println("ARRIVEDERCI");
            }

        } while(rispostaMenu == 1);






    }

}
