import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
public class CreazioneUtente {

    static ArrayList<String> arrNomi = new ArrayList<String>();
    static ArrayList<String> arrPassword = new ArrayList<String>();
    static ArrayList<Integer> arrBudget = new ArrayList<Integer>();

    static int ID;

    private static Scanner insNomeL = new Scanner(System.in);
    private static Scanner insPasswordL = new Scanner(System.in);

    private static Scanner insNomeR = new Scanner(System.in);
    private static Scanner insPasswordR = new Scanner(System.in);
    private static Scanner sceltaMenu = new Scanner(System.in);


    public static boolean login(){

        boolean controlloNome = false;
        boolean controlloPassword = false;

        System.out.print("Nome Utente: ");
        String inserimentoNome = insNomeL.nextLine();
        for(int i = 0; i < arrNomi.size(); i++){
            if(arrNomi.get(i).equals(inserimentoNome)){
                controlloNome = true;
                ID = i;
            }
        }
        if(controlloNome){
            System.out.print("Password: ");
            String inserimentoPassword = insPasswordL.nextLine();
            if(arrPassword.get(ID).equals(inserimentoPassword)){
                controlloPassword = true;
            }
        }
        if(controlloNome){
            if(controlloPassword){
                System.out.println("Benvenuto " + inserimentoNome);
                return true;
            } else{
                System.out.println("Password non corretta");
                return false;
            }
        }else{
            System.out.println("Nome Utente inesistente");
            return false;
        }
    }

    public static void regNomeUtente(){

        String inserimentoNome = " ";
        boolean controlloNome;

        do {
            controlloNome = false;
            System.out.println("Inserisci il nome utente che vuoi utilizzare");
            inserimentoNome = insNomeR.nextLine();
            for (int i = 0; i < arrNomi.size(); i++) {
                if (arrNomi.get(i).equals(inserimentoNome)) {
                    controlloNome = true;
                    break;
                }
            }
            if (controlloNome) {
                System.out.println("Nome Utente già esistente riprova");
            }
        }while(controlloNome);

        arrNomi.add(inserimentoNome);
    }

    public static void regPasswordUtente(){

        String inserimentoPassword = " ";

            System.out.println("Inserisci la password che vuoi utilizzare");
            inserimentoPassword = insPasswordR.nextLine();

        arrPassword.add(inserimentoPassword);

    }

    public static boolean menuCreazioneUtente(){

        boolean check;
        int rispostaMenu;

        do{
            check = false;

            System.out.println("-----MENU-----");
            System.out.println("[1] LOGIN");
            System.out.println("[2] REGISTRATI");
            rispostaMenu = sceltaMenu.nextInt();

            switch(rispostaMenu){
                case 1:

                    check = login();

                    if(!check){
                        System.out.println("Login fallito!");
                    }
                    break;

                case 2:

                    regNomeUtente();
                    regPasswordUtente();
                    arrBudget.add((int)(Math.random()*75));
                    System.out.println("Utente creato, si prega di loggarsi");
                    break;

            }
        }while (!check);


        return check;
    }


}

