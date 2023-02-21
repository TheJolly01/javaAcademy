import java.util.Scanner;

public class richiestaDati {
    
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        Scanner surname = new Scanner(System.in);
        Scanner mail = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        

        String[] dati = {"", "", "", ""};
        
        System.out.println("Inserisci il nome:");
        dati[0]  = name.nextLine();
        System.out.println("Inserisci il cognome:");
        dati[1] = surname.nextLine();
        System.out.println("Inserisci il email:");
        dati[2] = mail.nextLine();
        System.out.println("Inserisci l'eta:");
        dati[3] = age.nextLine();


        System.out.println("Questi sono i tuoi dati:");
        for(String i:dati){
            System.out.print(i + " ");

        }

        name.close();
        surname.close();
        mail.close();
        age.close();

    }
}