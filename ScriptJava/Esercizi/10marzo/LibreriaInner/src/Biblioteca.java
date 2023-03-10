import java.util.Scanner;
public class Biblioteca {
    int nLibri;
    class Libro{
        String genere;
        Libro(String genere){
            this.genere = genere;
        }

    }

    public void aggiungiLibro(){
        int risp = inputInt("Vuoi inserire un libro\n[1]SI\n[2]NO");
        if(risp == 1){
            String genLibro = inputString("Inserisci il genere del libro");
            Biblioteca.Libro libro = new Libro(genLibro);
            nLibri++;
        }
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
