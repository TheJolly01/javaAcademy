import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner rispMenu = new Scanner(System.in);
        Scanner rispNomeUtente = new Scanner(System.in);
        Scanner rispPiatti = new Scanner(System.in);
        Utente utente = null;
        String nomeUtente;
        int rispostaMenu;
        int rispostaPiatti;

        Piatto piatto1 = new Piatto("Pasta alla carbonara", 15, "Primo");
        Piatto piatto2 = new Piatto("Pasta alla panna", 20, "Primo");
        Piatto piatto3 = new Piatto("Maialetto arrosto", 50, "Secondo");
        Conto conto = new Conto();


        do{
            System.out.println("Vuoi entrare?");
            System.out.println("[1]ENTRA");
            System.out.println("[2]ESCI");
            rispostaMenu = rispMenu.nextInt();

            if(rispostaMenu == 1){

                System.out.println("Inserisci il Nome Utente");
                nomeUtente = rispNomeUtente.nextLine();
                utente = new Utente(nomeUtente);

                do{
                    System.out.println("Quale piatto vuoi ordinare?");
                    System.out.println("[1] " + piatto1.nome);
                    System.out.println("[2] " + piatto2.nome);
                    System.out.println("[3] " + piatto3.nome);
                    System.out.println("[4] ESCI");
                    rispostaPiatti = rispPiatti.nextInt();

                    if(rispostaPiatti == 1){
                        if(utente.budget > piatto1.prezzo){
                            System.out.println("Hai ordinato il piatto con successo");
                            utente.budget -= piatto1.prezzo;
                            conto.contoMomentaneo += piatto1.prezzo;
                        } else{
                            System.out.println("HAI FINITO I SOLDI, IL TUO  BUDGET RESIDUO È: " + utente.budget);
                        }
                    }
                    if(rispostaPiatti == 2){
                        if(utente.budget > piatto2.prezzo){
                            System.out.println("Hai ordinato il piatto con successo");
                            utente.budget -= piatto2.prezzo;
                            conto.contoMomentaneo += piatto2.prezzo;
                        }else{
                            System.out.println("HAI FINITO I SOLDI, IL TUO  BUDGET RESIDUO È: " + utente.budget);
                        }
                    }
                    if(rispostaPiatti == 3){
                        if(utente.budget > piatto2.prezzo){
                            System.out.println("Hai ordinato il piatto con successo");
                            utente.budget -= piatto3.prezzo;
                            conto.contoMomentaneo += piatto3.prezzo;
                        }else{
                            System.out.println("HAI FINITO I SOLDI, IL TUO  BUDGET RESIDUO È: " + utente.budget);
                        }


                    }
                }while(rispostaPiatti != 4);
            }
            conto.contoTotale += conto.contoMomentaneo;
            conto.contoMomentaneo = 0;
            if(rispostaMenu == 1) {
                System.out.println("Arrivederci " + utente.nome);
            }
        }while(rispostaMenu != 2);

        System.out.println("Il conto totale è di: " + conto.contoTotale);

    }
}
