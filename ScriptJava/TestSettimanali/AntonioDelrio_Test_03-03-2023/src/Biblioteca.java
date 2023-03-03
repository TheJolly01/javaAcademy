import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca {

    private ArrayList <Libro> libriBiblioteca;
    private ArrayList <Integer> copieDisponibili;
    private ArrayList <Integer> copieInPrestito;

    // COSTRUTTORE

    public Biblioteca(){

        libriBiblioteca = new ArrayList<Libro>();
        copieDisponibili = new ArrayList<Integer>();
        copieInPrestito = new ArrayList<Integer>();

    }

    // METODI BIBLIOTECA

    // Questo metodo fa in modo che, in base al libro scelto, diminuisca la disponibilità e aumenti il numero di libri presi in prestito
    public void prestaLibro(){

        Scanner prestLibro = new Scanner(System.in);
        int indice = 0;
        boolean check = true;

        do{
        System.out.println("Quale libro vuoi prendere in prestito?");
        stampaLibriDisponibili();
        indice = prestLibro.nextInt();

        if(indice > libriBiblioteca.size() || indice < 1){
            System.out.println("Non esiste questo libro, riprova");
        }else{
            check = false;
        }

        } while(check);
        indice -= 1;
        if(copieDisponibili.get(indice) > 0){
            System.out.println("Hai preso in prestito il libro");
            copieDisponibili.set(indice, (copieDisponibili.get(indice) - 1));
            copieInPrestito.set(indice, (copieInPrestito.get(indice) + 1));
        } else{
            System.out.println("Non ci sono copie disponibili per il libro selezionato");
        }
    }

    // Questo metodo fa in modo che, in base al libro scelto, diminuisca il numero di libri presi in prestito e aumenti la disponibilità
    public void restituisciLibro(){

        Scanner restLibro = new Scanner(System.in);
        int indice = 0;
        boolean check = true;

        do {
            System.out.println("Quale libro vuoi restituire?");
            stampaLibriDisponibili();
            indice = restLibro.nextInt();
            if(indice > libriBiblioteca.size() || indice < 1){
                System.out.println("Non esiste questo libro, riprova");
            }else{
                check = false;
            }


        } while(check);
        indice -= 1;
        if(copieDisponibili.get(indice) > 0){
            System.out.println("Hai restituito il libro");
            copieDisponibili.set(indice, (copieDisponibili.get(indice) + 1));
            copieInPrestito.set(indice, (copieInPrestito.get(indice) - 1));
        } else{
            System.out.println("Nessuno di questi libri è stato prestato");
        }
    }

    // Questo metodo fa in modo che vengano stampati i libri presenti in biblioteca e il numero di libri disponibili
    public void stampaLibriDisponibili(){

        if(libriBiblioteca.size() < 1){
            System.out.println("Nessun libro da visualizzare");
        } else {
            for (int i = 0; i < libriBiblioteca.size(); i++) {
                System.out.print("[" + (i + 1) + "] " + libriBiblioteca.get(i).getNome());
                System.out.print(" | Anno: " + libriBiblioteca.get(i).getAnno());
                System.out.print(" | Editore: " + libriBiblioteca.get(i).getEditore());
                System.out.println(" | Copie disponibili: " + copieDisponibili.get(i));
            }
        }
    }

    // Questo metodo fa in modo che venga aggiunto un libro alla collezione della biblioteca, indicandone il numero di cope disponibili
    public void aggiungiLibro(){

        Scanner libDaAggiungere = new Scanner(System.in);
        Scanner annDaAggiungere = new Scanner(System.in);
        Scanner editDaAggiungere = new Scanner(System.in);
        Scanner copDisponibili = new Scanner(System.in);

        System.out.println("Inserisci il nome del libro che vuoi aggiungere");
        String nomeLibro = libDaAggiungere.nextLine();

        System.out.println("Di che anno è il libro?");
        int annoLibro = annDaAggiungere.nextInt();

        System.out.println("Chi è l'editore del libro?");
        String editoreLibro = editDaAggiungere.nextLine();

        Libro libro = new Libro(nomeLibro, annoLibro, editoreLibro);

        System.out.println("Quante copie hai a disposizione di questo libro?");
        int copieLibro = copDisponibili.nextInt();

        libriBiblioteca.add(libro);
        copieDisponibili.add(copieLibro);
        copieInPrestito.add(0);
    }

    // Questo metodo fa in modo che venga rimosso un libro dalla collezione della biblioteca, rimuovendone tutti quelli disponibili
    public void rimuoviLibro(){

        Scanner ind = new Scanner(System.in);
        int indice = 0;
        boolean check = true;

        do {
            System.out.println("Quale libro vuoi rimuovere?");
            stampaLibriDisponibili();
            indice = ind.nextInt();

            if (indice > libriBiblioteca.size() || indice < 1) {
                System.out.println("Non esiste questo libro, riprova");
            } else {
                check = false;
            }
        } while(check);

        indice -= 1;

        libriBiblioteca.remove(indice);
        copieDisponibili.remove(indice);
        copieInPrestito.remove(indice);
    }

    // GETTER DEGLI ARRAYLIST
    public ArrayList<Libro> getLibriBiblioteca() {
        return libriBiblioteca;
    }
    public ArrayList<Integer> getCopieDisponibili() {
        return copieDisponibili;
    }
    public ArrayList<Integer> getCopieInPrestito() {
        return copieInPrestito;
    }

    // SETTER DEGLI ARRAYLIST
    public void setLibriBiblioteca(ArrayList<Libro> libriBiblioteca) {
        this.libriBiblioteca = libriBiblioteca;
    }
    public void setCopieDisponibili(ArrayList<Integer> copieDisponibili) {
        this.copieDisponibili = copieDisponibili;
    }
    public void setCopieInPrestito(ArrayList<Integer> copieInPrestito) {
        this.copieInPrestito = copieInPrestito;
    }








}
