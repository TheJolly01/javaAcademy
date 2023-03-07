
public class Main {
    public static void main(String[] args) {

        ConnectionFibonacci connessione = new ConnectionFibonacci("jdbc:mysql://localhost:3306/fibonacci", "root", "root"); //crea oggetto per connessione database
        SerieFibonacci serieFibonacci = new SerieFibonacci();
        MenuFibonacci menuFibonacci = new MenuFibonacci();

        connessione.CreaConnessione();  //usa metodo CreaConnessione della classe ConnectionFibonacci

        menuFibonacci.Menu(serieFibonacci);


    }
}