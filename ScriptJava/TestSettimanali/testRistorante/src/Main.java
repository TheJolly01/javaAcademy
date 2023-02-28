/*
 * CONSEGNA TEST DA SVOLGERE
 * Andiamo a creare un primo menù che ci fa entrare o chiudere subito. ogni nuovo ingresso randomizzaremo un budget per il cliente e terremo contro dei clienti
 * e fine app stamperemo totale speso e nr clienti.
 * MENU : Andiamo a creare in menù con 4 scelte Compra, Vedi, Aggiugni, Esci.
 * COMPRA: farà vedere una lista di piatti che puoi comprare stampando, nome prezzo (int) e ingredienti (minimo 2) e darà la possibilità di comprarlo se il nostro budget
 * è sufficiente e la disponibilità qui non si vedrà.
 * VEDI: stamperà la lista piatti e le loro disponibilità. Una volta finito un piatto dovrà non essere più ordinabile.
 * AGGIUNGI: Se si conosce una password, si avranno due scelte, resetta disponibilità che mette tutte le disponibilità come all'inizio e aggiungi piatto.
 * Esci: ci riporta al primo menu e ci permetta di riniziare o terminare.
 */

/*
 * COMMENTO PERSONALE - ANTONIO DELRIO
 * Il programma funziona in tutto e per tutto ed è commentato in tutte le sue parti. Purtroppo presenta dei piccoli bug.
 *
 * 1. L'aggiungimento dei bug è limitato a 5 piatti in più, per prima ragione perchè sono gli solo 5 a poter essere inseriti
 *    e inserendone uno due volte non avrebbe molto senso, e in più perché anche se mettessi più posizioni nell'array non sarebbero
 *    mai infinite, quindi tantovale aggiungere lo stretto indispensabile per non allocare memoria inutilmente.
 *
 * 2. Non è stato chiudo lo Scanner presente nel metodo aggiungi, in quanto altrimenti il programma crasha, dato dal fatto che non è
 *    possibile sapere quando andrà effettivamente chiuso il suddetto scanner.
 *
 * Tengo a precisare che ho dovuto effettuare questo programma in questa maniera, non utilizzando delle variabili globali, e cercando di
 * sfruttare al 100% l'ottimizzazione del programma (entro i limiti della mia esperienza), quindi non mettendo alcuna variabile superflua,
 * non utilizzando troppi switch in quanto hanno una complessità computazionale leggermente maggiore, anche se irrilevante, e facendo in modo,
 * nel limite del possibile, di creare un programma difficile da "fregare" inserendo valori non validi ecc.
 *
 * Sicuramente sono presenti altri bug a me sconosciuti!
 * */

import java.util.Scanner;   //libreria Scanner utilizzata per l'input dell'utente
import java.lang.Math;      //libreria math utilizzata per la funzione random del budget

