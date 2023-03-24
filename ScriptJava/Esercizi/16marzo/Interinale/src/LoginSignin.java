import java.util.ArrayList;
import java.util.Scanner;

public class LoginSignin {

    public static Utente signin(){
        return new Utente();
    }

    public static boolean login(ArrayList<Utente> utenti){

        String nomeUtente = inputString("Nome utente:");
        boolean checkLogin = false;

        for(int i = 0; i < utenti.size(); i++){
            if(nomeUtente.equals(utenti.get(i).nome)){
                checkLogin = true;
                break;
            }
        }
        return checkLogin;
    }

    public static boolean loginAdmin(ArrayList<Admin> admins){

        String nomeUtente = inputString("Nome utente:");
        boolean checkLogin = false;
        boolean checkPassword = false;
        int index = -1;
        for(int i = 0; i < admins.size(); i++){
            if(nomeUtente.equals(admins.get(i).nome)){
                checkLogin = true;
                index = i;
                break;
            }
        }
        if(checkLogin){
            String password = inputString("Inserisci la password da admin");
            if(password.equals(admins.get(index).password)){
                checkPassword = true;
            }
        }
        return checkPassword;
    }

    public static int inputInt(String stringa){
        Scanner scanner = new Scanner(System.in);
        System.out.println(stringa);
        return scanner.nextInt();
    }

    public static String inputString(String stringa){
        Scanner scanner = new Scanner(System.in);
        System.out.println(stringa);
        return scanner.nextLine();
    }

}
