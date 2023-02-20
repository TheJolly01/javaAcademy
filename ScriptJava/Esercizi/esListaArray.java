/*
 * Creare un array numeri e un array stringhe. Far si che tramite un menu si possa scegliere prima quali visualizzare e
 * poi a quale aggiungere un elemento per poi tornare al menu inziale
 * 
 */

import java.util.Scanner;    
import java.util.ArrayList;
import java.util.Arrays;

public class esListaArray {
    public static void main(String[] args){

        Scanner firstMenu = new Scanner(System.in);
        Scanner secondMenu = new Scanner(System.in);
        Scanner thirdMenu = new Scanner(System.in);
        Scanner wordAdd = new Scanner(System.in);
        Scanner numbAdd = new Scanner(System.in);

        String[] parole = {"Ciao" , "Tabacco", "Pueblo", "Minecraft"};
        Integer[] numeri = {1, 2, 3, 4, 5};
        int primoMenu = 0;
        do{
        System.out.println("-------MENU-------");
        System.out.println("[1] VISUALIZZA");
        System.out.println("[2] AGGIUNGI");
        System.out.println("[3] ESCI");
        primoMenu = firstMenu.nextInt();

        if(primoMenu == 1){
            System.out.println("Quale array vuoi visualizzare?");
            System.out.println("[1] STRINGA");
            System.out.println("[2] NUMERO");
            int secondoMenu = secondMenu.nextInt();

            if(secondoMenu == 1){
                System.out.println("Array di stringhe: " + Arrays.toString(parole));
            }
            else if(secondoMenu == 2){
                System.out.println("Array di parole: " + Arrays.toString(numeri));
            } else {
                System.out.println("ERRORE!");
            }
        }else if(primoMenu==2){

            System.out.println("In quale array vuoi aggiungere degli elementi?");
            System.out.println("[1] STRINGA");
            System.out.println("[2] NUMERO");
            int terzoMenu = thirdMenu.nextInt();

            if(terzoMenu == 1){

                ArrayList<String> arrayListParole = new ArrayList<String>(Arrays.asList(parole));

                System.out.println("Inserisci la parola da aggiungere: ");
                String aggiungiParola = wordAdd.nextLine();
                arrayListParole.add(aggiungiParola);
                parole = arrayListParole.toArray(parole);

            }else if(terzoMenu == 2){

                ArrayList<Integer> arrayListNumeri = new ArrayList<Integer>(Arrays.asList(numeri));

                System.out.println("Inserisci il numero da aggiungere: ");
                int aggiungiNumero = numbAdd.nextInt();
                arrayListNumeri.add(aggiungiNumero);
                numeri = arrayListNumeri.toArray(numeri);
            }else{
                System.out.println("ERRORE!");
            }


        }



        }while(primoMenu != 3 );
        System.out.println("ADDIO!");
        firstMenu.close();
        secondMenu.close();
        thirdMenu.close();
        wordAdd.close();
        numbAdd.close();

    }


}
