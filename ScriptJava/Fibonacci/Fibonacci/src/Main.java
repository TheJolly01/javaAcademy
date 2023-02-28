import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Inserisci il numero:");
        int n = num.nextInt();

        System.out.println("Il numero è:" + FibonacciRicorsione(n));

    }

    public static int FibonacciRicorsione(int n){

        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return FibonacciRicorsione(n-1) + FibonacciRicorsione(n-2);
        }

    }

}