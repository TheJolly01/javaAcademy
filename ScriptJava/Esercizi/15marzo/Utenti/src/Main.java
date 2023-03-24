/*
* Andare a creare la classe utente che si possa registrare al nostro sistema che poi
* tramite una validazione password posso diventare un admin che può eliminare e
* visualizzare gli altri utenti
* */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int risposta;
        int adminNumber = 0;
        ArrayList<Utente> utenti = new ArrayList<>();
        ArrayList<Admin> admins = new ArrayList<>();

        do{
            risposta = inputInt("-----MENU-----\n[1]REGISTRA UTENTE\n[2]LOGIN ADMIN\n[3]ESCI");
            if(risposta == 1){
                String nomeUtente = inputString("Inserisci il nome utente");
                int passAdmin = inputInt("Hai una password da admin?\n[1]SI\n[2]NO");
                if(passAdmin == 1){
                    String password = inputString("Inserisci la password");
                    if(password.equals(Admin.getPassword())){
                        Admin admin = new Admin(nomeUtente);
                        admins.add(admin);
                    }else{
                        System.out.println("Password errata");
                    }
                }else{
                    Utente utente = new Utente(nomeUtente);
                    utenti.add(utente);
                }
            } else if(risposta == 2){
                String nomeAdmin = inputString("Inserisci il tuo nome utente");
                boolean check = false;
                for(int i = 0; i < admins.size(); i++){
                    if(admins.get(i).nomeUtente.equals(nomeAdmin)){
                        check = true;
                        adminNumber = i;
                        break;
                    }
                }
                if(!check){
                    System.out.println("Non esiste questo admin");
                }
                if(check){
                    String passLoginAdmin = inputString("Inserisci la password da admin");
                    if(Admin.getPassword().equals(passLoginAdmin)){
                        System.out.println("Loggato con successo");
                        int rispostaLoggato;
                        do{
                            rispostaLoggato = inputInt("[1]VEDI GLI UTENTI\n[2]ELIMINA UN UTENTE\n[3]ESCI");
                            if(rispostaLoggato == 1){
                                admins.get(adminNumber).showUsers(utenti);
                            }else if(rispostaLoggato == 2){
                                try {
                                    admins.get(adminNumber).deleteUser(utenti, inputInt("Inserisci il numero dell'utente che vuoi eliminare"));
                                } catch (Exception e){
                                    System.out.println("Utente non esistente");
                                }
                            }
                        }while(rispostaLoggato !=3);
                    }else{
                        System.out.println("Password errata");
                    }
                }
            }
        } while(risposta != 3);
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