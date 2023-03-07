/*
Definisci una classe "Veicolo" che contenga le seguenti proprietà:
Marca
Modello
Anno di fabbricazione
Definisci una sottoclasse "Auto" che estenda la classe "Veicolo" e che contenga le seguenti proprietà:
Numero di porte
Tipo di carburante
Consumo medio di carburante per 100 km
Definisci una sottoclasse "Moto" che estenda la classe "Veicolo" e che contenga le seguenti proprietà:
Cilindrata
Tipologia (sportiva, stradale, etc.)
Potenza
Per ogni classe, definisci il costruttore e i metodi getter e setter per ogni proprietà.

Nella classe "Main", crea almeno due oggetti di tipo "Auto" e due oggetti di tipo "Moto" con valori a tua scelta per le proprietà,
e stampa le informazioni di ogni veicolo utilizzando i metodi getter.
*/


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int risposta;
        do {
            risposta = inputInt("Vuoi comprare un veicolo?\n[1]SI\n[2]NO");
            if(risposta == 1) {
                Menu.MenuPrincipale();
            }
            if(risposta > 2 || risposta < 1){
                System.out.println("Errore, riprova");
            }
        } while(risposta != 2);

        for(int i = 0; i < Menu.arrAuto.size(); i++){
            Menu.arrAuto.get(i).stampaVeicolo(Menu.arrAuto.get(i));
        }
        for(int i = 0; i < Menu.arrMoto.size(); i++){
            Menu.arrMoto.get(i).stampaVeicolo(Menu.arrMoto.get(i));
        }
    }

    public static int inputInt(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextInt();
    }
    public static String inputString(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextLine();
    }


}