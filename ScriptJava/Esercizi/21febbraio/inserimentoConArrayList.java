/*
 * Creiamo un sistema di inserimento che permetta di registrare un utente tramite i suoi dati
 * ( Nome, password, età ) e andiamo a far ripetere l'azioni x volte andando a incasselare vari utenti nel 
 * nostro arraylist, l'obbiettivo e avere tre utenti registrati e stamparne i dati su arraylist differenti
 * 
 * size()
 * .remove(indice)
 * .clear()
 * 
 */

import java.util.ArrayList; // importa libreria ArrayList
import java.util.Scanner;

public class inserimentoConArrayList {
    public static void main(String[] args) {

        Scanner rispMenu = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        Scanner pw = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        Scanner nameModify = new Scanner(System.in);
        Scanner passwordModify = new Scanner(System.in);

        int rispostaMenu = 0;
        int contaUtenti = 0;
        String nomeDaModificare = "";
        String passPerModifica = "";
        String nome;
        String password;
        String eta;

        ArrayList<String> data1 = new ArrayList<String>(); // crea oggetto ArrayList
        ArrayList<String> data2 = new ArrayList<String>(); // crea oggetto ArrayList
        ArrayList<String> data3 = new ArrayList<String>(); // crea oggetto ArrayList

        do {
            System.out.println("Vuoi registrare un nuovo utente?");
            System.out.println("[1] REGISTRA NUOVO UTENTE");
            System.out.println("[2] MODIFICA UTENTE");
            System.out.println("[3] ESCI");
            rispostaMenu = rispMenu.nextInt();

            if (rispostaMenu == 1) {
                System.out.println("Inserisci il tuo nome");
                nome = name.nextLine();
                System.out.println("Inserisci la password");
                password = pw.nextLine();
                System.out.println("Inserisci la tua età");
                eta = age.nextLine();

                if (contaUtenti == 0) {
                    data1.add(nome);
                    data1.add(password);
                    data1.add(eta);
                }

                if (contaUtenti == 1) {
                    data2.add(nome);
                    data2.add(password);
                    data2.add(eta);
                }

                if (contaUtenti == 2) {
                    data3.add(nome);
                    data3.add(password);
                    data3.add(eta);
                }
                if (contaUtenti < 3) {
                    contaUtenti++;
                } else {
                    System.out.println("L'utente non è stato inserito. MAX UTENTI RAGGIUNTO");
                }

            } else if (rispostaMenu == 2) {

                if (contaUtenti != 0) {

                    System.out.println("Abbiamo " + contaUtenti + "utenti registrati.");
                    System.out.println("Inserisci il nome che desideri modifcare");
                    nomeDaModificare = nameModify.nextLine();

                    if (nomeDaModificare.equals(data1.get(0))) {
                        System.out.println("Inserisci la password");
                        passPerModifica = passwordModify.nextLine();

                        if (passPerModifica.equals(data1.get(1))) {

                            System.out.println("Inserisci i nuovi dati");
                            System.out.println("Inserisci il tuo nome");
                            nome = name.nextLine();
                            System.out.println("Inserisci la password");
                            password = pw.nextLine();
                            System.out.println("Inserisci la tua età");
                            eta = age.nextLine();

                            data1.remove(2);
                            data1.remove(1);
                            data1.remove(0);
                            data1.add(nome);
                            data1.add(password);
                            data1.add(eta);

                        }
                    } else if (nomeDaModificare.equals(data2.get(0))) {
                        System.out.println("Inserisci la password");
                        passPerModifica = passwordModify.nextLine();

                        if (passPerModifica.equals(data2.get(1))) {

                            System.out.println("Inserisci i nuovi dati");
                            System.out.println("Inserisci il tuo nome");
                            nome = name.nextLine();
                            System.out.println("Inserisci la password");
                            password = pw.nextLine();
                            System.out.println("Inserisci la tua età");
                            eta = age.nextLine();

                            data2.remove(2);
                            data2.remove(1);
                            data2.remove(0);
                            data2.add(nome);
                            data2.add(password);
                            data2.add(eta);

                        }
                    } else if (nomeDaModificare.equals(data3.get(0))) {
                        System.out.println("Inserisci la password");
                        passPerModifica = passwordModify.nextLine();

                        if (passPerModifica.equals(data3.get(1))) {

                            System.out.println("Inserisci i nuovi dati");
                            System.out.println("Inserisci il tuo nome");
                            nome = name.nextLine();
                            System.out.println("Inserisci la password");
                            password = pw.nextLine();
                            System.out.println("Inserisci la tua età");
                            eta = age.nextLine();

                            data3.remove(2);
                            data3.remove(1);
                            data3.remove(0);
                            data3.add(nome);
                            data3.add(password);
                            data3.add(eta);

                        }
                    }

                } else {
                    System.out.println("Cosa vuoi modificare se non esiste neanche un utente?");
                }

            } else if (rispostaMenu > 3) {
                System.out.println("HAI SBAGLIATO");
            }
        } while (rispostaMenu != 3);

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);

        rispMenu.close();
        name.close();
        pw.close();
        age.close();

    }

}
