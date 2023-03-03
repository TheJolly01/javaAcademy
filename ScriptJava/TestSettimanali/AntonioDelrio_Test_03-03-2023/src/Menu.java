import java.util.Scanner;
public class Menu {



    public boolean MenuBiblioteca(Biblioteca biblioteca){

        Scanner rispMenu = new Scanner(System.in);
        int rispostaMenu = 0;
        boolean check = true;

        do{
            System.out.println("-------BIBLIOTECA COMUNALE-------");
            System.out.println("[1] AGGIUNGI LIBRO");
            System.out.println("[2] RIMUOVI LIBRO");
            System.out.println("[3] VISUALIZZA LIBRI");
            System.out.println("[4] CHIEDI LIBRO IN PRESTITO");
            System.out.println("[5] RESTITUISCI LIBRO");
            System.out.println("[6] ESCI DALLA BIBLIOTECA");
            rispostaMenu = rispMenu.nextInt();

            switch(rispostaMenu){

                case 1:
                    biblioteca.aggiungiLibro();
                    break;

                case 2:
                    biblioteca.rimuoviLibro();
                    break;

                case 3:
                    biblioteca.stampaLibriDisponibili();
                    break;

                case 4:
                    biblioteca.prestaLibro();
                    break;

                case 5:
                    biblioteca.restituisciLibro();
                    break;

                case 6:
                    System.out.println("Arrivederci e grazie");
                    check = false;
                    break;

                default:
                    System.out.println("Non esiste questa voce nel menù");
                    break;
            }
        } while(check);

        return true;
    }
}
