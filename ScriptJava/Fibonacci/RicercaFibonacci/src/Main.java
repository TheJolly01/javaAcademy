
public class Main {
    public static void main(String[] args) {

        MenuFibonacci mymenu = new MenuFibonacci(); //crea oggetto menù

        ConnectionFibonacci connessione = new ConnectionFibonacci("jdbc:mysql://localhost:3306/fibonacci", "root", "root"); //crea oggetto per connessione database

        connessione.CreaConnessione();  //usa metodo CreaConnessione della classe ConnectionFibonacci

        mymenu.Menu();  //usa metodo Menu della classe MenuFibonacci
    }
}