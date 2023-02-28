/*
* Creare un sistema di inserimento che crei una classe utente di 3 diversi tipi, chef , chef capo, e magazziniere che
*  devono avere la stessa classe d'origine ovvero utente ma carrateristiche diverse in base ai parametri
* infatti chiamanda nomeutente.Cosasei deve dirci di che tipo è
*
* */
import java.util.Scanner;
public class Main {

    public static class Utente{

        public int tipoUtente;
        public String nomeUtente;
        private String password;
        boolean livello1;
        boolean livello2;
        boolean livello3;

        public void assegnaUtente(){

            if(livello1 == true){
                if(livello2 == true){
                    if(livello3 == true){
                        tipoUtente = 3;
                    } else{
                        tipoUtente = 2;
                    }
                }else{
                    tipoUtente = 1;
                }
            }
        }


    }







    public static void main(String[] args) {

        Utente utente = new Utente();

        int rispostaTipo = 0;

        Scanner nome = new Scanner(System.in);
        Scanner password = new Scanner(System.in);
        Scanner rispTipo = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome");
        utente.nomeUtente = nome.nextLine();

        System.out.println("Inserisci la tua password");
        utente.password = password.nextLine();

        System.out.println("Cosa vuoi essere?");
        System.out.println("[1]MAGAZZINIERE");
        System.out.println("[2]CHEF");
        System.out.println("[3]CAPO CHEF");
        rispostaTipo = rispTipo.nextInt();



        utente.assegnaUtente();

        System.out.println(utente.tipoUtente);





    }
}