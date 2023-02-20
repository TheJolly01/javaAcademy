import java.util.Scanner;                           //libreria scanner
import java.lang.Math;                              //libreria math
import java.lang.ProcessBuilder.Redirect.Type;      //non lo so lo ha aggiunto solo

public class esercizioTreOperazioni {                      //classe
    public static void main(String[] args){         //main

        

        Scanner sceltaRand = new Scanner(System.in);      //scanner sceltaRand
        Scanner scelta = new Scanner(System.in);          //scanner scelta
        Scanner primoNumero = new Scanner(System.in);       //scanner primo numero
        Scanner secondoNumero = new Scanner(System.in);     //scanner secondo numero

        System.out.println("Quale operazione vuoi eseguire?");      //output operazioni
        System.out.println("[1]Somma");                             //output 1
        System.out.println("[2]Sottrazione");                       //output 2
        System.out.println("[3]Somma radici quadrate");             //output 3
        System.out.println("[4]Sottrazione tra la radice più grande e la più piccola"); //output 4

        


        
        int operazioneScelta = scelta.nextInt();                //input operazione scelta

        System.out.println("Vuoi inserire i numeri o preferisci random?");  //output random o no
        System.out.println("[1]Inserisco io");                              //output 1
        System.out.println("[2]Random");                                    //output 2
        int sceltaRandom = sceltaRand.nextInt();                                //input operazione scelta
        double primoNumeroScelto = 0;                                           //inizializzazione variabile
        double secondoNumeroScelto = 0;                                         //inizializzazione variabile
    
        if(sceltaRandom == 1){                                                  //se la scelta è 1

            //inserisci i numeri

            System.out.println("Qual'è il primo numero che vuoi inserire?");    //output primo numero
            primoNumeroScelto = primoNumero.nextDouble();                           //input primo numero

            System.out.println("Qual'è il secondo numero che vuoi inserire?"); //output secondo numero
            secondoNumeroScelto = secondoNumero.nextDouble();                   //input secondo numero


        }
        else if(sceltaRandom == 2){                             //se la scelta è 2
            //crea numeri randomici
            primoNumeroScelto = Math.random()*1501;     //random primo numero
            secondoNumeroScelto = Math.random()*1501;   //random secondo numero
        }
        else{                       
            System.out.println("ERRORE");   // altrimenti dai errore
        }

        

        double risultato = 0;       //inizializzazione variabile
        double quadratoUno = 0;     //inizializzazione variabile
        double quadratoDue = 0;     //inizializzazione variabile

        switch(operazioneScelta){   //switch per operazioni scelte
            case 1:
                risultato = primoNumeroScelto + secondoNumeroScelto;
                System.out.println("Il risultato della tua somma è: " + risultato);     //risultato somma
                break;
            
            case 2:
                risultato = primoNumeroScelto - secondoNumeroScelto;    //sottrazione 
                System.out.println("Il risultato della tua sottrazione è: " + risultato);   //risultato sottrazione
                break;

            case 3:
                quadratoUno = Math.sqrt(primoNumeroScelto);         //radice primo numero
                quadratoDue = Math.sqrt(secondoNumeroScelto);       //radice secondo numero
                risultato = quadratoUno + quadratoDue;              //variabile somma radici
                System.out.println("Il risultato della tua somma tra radici quadrate è: " + risultato); //risultato somma di radici
                break;

            case 4:
                quadratoUno = Math.sqrt(primoNumeroScelto); //radice primo numero
                quadratoDue = Math.sqrt(secondoNumeroScelto);//radice secondo numero
                risultato = Math.max(quadratoUno, quadratoDue) - Math.min(quadratoUno, quadratoDue); //risultato sottrazione max meno min
                System.out.println("Il risultato della tua sottrazione tra radici quadrate è: " + risultato); //output risultato
                break;

            default:
            System.out.println("ERRORE");   //messaggio di errore
            break;
        }


        if(risultato >= 0){ //se positivo
            System.out.println("Il numero è positivo ed il suo valore assoluto è: " + Math.abs(risultato)); //output positivo e valore assoluto
        }
        else{   //se negativo
            System.out.println("Il numero è negativo ed il suo valore assoluto è: " + Math.abs(risultato)); //output negativo e valore assoluto
        }

        int risultatoIntero = (int) risultato;  //conversione risultato in int
        double risultatoDecimale = risultato - risultatoIntero; //parte decimale
        




        if((risultato - risultatoIntero) == 0 ){        //se decimale non presente
            System.out.println("Il numero è intero");  //il numero è intero
            if((risultato % 2) == 0){                    //se diviso due non c'è resto
                System.out.println("Il numero è pari"); //il numero è pari
            }
            else{                                          // altrimenti
                System.out.println("Il numero è dispari"); //il numero è dispari
            }

        }
        else{
            System.out.println("Il numero non è intero"); // altrimenti il numero non è intero

            System.out.println("Il numero senza virgola è :" + risultatoIntero + " mentre la parte decimale rimossa è " + risultatoDecimale );  //output numero senza virgola

        }

        scelta.close();
        sceltaRand.close();
        primoNumero.close();
        secondoNumero.close();
        

    }

    
    
}
