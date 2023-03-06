import java.util.Scanner;
public class Login {


    public boolean MenuLogin(ListaAccount listaAccount){
        Scanner logRisp = new Scanner(System.in);

        int loginRisposta = 0;
        boolean check = true;
        boolean checkSwitch;
        do {
            System.out.println("------ACCEDI O REGISTRATI------");
            System.out.println("[1] ACCESSO NORMALE");
            System.out.println("[2] ACCESSO ADMIN");
            System.out.println("[3] REGISTRATI");
            System.out.println("[4] ESCI");
            loginRisposta = logRisp.nextInt();

            if(loginRisposta > 4 || loginRisposta < 1 ){
                System.out.println("Alternativa non valida");
            }else{
                check = false;
            }
        } while(check);

        switch(loginRisposta) {

            case 1:
                checkSwitch = loginUtente(listaAccount);
                return checkSwitch;

            case 2:
                checkSwitch = loginAdmin(listaAccount);
                return checkSwitch;

            case 3:
                checkSwitch = registraUtente(listaAccount);
                return checkSwitch;

            case 4:
                System.exit(0);

            default:
                System.out.println("Scelta non disponibile");
                return true;
        }

    }
    public boolean registraUtente(ListaAccount listaAccount){

        Scanner nUtente = new Scanner(System.in);
        Scanner pUtente = new Scanner(System.in);
        String nomeUtente;
        boolean checkEsistenzaUtente = true;
        do {
            System.out.println("Inserisci il nome che desideri utilizzare");
            nomeUtente = nUtente.nextLine();
            for (int i = 0; i < listaAccount.listaUtenti.size(); i++) {
                if (nomeUtente.equals(listaAccount.listaUtenti.get(i).nomeUtente)) {
                    System.out.println("Nome utente non disponibile");
                    checkEsistenzaUtente = false;
                    break;
                }
            }
            if (checkEsistenzaUtente) {
                checkEsistenzaUtente = false;
            }
        } while(checkEsistenzaUtente);

        System.out.println("Inserisci password");
        String passwordUtente = pUtente.nextLine();

        Utente utente = new Utente(nomeUtente, passwordUtente);

        utente.nomeUtente = nomeUtente;
        utente.setPassword(passwordUtente);

        listaAccount.listaUtenti.add(utente);

        return true;
    }
    public boolean loginUtente(ListaAccount listaAccount){
        Scanner nUtente = new Scanner(System.in);
        Scanner pUtente = new Scanner(System.in);
        String nomeUtente;
        String password;
        boolean checkEsistenzaUtente = true;
        int j = -1;

        System.out.println("Inserisci il tuo nome utente");
        nomeUtente = nUtente.nextLine();
        for (int i = 0; i < listaAccount.listaUtenti.size(); i++) {
            if (nomeUtente.equals(listaAccount.listaUtenti.get(i).nomeUtente)) {
                j = i;
                checkEsistenzaUtente = false;
                break;
            }
        }
        if (checkEsistenzaUtente) {
            System.out.println("Nome utente non esistente");

            return true;
        }
        System.out.println("Inserisci la tua password");
        password = pUtente.nextLine();
        if (password.equals(listaAccount.listaUtenti.get(j).getPassword())){
            return false;
        }else{
            return true;
        }
    }
    public boolean loginAdmin(ListaAccount listaAccount){

        Scanner pinAd = new Scanner(System.in);
        Scanner nUtente = new Scanner(System.in);
        Scanner pUtente = new Scanner(System.in);
        String nomeUtente;
        String password;
        boolean checkEsistenzaUtente = true;
        boolean checkEsistenzaPassword = true;
        boolean checkEsistenzaPin = true;
        int j = -1;

        System.out.println("Inserisci il tuo nome utente");
        nomeUtente = nUtente.nextLine();
        for (int i = 0; i < listaAccount.listaAdmin.size(); i++) {
            if (nomeUtente.equals(listaAccount.listaAdmin.get(i).utente.nomeUtente)) {
                j = i;
                checkEsistenzaUtente = false;
                break;
            }
        }
        if (checkEsistenzaUtente) {
            System.out.println("Nome utente non esistente");
            return false;
        }

        System.out.println("Inserisci la tua password");
        password = pUtente.nextLine();
        if (password.equals(listaAccount.listaAdmin.get(j).utente.getPassword())){
            checkEsistenzaPassword = false;
        }
        if(checkEsistenzaPassword){
            return true;
        }
        System.out.println("Inserisci il pin Admin");
        int pin = pinAd.nextInt();
        if (pin == listaAccount.listaAdmin.get(j).getPin()){
            checkEsistenzaPin = false;
        }
        if(checkEsistenzaPin){
            return true;
        }
        return false;
    }



}
