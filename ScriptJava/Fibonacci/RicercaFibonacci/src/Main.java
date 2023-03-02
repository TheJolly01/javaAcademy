import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {

        Fibonacci mymenu = new Fibonacci(); 

        ConnectionFibonacci connessione = new ConnectionFibonacci("jdbc:mysql://localhost:3306/fibonacci", "root", "root");

        connessione.CreaConnessione();

        mymenu.MenuFibonacci();

    }

}