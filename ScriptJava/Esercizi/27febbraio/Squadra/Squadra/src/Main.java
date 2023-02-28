import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static class Squadra{
        Dirigenza dirigenza;
        Giocatori giocatori;
    }
    public static class Dirigenza{
        ArrayList<String> di = new ArrayList<String>(2); // > 2

        ArrayList<String> bo = new ArrayList<String>(2); // > 2

        public static ArrayList <String> setDirigenza(){
            Scanner nome = new Scanner(System.in);
            Scanner nDirigenza = new Scanner(System.in);
            int numeroDirigenza = 0;
            ArrayList<String> arrList = new ArrayList<String>();
            do {
                System.out.println("Quanti Dirigenti vuoi inserire? (MINIMO 2)");
                numeroDirigenza = nDirigenza.nextInt();
                if(numeroDirigenza > 1) {
                    for (int i = 0; i < numeroDirigenza; i++) {
                        System.out.println("Inserisci il nome del " + (i + 1) + "° dirigente");
                        String nomeDirigenza = nome.nextLine();
                        arrList.add(nomeDirigenza);
                    }
                }else{
                    System.out.println("Hai sbagliato, inserisci almeno 2 dirigenti");
                }
            }while(numeroDirigenza < 2);
            return arrList;
        }

        public static ArrayList <String> setBoss(){
            Scanner nome = new Scanner(System.in);
            Scanner nBoss = new Scanner(System.in);
            int numeroBoss = 0;
            ArrayList<String> arrList = new ArrayList<String>();
            do {
                System.out.println("Quanti Boss vuoi inserire? (MINIMO 2)");
                numeroBoss = nBoss.nextInt();
                if(numeroBoss > 1) {
                    for (int i = 0; i < numeroBoss; i++) {
                        System.out.println("Inserisci il nome del " + (i + 1) + "° boss");
                        String nomeBoss = nome.nextLine();
                        arrList.add(nomeBoss);
                    }
                }else{
                    System.out.println("Hai sbagliato, inserisci almeno 2 boss");
                }
            }while(numeroBoss < 2);
            return arrList;
        }



    }
    public static class Giocatori{
        ArrayList<String> ti = new ArrayList<String>(2); // > 2
        ArrayList<String> ri = new ArrayList<String>(1); // > 1

        public static ArrayList <String> setRiserve(){
            Scanner nome = new Scanner(System.in);
            Scanner nRiserve = new Scanner(System.in);
            int numeroRiserve = 0;
            ArrayList<String> arrList = new ArrayList<String>();
            do {
                System.out.println("Quante riserve vuoi inserire? (MINIMO 1)");
                numeroRiserve = nRiserve.nextInt();
                if(numeroRiserve > 0) {
                    for (int i = 0; i < numeroRiserve; i++) {
                        System.out.println("Inserisci il nome della " + (i + 1) + "° riserva");
                        String nomeRiserva = nome.nextLine();
                        arrList.add(nomeRiserva);
                    }
                }else{
                    System.out.println("Hai sbagliato, inserisci almeno 1 riserva");
                }
            }while(numeroRiserve < 1);
            return arrList;
        }

        public static ArrayList <String> setTitolari(){
            Scanner nome = new Scanner(System.in);
            Scanner nTitolari = new Scanner(System.in);
            int numeroTitolari = 0;
            ArrayList<String> arrList = new ArrayList<String>();
            do {
                System.out.println("Quanti titolari vuoi inserire? (MINIMO 2)");
                numeroTitolari = nTitolari.nextInt();
                if(numeroTitolari > 1) {
                    for (int i = 0; i < numeroTitolari; i++) {
                        System.out.println("Inserisci il nome del " + (i + 1) + "° titolare");
                        String nomeTitolari = nome.nextLine();
                        arrList.add(nomeTitolari);
                    }
                }else{
                    System.out.println("Hai sbagliato, inserisci almeno 1 riserva");
                }
            }while(numeroTitolari < 2);
            return arrList;
        }
    }

    public static void main(String[] args) {

        Scanner rispMenu = new Scanner(System.in);
        Scanner rispModifica = new Scanner(System.in);
        Squadra squadraCostruita = new Squadra();

        int rispostaMenu = 0;
        int rispostaModifica = 0;

        do{
            System.out.println("Cosa vuoi fare?");
            System.out.println("[1] Inserimento?");
            System.out.println("[2] Modifica");
            System.out.println("[3] Esci");
            rispostaMenu = rispMenu.nextInt();

            switch(rispostaMenu){

                case 1:
                        squadraCostruita.giocatori.ti.clear();
                        squadraCostruita.giocatori.ti = Giocatori.setTitolari();
                        squadraCostruita.giocatori.ri.clear();
                        squadraCostruita.giocatori.ri = Giocatori.setRiserve();
                        squadraCostruita.dirigenza.bo.clear();
                        squadraCostruita.dirigenza.bo = Dirigenza.setBoss();
                        squadraCostruita.dirigenza.di.clear();
                        squadraCostruita.dirigenza.di = Dirigenza.setDirigenza();

                    break;

                case 2:
                        do {
                            System.out.println("Cosa vuoi modificare?");
                            System.out.println("[1] Titolari");
                            System.out.println("[2] Riserve");
                            System.out.println("[3] Dirigenti");
                            System.out.println("[4] Boss");
                            rispostaModifica = rispModifica.nextInt();

                            switch(rispostaModifica){

                                case 1:
                                    squadraCostruita.giocatori.ti.clear();
                                    squadraCostruita.giocatori.ti = Giocatori.setTitolari();
                                    break;

                                case 2:
                                    squadraCostruita.giocatori.ti.clear();
                                    squadraCostruita.giocatori.ri = Giocatori.setRiserve();
                                    break;

                                case 3:
                                    squadraCostruita.dirigenza.di.clear();
                                    squadraCostruita.dirigenza.di = Dirigenza.setDirigenza();
                                    break;

                                case 4:
                                    squadraCostruita.dirigenza.bo.clear();
                                    squadraCostruita.dirigenza.bo = Dirigenza.setBoss();
                                    break;

                                default:
                                    System.out.println("Hai sbagliato, riprova");
                                    break;
                            }
                        }while(rispostaModifica > 5 || rispostaModifica < 0);
                    break;

                case 3:
                        visualizzaSquadra(squadraCostruita);
                    break;

                default:
                        System.out.println("Hai sbagliato, riprova");
                    break;
            }
        } while(rispostaMenu != 3);
    }

    public static void visualizzaSquadra(Squadra squadraCostruita){
        System.out.println("----TITOLARI----");
        System.out.println(squadraCostruita.giocatori.ti);
        System.out.println("----RISERVE----");
        System.out.println(squadraCostruita.giocatori.ri);
        System.out.println("----DIRIGENTI----");
        System.out.println(squadraCostruita.dirigenza.di);
        System.out.println("----BOSS----");
        System.out.println(squadraCostruita.dirigenza.bo);
    }



}