import java.util.Scanner;

public class inserimentoTreDati {
    public static void main(String[] args){

        Scanner num = new Scanner(System.in);                                          //oggetto scanner per inserimento numero
        Scanner parola = new Scanner(System.in);                                       //oggetto scanner per inserimento stringa
        Scanner tipoBool = new Scanner(System.in);                                     //oggetto scanner per inserimento bool


        System.out.println("Quanti anni hai?");                                      //Richiesta età
        int numero = num.nextInt();                                                     //Inserimento età

        System.out.println("Come ti chiami?");                                       //Richiesta nome
        String parolaInserita = parola.nextLine();                                      //Inserimento nome

        System.out.println("Sei un essere umano?\n[1]SI\n[2]NO");                    //Richiesta bot
        int intBooleano = tipoBool.nextInt();                                  //Inserimento bot int che diventerà booleano

        boolean tipoBooleano;                                                  //Tipo bool che verrà preso da int intBooleano

        if(intBooleano == 1){                                                  //Se la risposta è 1
            tipoBooleano = true;                                               //allora il bool sarà true
        }
        else{                                                                  //Se la risposta è 2
            tipoBooleano = false;                                              //allora il bool sarà false
        }



        Scanner operaz = new Scanner(System.in);                               //oggetto scanner per scelta operazioni


        System.out.println("Quale operazione vuoi fare?");  //richiesta operazioni
        System.out.println("[1]Funzioni Matematiche");     //scelta funzioni matematiche
        System.out.println("[2]Funzioni Stringa");          //scelta funzioni stringa
        System.out.println("[3]Casting");                   //scelta casting
        int operazioni = operaz.nextInt();                      //inserimento risposta scelta operazioni

        switch(operazioni){                                     //Switch con tutte le operazioni
            case 1:                                             //case funzioni matematiche
                funzioniMatematiche(numero);                    //funzione del numero
                break;                                              //fine case
            case 2:                                                 //case funzioni stringa
                funzioniStringa(parolaInserita);                //funzione della stringa
                break;                                              //fine case
            case 3:                                                 //case casting

                Scanner scegliCast = new Scanner(System.in);    //oggetto scanner per scelta operazioni
                System.out.println("Su cosa vuoi eseguire il casting?\n[1]Numero\n[2]Stringa\n[3]Booleano"); //richiesta casting
                int scegliCasting = scegliCast.nextInt();                                                       //input casting

                if (scegliCasting ==1){                         //se la risposta è 1
                    castingInt(numero);                         //invoca funzione castingInt
                }
                else if (scegliCasting == 2){                   //altrimenti se la risposta è 2
                    castingString(parolaInserita);              //invoca funzione castingString
                }
                else if (scegliCasting == 3){                   //altrimenti se la risposta è 3
                    castingBool(tipoBooleano);                 //invoca funzione castingBool
                }
                else{                                           //altrimenti
                    System.out.println("HAI SBAGLIATO!");     //output HAI SBAGLIATO
                    break;                                      //se hai sbagliato esci dallo switch
                }

                break;

            default:                                                //case default
                System.out.println("HAI SBAGLIATO QUALCOSA!");   //messaggio di errore
        }

        operaz.close();                                            //chiudi scanner operaz
        num.close();                                               //chiudi scanner num
        parola.close();                                            //chiudi scanner parola
        tipoBool.close();                                          //chiudi scanner tipoBool

    }

    static void funzioniMatematiche(int n){                     //funzione funzioniMatematiche


        Scanner opMat = new Scanner(System.in);                 //scanner per input operazioni matematiche

        System.out.println("Quale operazione matematicha vuoi fare?");  //richiesta operazioni matematiche
        System.out.println("[1]Addizione");                             //opzione addizione
        System.out.println("[2]Sottrazione");                           //opzione sottrazione
        System.out.println("[3]Moltiplicazione");                       //opzione moltiplicazione
        System.out.println("[4]Modulo");                                //opzione modulo
        int opMatematica = opMat.nextInt();                               //inserimento risposta
        int secondoTermine = 10;                                          //secondo termine con cui verrà fatta l'operazione
        switch(opMatematica){                                             //switch operazioni
            case 1:
                System.out.println("La somma del tuo numero con 10 è: " + (n + secondoTermine));        //output prima operazione - addizione
                break;
            case 2:
                System.out.println("La sottrazione del tuo numero con 10 è: " + (n - secondoTermine));  //output seconda operazione - sottrazione
                break;
            case 3:
                System.out.println("La moltiplicazione del tuo numero con 10 è: " + (n * secondoTermine));//output terza operazione - moltiplicazione
                break;
            case 4:
                System.out.println("Il modulo del tuo numero con 10 è: " + (n % secondoTermine));          //output quarta operazione - modulo
                break;
            default:
                System.out.println("HAI SBAGLIATO!");                                                   //output errore

        }
        opMat.close();                                                                                      //chiudi scanner opMat

    }

    static void funzioniStringa(String parola){                                                           //funzione funzioneStringa
        Scanner scString = new Scanner(System.in);                                                        //scanner per input tipo funzione stringa

        System.out.println("Quale funzione stringa vuoi usare?");                                       //richiesta opzioni stringa
        System.out.println("[1]SubString");                                                             //output prima opzione - substring
        System.out.println("[2]Concatenamento");                                                        //output seconda opzione - concatenamento
        int sceltaString = scString.nextInt();                                                             //input opzione
        String secondaParola = "Ciao";                                                                     //seconda stringa con cui avverrà la funzione

        if (sceltaString == 1){                                                                             //se la scelta è la prima 
            String nuovaParolaSub = parola.substring(2);                                         //crea substring
            System.out.println("Parola concatenata: " + nuovaParolaSub);                                    //output substring
        }
        else if(sceltaString == 2){                                                                         //se la scelta è la seconda
            String nuovaParolaConc = parola.concat(secondaParola);                                          //crea concatenamento
            System.out.println("Parola concatenata: " + nuovaParolaConc);                                   //output nuova parola concatenata
        }
        else{                                                                                               //altrimenti
            System.out.println("HAI SBAGLIATO!");                                                         //output errore
        }

        scString.close();                                                                                   //chiudi scanner scString




    }

    static void castingInt(int num ){                                                                       //funzione castingInt per gli int

        System.out.println("Il numero in double: " + (double) num);                                         //output numero convertito in double
        System.out.println("Il numero in float: " + (float) num);                                           //output numero convertito in float

    }

    //Quà non ci sono molte conversioni da fare infatti stamperà solo la parola normale, in quanto non si può converitre da String a char

    static void castingString(String parola ){                                                              //funzione castingString per le stringhe

        System.out.println("La parola in string è: " + parola);                                             //output stringa "convertita"

    }

    static void castingBool(Boolean booleanWord ){                                                         //funzione castingBoolg

        System.out.println("Il tuo valore boolean: " + booleanWord);                                        //output valore boolean normale
        System.out.println("Il suo inverso: " + !booleanWord);                                              //output valore boolean negato

    }



}