import java.util.Scanner;                                                                     //importa classe Scanner

public class esempioControllori {
    public static void main (String[] args){

            Scanner scelta = new Scanner(System.in);                                          //oggetto scanner per cosa eseguire

            System.out.println("Quale operazione vuoi fare? (calcolatrice o calendario)");  //richiesta operazione
            String scDaEseguire = scelta.nextLine();                                           //inserimento operazione da fare

            if(scDaEseguire.equals("calcolatrice")){                                 //controlla se è calcoaltrice
                calcolatrice();
            }
            else if (scDaEseguire.equals("calendario")){                             //se non è calcolatrice controlla se è calendario

                Scanner giorno = new Scanner(System.in);                                      //oggetto scanner per cosa eseguire

                System.out.println("Che giorno (da 1 a 7)?");                               //richiesta operazione
                int giornoScelto = giorno.nextInt();                                          //inserimento operazione da fare

                calendario(giornoScelto);                                                     //invoca funzione calendario con il giorno come parametro
                giorno.close();                                                               //chiude Scanner giorno
            }
            else{                                                                             //se non è ne calendario ne calcolatrice
                System.out.println("ERRORE");                                              //stampa errore
            }

            scelta.close();                                                                  //chiude scanner scelta


    }

    static void calcolatrice(){     //funzione calcolatrice
        Scanner operazione = new Scanner(System.in);    //oggetto scanner per operazione da eseguire

            System.out.println("Quale operazione vuoi fare?");  //richiesta operazione
            String operDaEseguire = operazione.nextLine();    //inserimento operazione da fare


            if (operDaEseguire.equals("somma")){
                Scanner primoTermine = new Scanner(System.in);  //oggetto scanner per termine 1
                Scanner secondoTermine = new Scanner(System.in); //oggetto scanner per termine 2

                System.out.println("Qual'è il primo termine?");
                int termine1 = primoTermine.nextInt(); //primo termine da eseguire
                System.out.println("Qual'è il secondo termine?");
                int termine2 = secondoTermine.nextInt(); //secondo termine da eseguire

                System.out.println(termine1 + termine2);    // stampa somma termini

                primoTermine.close();   //chiude Scanner primoTermine
                secondoTermine.close(); //chiude Scanner secondoTermine
            }


            else if (operDaEseguire.equals("sottrazione")){
                Scanner primoTermine = new Scanner(System.in);  //oggetto scanner per termine 1
                Scanner secondoTermine = new Scanner(System.in); //oggetto scanner per termine 2

                System.out.println("Qual'è il primo termine?");
                int termine1 = primoTermine.nextInt(); //primo termine da eseguire
                System.out.println("Qual'è il secondo termine?");
                int termine2 = secondoTermine.nextInt(); //secondo termine da eseguire

                System.out.println(termine1 - termine2);    //stampa sottrazione termini

                primoTermine.close();   //chiude Scanner primoTermine
                secondoTermine.close(); //chiude Scanner secondoTermine
            }


            else if (operDaEseguire.equals("moltiplicazione")){
                
                Scanner primoTermine = new Scanner(System.in);  //oggetto scanner per termine 1
                Scanner secondoTermine = new Scanner(System.in); //oggetto scanner per termine 2

                System.out.println("Qual'è il primo termine?");
                int termine1 = primoTermine.nextInt(); //primo termine da eseguire
                System.out.println("Qual'è il secondo termine?");
                int termine2 = secondoTermine.nextInt(); //secondo termine da eseguire

                System.out.println(termine1 * termine2);    //stampa moltiplicazione termini

                primoTermine.close();   //chiude Scanner primoTermine
                secondoTermine.close(); //chiude Scanner secondoTermine
            }


            else if (operDaEseguire.equals("modulo")){
                Scanner primoTermine = new Scanner(System.in);  //oggetto scanner per termine 1
                Scanner secondoTermine = new Scanner(System.in); //oggetto scanner per termine 2

                System.out.println("Qual'è il primo termine?");
                int termine1 = primoTermine.nextInt(); //primo termine da eseguire
                System.out.println("Qual'è il secondo termine?");
                int termine2 = secondoTermine.nextInt(); //secondo termine da eseguire

                System.out.println(termine1 % termine2);    //stampa moltiplicazione termini

                primoTermine.close();   //chiude Scanner primoTermine
                secondoTermine.close(); //chiude Scanner secondoTermine
            }
            operazione.close(); //chiude Scanner secondoTermine
    }


    static void calendario(int day){        //funzione calendario

        switch(day){        //switch per i giorni
            case 1:         //case giorno 1
                System.out.println("Lunedì");   //stampa giorno
                break;
            case 2:          //case giorno 2
                System.out.println("Martedì");  //stampa giorno
                break;
            case 3:         //case giorno 3
                System.out.println("Mercoledì");    //stampa giorno
                break;
            case 4:         //case giorno 4
                System.out.println("Giovedì");  //stampa giorno
                break;
            case 5:         //case giorno 5
                System.out.println("Venerdì");  //stampa giorno
                break;
            case 6:         //case giorno 6
                System.out.println("Sabato");   //stampa giorno
                break;
            case 7:         //case giorno 7
                System.out.println("Domenica"); //stampa giorno
                break;
    }

    }
}
