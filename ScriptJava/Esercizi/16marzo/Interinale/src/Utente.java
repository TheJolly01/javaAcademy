import java.util.Scanner;

public class Utente implements Muratore,Pastore,Commerciante,Cuoco {

    String nome;
    int anniEsperienza;
    int eta;
    String lavoro;
    int durataLavoro;

    public Utente(){
        nome = inputString("Inserisci il tuo nome");
        anniEsperienza = inputInt("Quanti anni di esperienza hai?");
        eta = inputInt("Quanti anni hai?");
    }



    @Override
    public void nomeLavoro() {
        System.out.println("Lavoro di " + nome + ": " + lavoro);
    }

    @Override
    public void durataLavoro() {
        System.out.println("Durata lavoro di " + nome + ": " + durataLavoro);
    }

    @Override
    public void vendi() {
        System.out.println("*Vende oggetti*");
    }

    @Override
    public void compra() {
        System.out.println("*Acquista pallet di roba da vendere*");
    }

    @Override
    public void cucina() {
        System.out.println("*Cucina*");
    }

    @Override
    public void mangia() {
        System.out.println("Gnam gnam");
    }

    @Override
    public void costruisciCasa() {
        System.out.println("Casa costruita, molto carina");
    }

    @Override
    public void demolisciCasa() {
        System.out.println("Peccato, era una casa molto bella");
    }

    @Override
    public void mungi() {
        System.out.println("Latte a volontà");
    }

    @Override
    public void truba() {
        System.out.println("TRUBAAAA, ALEEE, MOVVEDI, A TI MOVESE, AJO E TRUBA");
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
