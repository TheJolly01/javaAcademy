
/*
 * CONSEGNA TEST DA SVOLGERE

    Creare un sistema di inserimento che assegni un valore temporaneo a nome utente e un credito che verrà randomizzato per ogni utente,
    fatto ciò stampate una lista di piatti e date tre scelte Ordina, visualizza modifica, esci.

    Ordina deve far ordinare uno degli elementi se il budget lo permette e tornare al menu di selezione, visualizza farà vedere la lista 
    panini, modifica farà:
    aggiungere, modificare ed eliminare un piatto dalla lista

    ogni piatto dovrà avere nome, ingredienti almeno due e prezzo dovremo tenere il conto di quanti utenti entrano nell'ristorante e di 
    quanto spendono totale

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class nuovoRistorante {
    public static void main(String[] args) {

        Scanner rispIngresso = new Scanner(System.in);
        Scanner username = new Scanner(System.in);
        Scanner menu = new Scanner(System.in);
        Scanner PaninoAdd = new Scanner(System.in);
        Scanner Ing1Add = new Scanner(System.in);
        Scanner Ing2Add = new Scanner(System.in);
        Scanner PrezzoAdd = new Scanner(System.in);
        Scanner PiattoDaMod = new Scanner(System.in);
        Scanner elemDaModificare = new Scanner(System.in);
        Scanner nomModif = new Scanner(System.in);
        Scanner ingr1Modif = new Scanner(System.in);
        Scanner ingr2Modif = new Scanner(System.in);
        Scanner prezModif = new Scanner(System.in);
        Scanner piatDaElim = new Scanner(System.in);

        String aggiungiPanino;
        String aggiungiIng1;
        String aggiungiIng2;
        int aggiungiPrezzo;

        ArrayList<String> datiUtenteList = new ArrayList<String>();
        ArrayList<Integer> spesaUtente = new ArrayList<Integer>();
        ArrayList<String> paniniList = new ArrayList<String>();
        ArrayList<String> ing1List = new ArrayList<String>();
        ArrayList<String> ing2List = new ArrayList<String>();
        ArrayList<Integer> prezzoList = new ArrayList<Integer>();

        String[] datiUtente = { " " };
        int[] soldiSpesi = { 0 };

        String[] panini = { "Panino al salame", "Panino alla mortadella", "Panino alla cotoletta" };
        String[] ingrediente1 = { "Pane", "Pane", "Pane" };
        String[] ingrediente2 = { "Salame", "Mortadella", "Cotoletta" };
        Integer[] prezzo = { 10, 12, 15 };
        int contaClienti = 0;
        int rispostaIngresso;
        String nomeUtente;
        int budget = 0;
        int spesi = 0;
        int rispostaMenu;
        int codiceOrdina;
        int rispOpzioniMod;
        int nPanini;
        int piattoDaModificare;
        int elementoDaModificare;
        String nomeModifica;
        String ingrediente1Modifica;
        String ingrediente2Modifica;
        int prezzoModifica;
        int piattoDaEliminare;

        // Dentro questo DO è contenuto il loop per gestire errori di inserimento
        // ingresso paninoteca
        do {
            System.out.println("Vuoi entrare dentro la paninoteca?");
            System.out.println("[1] SI");
            System.out.println("[2] NO");
            rispostaIngresso = rispIngresso.nextInt();
        } while (rispostaIngresso != 0 && rispostaIngresso != 1);

        if (rispostaIngresso == 1) {
            contaClienti++;

            System.out.println("Inserisci il tuo nome:");
            nomeUtente = username.nextLine();
            datiUtenteList = toArrListString(datiUtente, datiUtenteList);
            datiUtenteList.add(nomeUtente);

            budget = (int) (Math.random() * 201);

            do {
                System.out.println("Benvenuto nel menù principale");
                System.out.println("[1] ORDINA");
                System.out.println("[2] VISUALIZZA");
                System.out.println("[3] MODIFICA");
                System.out.println("[4] ESCI");
                rispostaMenu = menu.nextInt();

                switch (rispostaMenu) {
                    case 1:

                        codiceOrdina = ordinaPiatto(panini, ingrediente1, ingrediente2, prezzo, budget);
                        budget = budget - prezzo[codiceOrdina];

                        System.out.println("Prodotto acquistato");
                        spesi = spesi + prezzo[codiceOrdina];

                        break;

                    case 2:

                        visualizzaPiatti(panini, ingrediente1, ingrediente2, prezzo, budget);

                        break;

                    case 3:
                        do {
                            rispOpzioniMod = opzioniModifica();
                            if (rispOpzioniMod > 3) {
                                System.out.println("HAI SBAGLIATO, COMPLIMENTI");
                            }
                        } while (rispOpzioniMod > 3);
                        switch (rispOpzioniMod) {
                            case 1:
                                System.out.println("Inserisci nome panino:");
                                aggiungiPanino = PaninoAdd.nextLine();
                                paniniList.clear();
                                paniniList = toArrListString(panini, paniniList);
                                paniniList.add(aggiungiPanino);
                                panini = paniniList.toArray(panini);

                                System.out.println("Inserisci ingrediente 1 panino:");
                                aggiungiIng1 = Ing1Add.nextLine();
                                ing1List.clear();
                                ing1List = toArrListString(ingrediente1, ing1List);
                                ing1List.add(aggiungiIng1);
                                ingrediente1 = ing1List.toArray(ingrediente1);

                                System.out.println("Inserisci ingrediente 2 panino:");
                                aggiungiIng2 = Ing2Add.nextLine();
                                ing2List.clear();
                                ing2List = toArrListString(ingrediente2, ing2List);
                                ing2List.add(aggiungiIng2);
                                ingrediente2 = ing2List.toArray(ingrediente2);

                                System.out.println("Inserisci prezzo panino:");
                                aggiungiPrezzo = PrezzoAdd.nextInt();
                                prezzoList.clear();
                                prezzoList = toArrListInteger(prezzo, prezzoList);
                                prezzoList.add(aggiungiPrezzo);
                                prezzo = prezzoList.toArray(prezzo);

                                break;
                            case 2:

                                System.out.println("Quale piatto vuoi modificare?");
                                nPanini = panini.length;
                                for (int i = 0; i < nPanini; i++) {

                                    System.out.println("[" + i + "] " + panini[i]);
                                }
                                piattoDaModificare = PiattoDaMod.nextInt();

                                System.out.println("Cosa vuoi modificare del " + panini[piattoDaModificare] + "?");
                                System.out.println("[1] Nome");
                                System.out.println("[2] Ingrediente 1");
                                System.out.println("[3] Ingrediente 2");
                                System.out.println("[4] Prezzo");
                                elementoDaModificare = elemDaModificare.nextInt();

                                switch (elementoDaModificare) {
                                    case 1:

                                        System.out.println("Inserisci il nuovo nome");
                                        nomeModifica = nomModif.nextLine();

                                        panini[piattoDaModificare] = nomeModifica;

                                        break;
                                    case 2:

                                        System.out.println("Inserisci il nuovo ingrediente 1");
                                        ingrediente1Modifica = ingr1Modif.nextLine();
                                        ingrediente1[piattoDaModificare] = ingrediente1Modifica;

                                        break;
                                    case 3:

                                        System.out.println("Inserisci il nuovo ingrediente 2");
                                        ingrediente2Modifica = ingr2Modif.nextLine();
                                        ingrediente2[piattoDaModificare] = ingrediente2Modifica;

                                        break;
                                    case 4:

                                        System.out.println("Inserisci il nuovo prezzo");
                                        prezzoModifica = prezModif.nextInt();
                                        prezzo[piattoDaModificare] = prezzoModifica;

                                        break;
                                    default:
                                        System.out.println("HAI SBAGLIATOOOOO");
                                }

                                break;
                            case 3:
                                System.out.println("Quale piatto vuoi eliminare?");
                                nPanini = panini.length;
                                for (int i = 0; i < nPanini; i++) {
                                    System.out.println("[" + i + "] " + panini[i]);
                                }
                                piattoDaEliminare = piatDaElim.nextInt();

                                panini = removeRecordString(panini, paniniList, piattoDaEliminare); // MANCA IL METODO
                                                                                                    // PER POTER
                                                                                                    // RIMUOVERE L
                                                                                                    // ELEMENTO DALL
                                                                                                    // ARRAYLIST
                                ingrediente1 = removeRecordString(ingrediente1, ing1List, piattoDaEliminare);
                                ingrediente2 = removeRecordString(ingrediente2, ing2List, piattoDaEliminare);
                                prezzo = removeRecordInteger(prezzo, prezzoList, piattoDaEliminare);

                                System.out.println("Hai eliminato il tuo piatto con successo");

                                break;
                            default:
                                System.out.println("HAI SBAGLIATO, MI DISPIACE");
                                break;
                        }

                        break;

                    case 4:
                        soldiSpesi[contaClienti-1] = spesi;
                        break;

                    default:
                        System.out.println("HAI SBAGLIATO GENIO!");
                        break;
                }

            } while (rispostaMenu != 4);


        }

        System.out.println("Abbiamo avuto " + contaClienti + " clienti");

        for(int i = 0; i < contaClienti; i++){

            System.out.print(datiUtente[i] + "ha speso" + soldiSpesi[i]);

        }

        System.out.println("Grazie e arrivederci");

    }

    /*
     * Il metodo visualizzaPiatti serve solamente per la visualizzazione di tutti i
     * piatti
     */
    static void visualizzaPiatti(String[] panini, String[] ingredienti1, String[] ingredienti2, Integer[] prezzo,
            int budget) {

        int nPanini = panini.length;

        for (int i = 0; i < nPanini; i++) {

            System.out.println("----------Codice panino : " + i + "----------");
            System.out.println("Nome: " + panini[i]);
            System.out.println("Ingredienti: " + ingredienti1[i] + ", " + ingredienti2[i]);
            System.out.println("Prezzo: " + prezzo[i]);
            System.out.println("IL TUO BUDGET È DI: " + budget);
        }
    }

    /*
     * Il metodo ordinaPiatti serve per trovare il codice del panino che poi sarà
     * pagato
     */
    static int ordinaPiatto(String[] panini, String[] ingredienti1, String[] ingredienti2, Integer[] prezzo,
            int budget) {

        Scanner codAcq = new Scanner(System.in);
        int codiceAcquistato;

        int nPanini = panini.length;

        visualizzaPiatti(panini, ingredienti1, ingredienti2, prezzo, budget);
        do {
            System.out.println("Quale panino vuoi comprare?");
            codiceAcquistato = codAcq.nextInt();

            if (codiceAcquistato >= nPanini) {
                System.out.println("Hai sbagliato, riprova");
            }
        } while (codiceAcquistato >= nPanini);

        return codiceAcquistato;
    }

    static ArrayList<String> toArrListString(String[] arr, ArrayList<String> arrList) {

        int lunghezzaArray = arr.length;
        int i;
        String x;

        arrList.clear();

        for (i = 0; i < lunghezzaArray; i++) {

            x = arr[i];

            arrList.add(arr[i]);
        }
        return arrList;
    }

    static ArrayList<Integer> toArrListInt(int[] arr, ArrayList<Integer> arrList) {

        int lunghezzaArray = arr.length;
        int i;
        int x = 0;
        ;

        arrList.clear();

        for (i = 1; i < lunghezzaArray; i++) {

            x = arr[i];

            arrList.add(arr[i]);
        }
        return arrList;
    }

    static ArrayList<Integer> toArrListInteger(Integer[] arr, ArrayList<Integer> arrList) {

        int lunghezzaArray = arr.length;
        int i;
        int x = 0;
        ;

        arrList.clear();

        for (i = 1; i < lunghezzaArray; i++) {

            x = arr[i];

            arrList.add(arr[i]);
        }
        return arrList;
    }

    static int opzioniModifica() {

        Scanner risp = new Scanner(System.in);

        System.out.println("Cosa vuoi fare?");
        System.out.println("[1]AGGIUNGI");
        System.out.println("[2]MODIFICA");
        System.out.println("[3]RIMUOVI");
        int risposta = risp.nextInt();

        return risposta;

    }

    static String[] removeRecordString(String[] arr, ArrayList<String> arrList, int indiceRimuovi) {

        int nPanini = arr.length;
        for (int i = indiceRimuovi; i < nPanini; i++) {

            arr[i] = arr[i + 1];

        }
        arrList.clear();
        arrList = toArrListString(arr, arrList);
        arrList.remove(nPanini);
        arr = arrList.toArray(arr);

        return arr;
    }

    static Integer[] removeRecordInteger(Integer[] arr, ArrayList<Integer> arrList, int indiceRimuovi) {

        int nPanini = arr.length;
        for (int i = indiceRimuovi; i < nPanini; i++) {

            arr[i] = arr[i + 1];
        }
        arrList.clear();
        arrList = toArrListInteger(arr, arrList);
        arrList.remove(nPanini);
        arr = arrList.toArray(arr);

        return arr;
    }

}