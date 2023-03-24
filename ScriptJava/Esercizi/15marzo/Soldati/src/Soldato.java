import java.util.Scanner;

public class Soldato extends ForzeSpeciali{

    String nome;
    int annoDiNascita;
    boolean appartForzeSpeciali;
    String specializzazione;
    int annoDiInizio;
    int gradiSpeciali;

public Soldato(String nome, int annoDiNascita, boolean appartForzeSpeciali){

    this.nome = nome;
    this.annoDiNascita = annoDiNascita;
    this.appartForzeSpeciali = appartForzeSpeciali;
    numeroSoldati++;
    if(appartForzeSpeciali){
        specializzazione();
        annoDiInizio();
        gradiSpeciali();
    }
}
    public void specializzazione(){
        specializzazione = inputString("Qual'è la specializzazione del soldato?");
    }

    public void annoDiInizio(){
        annoDiInizio = inputInt("Quando ha iniziato il servizio da forza speciale?");
    }

    public void gradiSpeciali(){
        gradiSpeciali = inputInt("Quanti gradi speciali ha il soldato?");
    }


    public static String inputString(String stringa){
        Scanner scanner = new Scanner(System.in);
        System.out.println(stringa);
        return scanner.nextLine();
    }

    public static int inputInt(String stringa){
        Scanner scanner = new Scanner(System.in);
        System.out.println(stringa);
        return scanner.nextInt();
    }



}