public class Main {
    public static void main(String[] args) {
        /*Lista creazione di tutti gli Scanner presenti
         * all'interno del main*/
        Scanner rispMenu = new Scanner(System.in);          //creazione scanner per la risposta al menu iniziale
        Scanner rispMenu2 = new Scanner(System.in);         //creazione scanner per la risposta al menu secondario
        Scanner rispAcq = new Scanner(System.in);           //creazione scanner per la risposta durante l'acquisto di un piatto
        Scanner richiestapw = new Scanner(System.in);       //creazione scanner per la risposta della password durante l'aggiunta
        Scanner richiestAggiungi = new Scanner(System.in);  //creazione scanner per la risposta al menu dell'aggiunta di un piatto

        String[] nomePiatto = {"Pasta alla panna", "Pasta al tonno", "Pasta al sugo","","","","",""};   //Array contenente i nomi dei piatti
        String[] ingredientePiatto = {"Pasta", "Pasta", "Pasta","","","","",""};                        //Array contenente il primo ingrediente dei piatti
        String[] ingredientePiatto2 = {"Panna", "Tonno", "Sugo","","","","",""};                        //Array contenente il secondo ingrediente dei piatti

        String passwordImpostata = "root";                                                              //Password per accedere ad aggiungi
        String richiestaPassword;                                                                       //Variabile da inserire per verificare la password

        int[] prezzoPiatto = {10, 15, 20, 0, 0, 0, 0 ,0};               //Array contenente il prezzo dei piatti
        int[] disponibilitaPiatto = {10, 20, 30, 0, 0, 0, 0, 0};        //Array contenente la disponibilità dei piattisi modificherà per ogni acquisto
        int[] disponibilitaIniziale = {10, 20, 30, 0, 0, 0, 0, 0};      //Array contenente la disponibilità iniziale dei piatti, utilizzata per il reset della disponibilitaPiatti

        int totClienti = 0;         //variabile utilizzata per la conta dei clienti che entrano nel locale
        int nPiatti = 3;            //variabile utilizzata per il numero di piatti diversi presenti nel menù
        int richiestaAggiungi;      //variabile utilizzata per input in risposta al menù aggiungi
        int piattoDaAggiungere;     //variabile utilizzata per input in risposta al menu piatto da aggiungeree
        int rispostaMenu2;          //variabile utilizzata per input in risposta al primo menù (Ingresso o uscita)
        int rispostaMenu;           //variabile utilizzata per input in risposta al secondo menù (compra-aggiungi-vedi-esci)
        int rispAcquista;           //variabile utilizzata per input in risposta al menù compra
        int budget;                 //variabile utilizzata per il contenimento di budget di ogni cliente
        int i;                      //variabile utilizzata per conteggio elementi array

        /*questo do viene utilizzato per controllare la risposta per l'ingresso nel locale, si chiude solo se la risposta
         corrisponde a 2 e quindi si desidera uscire dal locale*/
        do {
            /*questo do viene utilizzato per controllare la risposta per l'ingresso del locale, ma a differenza di quello prima
             * questo serve solamente per verificare che non si inserisca un numero diverso da 1 e 2*/
            do {
                System.out.println("VUOI ENTRARE NEL LOCALE?");     //output richiesta ingresso nel locale
                System.out.println("[1] SI");                       //output prima risposta
                System.out.println("[2] NO");                       //output seconda risposta
                rispostaMenu = rispMenu.nextInt();                  //input risposta
            }
            while (rispostaMenu > 2 || rispostaMenu < 1);           //continua ad aprire il menù finche la risposta è diversa da 1 e da 2

            /*Questo if fa in modo che se la risposta al primo menù sia quella di uscire dal localem allora si salti tutto il pezzo del
             * codice dedicato al secondo menù*/
            if (rispostaMenu == 1) {                         //se la risposta al primo menù è uno allora fai:
                budget = (int) (Math.random() * 101);        //imposta budget per il cliente di massimo 100 euro
                totClienti++;                                //aumenta il conteggio dei clienti entrati nel locale

                /*Questo do serve a riaprire il menù dopo ogni operazione salvo che non si scelga di uscire*/
                do {
                    System.out.println("COSA VUOI FARE?");  //output richiesta selezione azione primo menù
                    System.out.println("[1] COMPRA");       //output prima opzione - compra
                    System.out.println("[2] AGGIUNGI");     //output seconda opzione - aggiungi
                    System.out.println("[3] VEDI");         //output terza opzione - vedi
                    System.out.println("[4] ESCI");         //output quarta opzione - esci
                    rispostaMenu2 = rispMenu2.nextInt();    //input risposta secondo menù

                    /*Questo switch viene utilizzato per far capire al programma come agire in base all'opzione scelta dall'utente*/
                    switch (rispostaMenu2) { //switch condizionato dalla risposta al secondo menù

                        case 1:     //il case 1 serve per gestire l'opzione compra

                            System.out.println("----MENU COMPRA----");     //output nome menù

                            /*Questo for fa si che venga ripetuta la stessa operazione per ogni piatto presente nell'array*/
                            for (i = 0; i < nPiatti; i++) {                                                 //ripeti il ciclo 1 volta per ogni piatto presente nel locale
                                System.out.println("----[" + i + "]----");                                      //stampa codice piatto
                                menuPiatto(nomePiatto, prezzoPiatto, ingredientePiatto, ingredientePiatto2, i); //funzione per la visualizzazione del menù
                            }

                            System.out.println("Quale piatto vuoi acquistare?");                                //output rihiesta piatto da acquistare
                            rispAcquista = rispAcq.nextInt();                                                   //input risposta acquisto piatto
                            disponibilitaPiatto[rispAcquista] = compra(prezzoPiatto, rispAcquista, budget, nPiatti, disponibilitaPiatto, rispAcquista);     //funzione per acquistare piatto
                            break;                                                                              //chiudi case

                        case 2:     //il case 2 serve per gestire l'opzione aggiungi
                            System.out.println("----MENU AGGIUNGI----");        //output nome menù
                            System.out.println("Inserisci la password: ");      //output richiesta inserimento password
                            richiestaPassword = richiestapw.nextLine();         //input password inserita dall'utente

                            /*Questa if viene utilizzata per il controllo della password, infatti solamente
                             * se viene inserita la password corretta (root) allora il sistema farà eseguire le modifiche al menù*/
                            if (richiestaPassword.equals(passwordImpostata)) {  //confronto password con la password del sistema

                                /*Questo do fa in modo che non si inseriscano risposte non presenti nel menu*/
                                do {
                                    System.out.println("Cosa vuoi modificare?");                  //output richiesta modifica
                                    System.out.println("[1] Ripristina disponibilità");           //output opzione 1 - ripristino disponibilità
                                    System.out.println("[2] Aggiungi piatto");                    //output opzione 2 - aggiungi piatto
                                    richiestaAggiungi = richiestAggiungi.nextInt();               //input risposta menù modifica
                                } while (richiestaAggiungi < 1 || richiestaAggiungi > 2);         //continua il do se l'opzione è diversa da 1 e 2

                                /*Questa if serve per far eseguire solamente le opzioni di ripristino disponibilità nel caso
                                 * che venga scelta questa opzione, altrimenti esegue l'opzione aggiungi piatto*/
                                if (richiestaAggiungi == 1) {

                                    /*Questo for permette di effettuare l'operazione su tutti i piatti presenti sul menù*/
                                    for (i = 0; i < nPiatti; i++) {                         //ripeti l'operazione per ogni piatto
                                        disponibilitaPiatto[i] = disponibilitaIniziale[i];  //ripristina disponibilità sostituendola con quella iniziale
                                    }
                                } else {
                                    piattoDaAggiungere = aggiungi();    //assegna il numero del piatto da aggiungere che viene trovato grazie alla funzione aggiungi
                                    nPiatti= nPiatti + 1;               //aggiungi, al numero dei piatti disponibili nel locale, un piatto in più

                                    /*Questo switch fa si che in base al piatto scelto, questo venga aggiunto sostituiendo i valori del piatto
                                     * ai valori (vuoti) presenti nei reciproci array*/
                                    switch (piattoDaAggiungere) {         //seleziona opzione in base al numero del piatto da aggiungere
                                        case 1 :                          //se viene aggiunto il piatto n° 1

                                            nomePiatto[nPiatti-1] = "Gamberetti al tonno";  //riassegna nome piatto
                                            prezzoPiatto[nPiatti-1] = 40;                   //riassegna prezzo piatto
                                            ingredientePiatto[nPiatti-1] = "Gamberetti";    //riassegna ingrediente piatto
                                            ingredientePiatto2[nPiatti-1] = "Tonno";        //riassegna ingrediente piatto
                                            disponibilitaPiatto[nPiatti-1] = 10;            //riassegna disponibilità piatto
                                            disponibilitaIniziale[nPiatti-1] = 10;          //riassegna disponibilità iniziale piatto
                                            break;                                          //chiudi case

                                        case 2 :

                                            nomePiatto[nPiatti-1] = "Panino di carne";  //riassegna nome piatto
                                            prezzoPiatto[nPiatti-1] = 10;               //riassegna prezzo piatto
                                            ingredientePiatto[nPiatti-1] = "Pane";      //riassegna ingrediente piatto
                                            ingredientePiatto2[nPiatti-1] = "Carne";    //riassegna ingrediente piatto
                                            disponibilitaPiatto[nPiatti-1] = 40;        //riassegna disponibilità piatto
                                            disponibilitaIniziale[nPiatti-1] = 40;      //riassegna disponibilità iniziale piatto
                                            break;                                      //chiudi case

                                        case 3 :

                                            nomePiatto[nPiatti-1] = "Panino vegano";    //riassegna nome piatto
                                            prezzoPiatto[nPiatti-1] = 20;               //riassegna prezzo piatto
                                            ingredientePiatto[nPiatti-1] = "Pane";      //riassegna ingrediente piatto
                                            ingredientePiatto2[nPiatti-1] = "Insalata"; //riassegna ingrediente piatto
                                            disponibilitaPiatto[nPiatti-1] = 30;        //riassegna disponibilità piatto
                                            disponibilitaIniziale[nPiatti-1] = 30;      //riassegna disponibilità iniziale piatto
                                            break;                                      //chiudi case

                                        case 4 :

                                            nomePiatto[nPiatti-1] = "Secondo di manzo";     //riassegna nome piatto
                                            prezzoPiatto[nPiatti-1] = 17;                   //riassegna prezzo piatto
                                            ingredientePiatto[nPiatti-1] = "Carne di manzo";//riassegna ingrediente piatto
                                            ingredientePiatto2[nPiatti-1] = "Insalata";     //riassegna ingrediente piatto
                                            disponibilitaPiatto[nPiatti-1] = 30;            //riassegna disponibilità piatto
                                            disponibilitaIniziale[nPiatti-1] = 30;          //riassegna disponibilità iniziale piatto
                                            break;                                          //chiudi case

                                        case 5 :

                                            nomePiatto[nPiatti-1] = "Secondo di pesce"; //riassegna nome piatto
                                            prezzoPiatto[nPiatti-1] = 27;               //riassegna prezzo piatto
                                            ingredientePiatto[nPiatti-1] = "Pesce";     //riassegna ingrediente piatto
                                            ingredientePiatto2[nPiatti-1] = "Patate";   //riassegna ingrediente piatto
                                            disponibilitaPiatto[nPiatti-1] = 14;        //riassegna disponibilità piatto
                                            disponibilitaIniziale[nPiatti-1] = 14;      //riassegna disponibilità iniziale piatto
                                            break;                                      //chiudi case
                                    }
                                }
                            } else {    //altrimenti
                                System.out.println("PASSWORD ERRATA");  //output errore inserimento password
                            }

                            break;     //chiudi switch acquista

                        case 3:        //il case 3 serve per gestire l'opzione vedi
                            System.out.println("----MENU VEDI----");    //output nome menù
                            vedi(nomePiatto, prezzoPiatto, ingredientePiatto, ingredientePiatto2, nPiatti, disponibilitaPiatto);    //funzione vedi

                            break;     //chiudi case vedi

                        case 4:      //il case 4 serve per gestire l'opzione esci
                            System.out.println("Stai uscendo dal locale. Arrivederci e grazie!"); //output messaggio uscita dal locale
                            break;     // chiudi case esci

                        default:    //messaggio default
                            System.out.println("RISPOSTA NON VALIDA");  //output risposta non valida
                            break;  //chiudi case default


                    }
                } while(rispostaMenu2 != 4);    //continua ad eseguire il menù a meno che non venga scelta l'opzione di chiuderlo


            }

        } while(rispostaMenu != 2);             //continua ad eseguire il menù iniziale a meno che non venga scelta l'opzione di chiuderlo

        System.out.println("In totale oggi abbiamo avuto: " + totClienti + " clienti");     //output numero clienti

        rispMenu.close();           //chiusura scanner rispMenu
        rispMenu2.close();          //chiusura scanner rispMenu2
        rispAcq.close();            //chiusura scanner rispAcq
        richiestapw.close();        //chiusura scanner richiestapw
        richiestAggiungi.close();   //chiusura scanner richeistAggiungi
    }



