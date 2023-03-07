/*
* Definisci una classe "Veicolo" che contenga le seguenti proprietà:
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
*  e stampa le informazioni di ogni veicolo utilizzando i metodi getter.
*
* */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int risposta;
        do {
            risposta = inputInt("Vuoi comprare un auto?\n[1]SI\n[2]NO");
            if(risposta == 1) {
                Menu();
            }
            if(risposta > 2 || risposta < 1){
                System.out.println("Errore, riprova");
            }
        } while(risposta != 2);
    }

    public static void Menu(){

        Auto auto = null;
        Moto moto = null;

        int scelta = inputInt("Vuoi un auto o una moto?\n[1]Auto\n[2]Moto");
        if(scelta == 1){

            String marca = inputString("Che marca è la tua auto?");
            String modello = inputString("Che modello?");
            int annoFabbricazione = inputInt("Quando è stata fabbricata?");
            int numeroPorte= inputInt("Quante porte ha?");
            String tipoCarburante = inputString("Che carburante usa?");
            int consumoMedio = (int)(Math.random()*10);

            auto = new Auto(marca,modello,annoFabbricazione,numeroPorte,tipoCarburante,consumoMedio);

        }else if(scelta == 2){

            String marca = inputString("Che marca è la tua moto?");
            String modello = inputString("Che modello?");
            int annoFabbricazione = inputInt("Quando è stata fabbricata?");
            int cilindrata = inputInt("Quanto è la sua cilindrata?");
            String tipologia = inputString("Che tipo di moto è?");
            int potenza = (int) (cilindrata / 2.3);

            moto = new Moto(marca,modello,annoFabbricazione,cilindrata,tipologia,potenza);

        }else{
            System.out.println("Hai sbagliato");
        }

        if(scelta == 1){
            auto.stampaVeicolo(auto);
        }
        if(scelta == 2){
            moto.stampaVeicolo(moto);
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