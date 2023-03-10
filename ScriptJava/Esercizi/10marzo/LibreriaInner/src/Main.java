import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nUtenti = 0;
        int indexUtente = 0;
        Biblioteca biblioteca = new Biblioteca();
        ArrayList<Utente> utenti = new ArrayList<>();
        ArrayList<Biblioteca.Libro> libriDisponibili = new ArrayList<>();

        int rispCreaUtente;
        int rispPrendiInPrestito;
        boolean checkPassword = false;

        libriDisponibili.add(biblioteca.aggiungiLibro());
        libriDisponibili.add(biblioteca.aggiungiLibro());
        libriDisponibili.add(biblioteca.aggiungiLibro());
        libriDisponibili.add(biblioteca.aggiungiLibro());

        biblioteca.visualizzaLibri(libriDisponibili);


        do {
            try {
                rispCreaUtente = inputInt("Vuoi aggiungere un utente?\n[1]SI\n[2]NO");
            } catch(Exception e){
                rispCreaUtente = 3;
            }
            if(rispCreaUtente == 1){
            utenti.add(Utente.addUtente(nUtenti));
            nUtenti++;
            }else if(rispCreaUtente > 2 || rispCreaUtente < 1){
                System.out.println("Opzione non disponibile");
            }
        }while(rispCreaUtente != 2);


        do{
            try {
                rispPrendiInPrestito = inputInt("Vuoi prendere in prestito un libro?\n[1]SI\n[2]NO");
                try{
                    String nomeUt = inputString("Inserisci il tuo nome utente");
                    String passw = inputString("Inserisci la tua password");
                    boolean checkNomeUtente = false;
                    checkPassword = false;
                    for(int i = 0; i < utenti.size(); i++){
                        checkNomeUtente = utenti.get(i).getNome().equals(nomeUt);
                        if(checkNomeUtente){
                            indexUtente = i;
                            if(utenti.get(indexUtente).getPassword().equals(passw)){
                                checkPassword = true;
                                break;
                            }
                        }
                    }
                } catch(Exception e){
                    System.out.println("Errore su login");
                }
            } catch(Exception e){
                rispPrendiInPrestito = 3;
            }
            if(rispPrendiInPrestito == 1 && checkPassword){
            biblioteca.visualizzaLibri(libriDisponibili);
            try {
                int libro = inputInt("Digita il codice del libro");

                utenti.get(indexUtente).libriInPrestito.add(libriDisponibili.get(libro));
                libriDisponibili.remove(libro);

            } catch(Exception e){
                System.out.println("Errore su scelta libro!");
            }

            }else if(rispPrendiInPrestito > 2 || rispPrendiInPrestito < 1){
                System.out.println("Opzione non disponibile");
            }
        } while(rispPrendiInPrestito != 2);

        for(int i = 0; i < utenti.size(); i++){
            System.out.print("Nome: " + utenti.get(i).getNome());
            System.out.print(" | Numero libri in prestito: " + utenti.get(i).libriInPrestito.size() + " e sono:");
            for(int j = 0; j < utenti.get(i).libriInPrestito.size(); j++){
                System.out.println(utenti.get(j).libriInPrestito.get(j));
            }

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