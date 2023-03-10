import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int risp;
        do {
            risp = inputSelezione("Premi 0 per chiudere il programma");
            if(risp != 0) {
                try {
                    int[] myNumbers = {1, 2, 3, 4};
                    System.out.println(myNumbers[12]);
                } catch (Exception e) {
                    System.out.println("Qualcosa non è andato");
                } finally {
                    System.out.println("Il try catch è finito");
                }
            }
        }while(risp !=0);
    }

    public static int inputSelezione(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextInt();
    }


}