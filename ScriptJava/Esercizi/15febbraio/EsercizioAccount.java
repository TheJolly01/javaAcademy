/*
 * creare un sistema di inserimento che permetta di creare e salvare i daTI DI UN ACCOUNT 
 * ( nome cognome, età di tipo int obbligatoriamente, e data di nascita ) se i dati sono già
 * presenti dovraà chiederti una password per modificarli in caso contrario te li farà inserire
 */

import java.util.Scanner;
public class EsercizioAccount {
    public static void main(String[] args){

        Scanner name = new Scanner(System.in);
        Scanner surname = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        Scanner born = new Scanner(System.in);
        Scanner password = new Scanner (System.in);
        Scanner riprova = new Scanner(System.in);
        Scanner diNuovo = new Scanner (System.in);

        String nomePresente = "";
        String cognomePresente = "";
        int anniPresenti = 0;
        String dataDiNascitaPresente = "";
        String passwordPresente = "password";
        int esecuzione = 0;
        int riprovaInserimento = 0;
        int diNuovoProgram = 0;
        String passwordInput;

        do{
            System.out.println("Inserisci il nome:");
            String nome = name.nextLine();
            System.out.println("Inserisci il cognome:");
            String cognome = surname.nextLine();
            System.out.println("Inserisci i tuoi anni:");
            int anni = age.nextInt();
            System.out.println("Inserisci la data di nascita:");
            String dataDiNascita = born.nextLine();
            Boolean check = false;
            check = controlloDati(nome, cognome, anni, dataDiNascita, nomePresente, cognomePresente, anniPresenti, dataDiNascitaPresente);
            int i = 0;

            if(check == false){
                do{
                
                    System.out.println("Inserisci la password per modificare i tuoi dati:");
                        passwordInput = password.nextLine();


                    if(passwordInput.equals(passwordPresente)){
                        System.out.println("Hai inserito la password giusta!");
                        i+=3;
                    }
                    else{
                        System.out.println("Hai inserito la password sbagliata!");
                        
                        i++;
                    }
                } while(i < 3);
                if(i == 3){
                    do{
                        System.out.println("Hai finito i tentativi, riprova a inserire i tuoi dati o vuoi uscire?");
                        System.out.println("[1]Riprova [2]Esci");
                        riprovaInserimento = riprova.nextInt();
                        if(riprovaInserimento == 2){
                            esecuzione = 1;
                        }
                        if(riprovaInserimento == 1){
                            esecuzione = 2;
                        }
                    } while(riprovaInserimento != 1 && riprovaInserimento != 2);
                    
                }



            }else{
                nomePresente = nome;
                cognomePresente = cognome;
                anniPresenti = anni;
                dataDiNascitaPresente = dataDiNascita;
            }

            if(riprovaInserimento != 1){
                System.out.println("Vuoi riniziare il programma?");
                System.out.println("[1]Rinizia [2]Esci");
                diNuovoProgram = diNuovo.nextInt();
                
                
            }

        } while(esecuzione == 2);

        name.close();
        surname.close();
        age.close();
        born.close();
        password.close();
        riprova.close();
        diNuovo.close();




    }
    

    static Boolean controlloDati(String nome, String cognome, int anni, String dataDiNascita, String nomePresente, String cognomePresente, int anniPresenti, String dataDiNascitaPresente){

        Boolean check = false;

        if (nome.equals(nomePresente) && cognome.equals(cognomePresente) && anni == anniPresenti && dataDiNascita.equals(dataDiNascitaPresente)){
            System.out.println("Hai inserito dei dati esistenti");
            check = true;
        }
        else{
            System.out.println("Dati non trovati");
            check = false;
        }
        return check;


        }

        

    

}
