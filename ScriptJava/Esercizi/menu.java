/*
 * Creare un menu che permetta di selezionare 3 tipi di piatto o uscire e che permetta per
 * ognuno di loro di visualizzare ingredienti (settati da voi perchè sono buono) prezzo e
 * disponibilità. Se si conferma di voler ordinare la disponibilità scenderà.
 * Ragionate prima di scrivere il codice su che tipi di blocco di dati vi servono
*/

import java.util.Scanner;       //libreria scanner

public class menu {
    public static void main(String[] args){

        int risposta = 0;           //variabile risposta menu
        int rispostaAcquisto = 0;   //variabile risposta per conferma acquisto
        int dispTonno = 20;         //variabile disponibilità pasta al tonno
        int dispCarbonara = 10;     //variabile disponibilità pasta alla carbonara
        int dispPanna = 8;          //variabile disponibilità pasta alla panna
        int piattiMangiati = 0;     //variabile piatti mangiati

        do{                                                 //tutto il menù che si ripeterà finchè non verrà detto esplicitamente di chiudere

            Scanner risp = new Scanner(System.in);      //scanner input risposta menu
            Scanner rispAcq = new Scanner(System.in);   //scanner input risposta conferma acquisto
            do{                                             
                System.out.println("*****MENU BARILLA*****");       //menu
                System.out.println("[1] Pasta al tonno");           //prima scelta
                System.out.println("[2] Pasta alla carbonara");     //seconda scelta
                System.out.println("[3] Pasta alla panna");         //terza scelta
                System.out.println("[4]CHIUDI");                    //scelta chiudi menu
                risposta = risp.nextInt();                             //input risposta
            } while (risposta > 4 || risposta < 1);                    //continua a dare il menù finchè non verrà messa una risposta valida

            if(risposta == 1){                                         //
                System.out.println("Hai scelto la pasta al tonno");
                System.out.println("INGREDIENTI:");
                System.out.println("Pasta");
                System.out.println("Tonno");
                System.out.println("PREZZO: 15€");
                System.out.println("DISPONIBILITA': " + dispTonno);
                do{
                    System.out.println("Vuoi acquistare questo piatto?");
                    System.out.println("[1] SI");
                    System.out.println("[2] NO");
                    rispostaAcquisto = rispAcq.nextInt();
                } while(rispostaAcquisto > 2 || rispostaAcquisto < 1);;
                if (rispostaAcquisto == 1){
                    dispTonno--;
                }
            } else if(risposta == 2){
                System.out.println("Hai scelto la pasta alla carbonara");
                System.out.println("INGREDIENTI:");
                System.out.println("Pasta");
                System.out.println("Uova");
                System.out.println("Guanciale");
                System.out.println("Pecorino");
                System.out.println("PREZZO: 35€");
                System.out.println("DISPONIBILITA': " + dispCarbonara);
                do{
                    System.out.println("Vuoi acquistare questo piatto?");
                    System.out.println("[1] SI");
                    System.out.println("[2] NO");
                    rispostaAcquisto = rispAcq.nextInt();
                } while(rispostaAcquisto > 2 || rispostaAcquisto < 1);;
                if (rispostaAcquisto == 1){
                    dispCarbonara--;
                }
            } else if(risposta == 3){
                System.out.println("Hai scelto la pasta al tonno");
                System.out.println("INGREDIENTI:");
                System.out.println("Pasta");
                System.out.println("Panna");
                System.out.println("Piselli");
                System.out.println("Pancetta");
                System.out.println("PREZZO: 25€");
                System.out.println("DISPONIBILITA': " + dispPanna);
                do{
                    System.out.println("Vuoi acquistare questo piatto?");
                    System.out.println("[1] SI");
                    System.out.println("[2] NO");
                    rispostaAcquisto = rispAcq.nextInt();
                } while(rispostaAcquisto > 2 || rispostaAcquisto < 1);;
                if (rispostaAcquisto == 1){
                    dispPanna--;
                }
            }

        } while(risposta != 4);

    }
    
}