    /*Il metodo menuPiatto, non restituisce nulla, ma, una volta che gli vengono passati i dati dal main, visualizza
    il menù completo di tutti i piatti, disponibilità esclusa*/
    static void menuPiatto(String[] nomePiatto, int[] prezzoPiatto, String[] ingredientePiatto, String[] ingredientePiatto2, int i){
        System.out.println("Il piatto è:" + nomePiatto[i]);                                 //output nome piatto
        System.out.println("Il prezzo del piatto è: " + prezzoPiatto[i] + " euro");         //output prezzo piatto
        System.out.println("Il primo ingrediente del piatto è " + ingredientePiatto[i]);    //output ingrediente 1
        System.out.println("Il secondo ingrediente del piatto è " + ingredientePiatto2[i]); //output ingrediente 2
    }

    /*Il metodo compra esegue una serie di operazioni atte a capire se l'acquisto è andato a buon fine e diminuire la disponibilità del piatto
     * acquistato. Restituisce appunto la disponibilità del piatto acquistato diminuita di 1*/
    static int compra(int[] prezzoPiatto, int i, int budget, int nPiatti, int[] disponibilitaPiatto, int rispAcquista){

        if(rispAcquista < nPiatti) {             //se la risposta è presente tra i piatti disponibili
            if (budget > prezzoPiatto[i]) {       //se il piatto costa meno dei soldi disponibili
                if (disponibilitaPiatto[i] > 0) {   //se il piatto è ancora disponibile
                    System.out.println("Hai acqistato il prodotto"); //output acquisto riuscito
                    disponibilitaPiatto[i]--;                        // diminuisce la disponibilità del piatto di 1
                } else {                                             //se non c'è disponibilità
                    System.out.println("Acquisto fallito, non c'è abbastanza disponibilità!"); //output acquisto fallito
                }
            } else {                                                 //se il budget è minore del prezzo del piatto
                System.out.println("Acquisto fallito, non hai abbastanza soldi!");  //output acquisto fallito
            }
        } else{                                                      //se la risposta non è tra le risposte consentite
            System.out.println("Hai inserito un valore non valido, riprova!");  //output acquisto fallito
        }
        return disponibilitaPiatto[i];                               //restituisci la disponibilità dei piatti
    }

