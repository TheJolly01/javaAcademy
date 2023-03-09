import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static ArrayList<Piatto> piatti = new ArrayList<>();

    public static void creaPiatto(){

        ArrayList<String> ingPiatto1 = new ArrayList<>();
        ingPiatto1.add("Pomodoro");
        ingPiatto1.add("Pasta");

        ArrayList<String> ingPiatto2 = new ArrayList<>();
        ingPiatto2.add("Uova");
        ingPiatto2.add("Pecorino");
        ingPiatto2.add("Guanciale");
        ingPiatto2.add("Pasta");

        ArrayList<String> ingPiatto3 = new ArrayList<>();
        ingPiatto3.add("Pesto");
        ingPiatto3.add("Pasta");

        int prezPiatto1 = 5;
        int prezPiatto2 = 10;
        int prezPiatto3 = 7;

        String chefPiatto1 = "Mario";
        String chefPiatto2 = "Andrea";
        String chefPiatto3 = "Pablo";

        Piatto piatto1 = new Piatto(ingPiatto1,prezPiatto1,chefPiatto1);
        Piatto piatto2 = new Piatto(ingPiatto2,prezPiatto2,chefPiatto2);
        Piatto piatto3 = new Piatto(ingPiatto3,prezPiatto3,chefPiatto3);

        piatti.add(piatto1);
        piatti.add(piatto2);
        piatti.add(piatto3);
    }

    public static void ordinaPiatto(){
        int piattoDaOrdinare;
        int totaleGenerale = 0;
        creaPiatto();

        do {
            visualizzaPiatti();
            piattoDaOrdinare = inputInt("Quale piatto vuoi ordinare?\n[0]CHIUDI PROGRAMMA");
            if(piattoDaOrdinare > 0) {
                piatti.get(piattoDaOrdinare - 1).calcoloTotale();
            }
        } while(piattoDaOrdinare != 0);

        for(int i = 0; i < piatti.size(); i ++){
            totaleGenerale += piatti.get(i).getTotale();
        }
        System.out.println("Il tuo totale è di: " + totaleGenerale);

    }


    public static void visualizzaPiatti(){
        for(int i = 0; i < piatti.size(); i ++){
            int codice = i + 1;
            System.out.println("CODICE PIATTO: [" + codice + "]");
            System.out.print("Ingredienti: ");
            System.out.println(piatti.get(i).getIngredienti());
            System.out.print("Prezzo: ");
            System.out.println(piatti.get(i).getPrezzo());
            System.out.print("Chef: ");
            System.out.println(piatti.get(i).getChef());
            System.out.println("---------------------------------------------");
        }
    }

    public static int inputInt(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextInt();
    }



}
