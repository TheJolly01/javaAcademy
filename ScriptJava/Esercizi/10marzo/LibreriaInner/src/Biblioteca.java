import java.util.ArrayList;
import java.util.Scanner;
public class Biblioteca {
    int nLibri = 0;
    class Libro{
        String genere;
        Libro(String genere){
            this.genere = genere;
        }
    }

    public void visualizzaLibri(ArrayList<Biblioteca.Libro> libriDisponibili){
        for(int i = 0; i < nLibri; i++){
            System.out.println("[" + i + "]" + libriDisponibili.get(i).genere);
        }
    }

    public Libro aggiungiLibro(){
            String genLibro = inputString("Inserisci il genere del libro");
            Biblioteca.Libro libro = new Libro(genLibro);
            nLibri++;
            return libro;
    }

    public int inputInt(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextInt();
    }

    public String inputString(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextLine();
    }


}