    /*Il metodo vedi permette di visualizzare, oltre che nome, prezzo e ingredienti del menù, anche la disponibilità dei piatti*/
    static void vedi(String[] nomePiatto, int[] prezzoPiatto, String[] ingredientePiatto, String[] ingredientePiatto2, int nPiatti, int[] disponibilitaPiatto){

        for(int i=0; i<nPiatti; i++){               //Questo for serve per scorrere tutti i piatti del menù
            System.out.println("----" + i + "----");//output codice piatto
            menuPiatto(nomePiatto, prezzoPiatto, ingredientePiatto, ingredientePiatto2, i); //funzione menuPiatto utilizzata per vedere nome, prezzo e ingredienti di ciascun piatto
            System.out.println("Disponibilità piatto: " + disponibilitaPiatto[i]);          //output disponibilità piatto
        }

    }

    /*Il metodo aggiungi viene utilizzato per l'output di tutti i vari piatti che è possibile aggiungere*/
    static int aggiungi(){
        Scanner richiestPiat = new Scanner(System.in);      //creazione scanner per risposta piatto da aggiungere
        int richiestaPiatto;                                //variabile utilizzata per immagazzinare la risposta alla richiesta del piatto da aggiungere

        /*Questo do viene ripetutto fintanto che non si sceglie un opzione valida*/
        do{
            System.out.println("Cosa vuoi inserire?");      //output richiesta inserimento
            System.out.println("[1] Gamberetti al tonno");  //output opzione 1 - gamberetti al tonno
            System.out.println("[2] Panino di carne");      //output opzione 2 - panino di carne
            System.out.println("[3] Panino vegano");        //output opzione 3 - panino vegano
            System.out.println("[4] Secondo di manzo");     //output opzione 4 - secondo di manzo
            System.out.println("[5] Secondo di pesce");     //output opzione 5 - secondo di pesce
            richiestaPiatto = richiestPiat.nextInt();       //input piatto da inserire

            if(richiestaPiatto > 5 || richiestaPiatto < 0){ //se la richiesta del piatto non è tra le opzioni
                System.out.println("Hai inserito un valore non valido, riprova!");  //output errore
            }
        } while(richiestaPiatto > 5 || richiestaPiatto < 0); //chiudi ciclo do while solo quando la risposta è valida

        //richiestPiat.close();    !!!!!----- Questo è l'unico scanner a non essere chiuso in quanto altrimenti non si potrebbe ripetere la funzione -----!!!!!

        return richiestaPiatto; //restituisce il numero del piatto scelto, in modo che possa essere inserito nell'array
    }
}