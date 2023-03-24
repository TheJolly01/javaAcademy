import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ArrayList<Utente> utenti = new ArrayList<>();
        ArrayList<Admin> admins = new ArrayList<>();
        int risposta = 0;

        do{
            boolean checkUtente = false;
            boolean checkAdmin = false;
            risposta = inputInt("-----LOGIN-----\n[1]LOGIN UTENTE\n[2]LOGIN ADMIN\n[3]REGISTRATI\n[4]CHIUDI PROGRAMMA");
            switch (risposta){
                case 1:
                    try {
                        checkUtente = LoginSignin.login(utenti);
                    } catch(Exception e){
                        System.out.println("Errore nel login");
                    }
                    break;
                case 2:
                    try {
                        checkAdmin = LoginSignin.loginAdmin(admins);
                    } catch (Exception e){
                        System.out.println("Errore nel login");
                    }
                    break;
                case 3:
                    try {
                        utenti.add(LoginSignin.signin());
                    } catch (Exception e) {
                        System.out.println("Errore nella registrazione");
                    }
                    System.out.println("Utente creato correttamente");
                    break;
                case 4:
                    System.out.println("Arrivederci");
                    break;
                default:
                    System.out.println("HAI INSERITO UN VALORE NON VALIDO");
                    break;
            }
            if(checkUtente){

                //METODO PER LE OPZIONI UTENTE NORMALE

            }else if(checkAdmin){
                Admin.opzioniAdmin(utenti);
            }
        }while (risposta != 4);
    }

    public static int inputInt(String stringa){
        Scanner scanner = new Scanner(System.in);
        System.out.println(stringa);
        return scanner.nextInt();
    }



}