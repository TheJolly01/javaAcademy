/*
Creare un esercizio che gestisca un esercito

creiamo la classe Esercito con l'attributo numero soldati

a un figlio o inner class, che è soldato

ogni volta che creiamo un soldato salirà numero soldati e li dovremo tenere in memoria, con nome annodinascita e appratenzaaforze speciali (Bool)

Se forze speciali e true
bisognerà richiamare due metodi specifici gradiSpeciali, annoDiInizio
In una classe astratta detta ForzeSpeciali che avrà il metodo, oltre i due sopra, specializzazione che sarà un String inserita dal utente
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Esercito esercito = new Esercito();
    String risp = "";
    do{
        risp = Soldato.inputString("Vuoi inserire un soldato? s/n");
        if(risp.equals("s")) {
            String nome = Soldato.inputString("Inserisci il nome del soldato");
            int anno = Soldato.inputInt("Inserisci l'anno di nascita");
            boolean check = false;
            String appFSpeciali = Soldato.inputString("Il soldato è presente nelle forze speciali? s/n");
            if (appFSpeciali.equals("s")) {
                check = true;
            }
            Soldato soldato = new Soldato(nome, anno, check);
            esercito.soldati.add(soldato);
        }
    }while(risp.equals("n"));

    for(int i = 0; i > esercito.soldati.size(); i++){
        System.out.print(esercito.soldati.get(i).nome);
        System.out.print(esercito.soldati.get(i).annoDiNascita);
        System.out.print(esercito.soldati.get(i).appartForzeSpeciali);
        if(esercito.soldati.get(i).appartForzeSpeciali){
            System.out.print(esercito.soldati.get(i).specializzazione);
            System.out.print(esercito.soldati.get(i).annoDiInizio);
            System.out.print(esercito.soldati.get(i).gradiSpeciali);
        }
    }





    }
}