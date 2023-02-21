import java.util.Scanner;       //importa libreria Scanner
    public class provaCalcolatrice {
        public static void main(String[] args){
            Scanner operazione = new Scanner(System.in);    //oggetto scanner per operazione da eseguire

            System.out.println("Quale operazione vuoi fare?");  //richiesta operazione
            String operDaEseguire = operazione.nextLine();    //inserimento operazione da fare


            if (operDaEseguire.equals("somma")){
                Scanner primoTermine = new Scanner(System.in);  //oggetto scanner per termine 1
                Scanner secondoTermine = new Scanner(System.in); //oggetto scanner per termine 2

                System.out.println("Qual'è il primo termine?");
                int termine1 = primoTermine.nextInt(); //primo termine da eseguire
                System.out.println("Qual'è il secondo termine?");
                int termine2 = secondoTermine.nextInt(); //secondo termine da eseguire

                System.out.println(termine1 + termine2);    // stampa somma termini

                primoTermine.close();   //chiude Scanner primoTermine
                secondoTermine.close(); //chiude Scanner secondoTermine
            }


            else if (operDaEseguire.equals("sottrazione")){
                Scanner primoTermine = new Scanner(System.in);  //oggetto scanner per termine 1
                Scanner secondoTermine = new Scanner(System.in); //oggetto scanner per termine 2

                System.out.println("Qual'è il primo termine?");
                int termine1 = primoTermine.nextInt(); //primo termine da eseguire
                System.out.println("Qual'è il secondo termine?");
                int termine2 = secondoTermine.nextInt(); //secondo termine da eseguire

                System.out.println(termine1 - termine2);    //stampa sottrazione termini

                primoTermine.close();   //chiude Scanner primoTermine
                secondoTermine.close(); //chiude Scanner secondoTermine
            }


            else if (operDaEseguire.equals("moltiplicazione")){
                
                Scanner primoTermine = new Scanner(System.in);  //oggetto scanner per termine 1
                Scanner secondoTermine = new Scanner(System.in); //oggetto scanner per termine 2

                System.out.println("Qual'è il primo termine?");
                int termine1 = primoTermine.nextInt(); //primo termine da eseguire
                System.out.println("Qual'è il secondo termine?");
                int termine2 = secondoTermine.nextInt(); //secondo termine da eseguire

                System.out.println(termine1 * termine2);    //stampa moltiplicazione termini

                primoTermine.close();   //chiude Scanner primoTermine
                secondoTermine.close(); //chiude Scanner secondoTermine
            }


            else if (operDaEseguire.equals("modulo")){
                Scanner primoTermine = new Scanner(System.in);  //oggetto scanner per termine 1
                Scanner secondoTermine = new Scanner(System.in); //oggetto scanner per termine 2

                System.out.println("Qual'è il primo termine?");
                int termine1 = primoTermine.nextInt(); //primo termine da eseguire
                System.out.println("Qual'è il secondo termine?");
                int termine2 = secondoTermine.nextInt(); //secondo termine da eseguire

                System.out.println(termine1 % termine2);    //stampa moltiplicazione termini

                primoTermine.close();   //chiude Scanner primoTermine
                secondoTermine.close(); //chiude Scanner secondoTermine
            }
            operazione.close(); //chiude Scanner secondoTermine
        }
    }
