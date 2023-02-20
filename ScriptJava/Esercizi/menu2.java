/*
 * Creare un menu che permetta di selezionare 3 tipi di piatto o uscire e che permetta per
 * ognuno di loro di visualizzare ingredienti (settati da voi perchè sono buono) prezzo e
 * disponibilità. Se si conferma di voler ordinare la disponibilità scenderà.
 * Ragionate prima di scrivere il codice su che tipi di blocco di dati vi servono
*/

import java.util.Scanner;       //libreria scanner
import java.lang.Math;          //importo classe Math dalla libreria

public class menu2 {
    public static void main(String[] args){

        int risposta = 0;           //variabile risposta menu
        int rispostaAcquisto = 0;   //variabile risposta per conferma acquisto
        int dispTonno = 20;         //variabile disponibilità pasta al tonno
        int dispCarbonara = 10;     //variabile disponibilità pasta alla carbonara
        int dispPanna = 8;          //variabile disponibilità pasta alla panna
        int prezzoTonno = 15;       //variabile prezzo del tonno
        int prezzoCarbonara = 35;   //variabile prezzo carbonara
        int prezzoPanna = 25;       //variabile prezzo panna
        int piattiMangiati = 0;     //variabile piatti mangiati
        int budgetRandom = (int)(Math.random()*101);

        Scanner risp = new Scanner(System.in);      //scanner input risposta menu
            Scanner rispAcq = new Scanner(System.in);   //scanner input risposta conferma acquisto
        do{                                                 //tutto il menù che si ripeterà finchè non verrà detto esplicitamente di chiudere

            
            do{                                             
                System.out.println("*****MENU BARILLA*****");       //menu
                System.out.println("[1] Pasta al tonno");           //prima scelta
                System.out.println("[2] Pasta alla carbonara");     //seconda scelta
                System.out.println("[3] Pasta alla panna");         //terza scelta
                System.out.println("[4] Saldo borsellino");         //scelta saldo borsellino
                System.out.println("[5] Piatti mangiati");           //Scelta piatti mangiati
                System.out.println("[6]CHIUDI");                    //scelta chiudi menu
                risposta = risp.nextInt();                             //input risposta
            } while (risposta > 6 || risposta < 1);                    //continua a dare il menù finchè non verrà messa una risposta valida

            if(risposta == 1){                                         //Se scelta pasta al tonno
                System.out.println("Hai scelto la pasta al tonno"); //Output scelta
                System.out.println("INGREDIENTI:");                 //ingredienti
                System.out.println("Pasta");                        //ingrediente 1
                System.out.println("Tonno");                        //ingrediente 2
                System.out.println("PREZZO: " + prezzoTonno + "€");   //prezzo del piatto
                System.out.println("DISPONIBILITA': " + dispTonno);   //disponibilità piatti
                do{
                    System.out.println("Vuoi acquistare questo piatto?");   //richiesta conferma acquisto piatto
                    System.out.println("[1] SI");                           //risposta affermativa
                    System.out.println("[2] NO");                           //risposta negativa
                    rispostaAcquisto = rispAcq.nextInt();                      //input utente risposta
                } while(rispostaAcquisto > 2 || rispostaAcquisto < 1);;        //finchè la risposta non è compresa tra quelle disponibili
                if (rispostaAcquisto == 1 && prezzoTonno < budgetRandom){      //se la risposta è affermativa e hai soldi abbastanza
                    dispTonno--;                                                //diminuisci disponibilità tonno
                    piattiMangiati++;                                           //aumenta piatti mangiati
                    budgetRandom =- prezzoTonno;                                //scala soldi dal budget
                }
                if(prezzoTonno > budgetRandom){                                 //se il prezzo è maggiore del budget
                    System.out.println("NON HAI ABBASTANZA SOLDI");           //stampa che non hai abbastanza soldi
                }


            } else if(risposta == 2){                                           //risposta 2
                System.out.println("Hai scelto la pasta alla carbonara");     //output scelta
                System.out.println("INGREDIENTI:");                           //lista ingredienti
                System.out.println("Pasta");                                  //ingrediente 1
                System.out.println("Uova");                                   //ingrediente 2
                System.out.println("Guanciale");                              //ingrediente 3
                System.out.println("Pecorino");                               //ingrediente 3
                System.out.println("PREZZO: " + prezzoCarbonara +"€");           //prezzo carbonara
                System.out.println("DISPONIBILITA': " + dispCarbonara);          //disponibilità carbonara
                do{
                    System.out.println("Vuoi acquistare questo piatto?");      //richiesta conferma acquisto
                    System.out.println("[1] SI");                              //risposta affermativa
                    System.out.println("[2] NO");                               //risposta negativa
                    rispostaAcquisto = rispAcq.nextInt();
                } while(rispostaAcquisto > 2 || rispostaAcquisto < 1);;
                if (rispostaAcquisto == 1 && prezzoCarbonara < budgetRandom){
                    dispCarbonara--;
                    piattiMangiati++;
                    budgetRandom =- prezzoCarbonara;
                }
                if(prezzoCarbonara > budgetRandom){
                    System.out.println("NON HAI ABBASTANZA SOLDI");
                }
            } else if(risposta == 3){
                System.out.println("Hai scelto la pasta al tonno");
                System.out.println("INGREDIENTI:");
                System.out.println("Pasta");
                System.out.println("Panna");
                System.out.println("Piselli");
                System.out.println("Pancetta");
                System.out.println("PREZZO: " + prezzoPanna +"€");
                System.out.println("DISPONIBILITA': " + dispPanna);
                do{
                    System.out.println("Vuoi acquistare questo piatto?");
                    System.out.println("[1] SI");
                    System.out.println("[2] NO");
                    rispostaAcquisto = rispAcq.nextInt();
                } while(rispostaAcquisto > 2 || rispostaAcquisto < 1);;
                if (rispostaAcquisto == 1 && prezzoPanna < budgetRandom){
                    dispPanna--;
                    piattiMangiati++;
                    budgetRandom =- prezzoPanna;
                }
                if(prezzoPanna > budgetRandom){
                    System.out.println("NON HAI ABBASTANZA SOLDI");
                }
            } else if(risposta == 4){
                System.out.println("Il tuo saldo disponibile è di: " + budgetRandom +"€");
            } else if(risposta == 5){
                System.out.println("Hai mangiato:" + piattiMangiati +" piatti");
            }


        } while(risposta != 6);

        risp.close();
        rispAcq.close();

    }
    
}