import java.util.ArrayList;
import java.util.Scanner;

public class Utente {

    private int id;
    private String nome;
    private String password;
    ArrayList<Biblioteca.Libro> libriInPrestito;


    public Utente(String nome, String password, int nUtenti){

        setNome(nome);
        setPassword(password);
        setId(nUtenti);

    }

    public static Utente addUtente(int nUtenti){
        String nome = inputString("Inserisci il nome utente");
        String password = inputString("Inserisci la password");
        return new Utente(nome, password, nUtenti);
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String inputString(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextLine();
    }


}
