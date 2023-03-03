import java.util.Scanner;
public class Menu {

    Scanner panino = new Scanner(System.in);
    Scanner scIngredienti = new Scanner(System.in);
    Scanner nIngred = new Scanner(System.in);
    Scanner ingSing = new Scanner (System.in);
    Scanner ingred1 = new Scanner(System.in);
    Scanner ingred2 = new Scanner(System.in);

    public void StartMenu(){

        // fare booleani per controllo presenza carne e insalata;

        int sceltaPanino;
        int contoParziale;
        int contoTotale = 0;


        do {
            contoParziale = 0;
            PiattoSpeciale piattoSpeciale = new PiattoSpeciale();
            contoParziale = piattoSpeciale.getPrezzoBase();

            System.out.println("-----MENU PIATTO SPECIALE-----");
            System.out.println("[1] Panino con carne");
            System.out.println("[2] Panino con carne e insalata");
            System.out.println("[3] ESCI");
            sceltaPanino = panino.nextInt();


            switch(sceltaPanino){
                case 1:
                    piattoSpeciale.esisteCarne = true;
                    contoParziale += piattoSpeciale.getPrezzoCarne();
                    break;

                case 2:
                    piattoSpeciale.esisteCarne = true;
                    piattoSpeciale.esisteInsalata = true;
                    contoParziale += piattoSpeciale.getPrezzoCarne();
                    contoParziale += piattoSpeciale.getPrezzoInsalata();
                    break;

                case 3:
                    System.out.println("Arrivederci");
                    break;

                default:
                    System.out.println("Hai sbagliato, allora avrai un panino completo");
                    piattoSpeciale.esisteCarne = true;
                    contoParziale += piattoSpeciale.getPrezzoCarne();
                    piattoSpeciale.esisteInsalata = true;
                    contoParziale += piattoSpeciale.getPrezzoInsalata();
                    break;
            }
            if(sceltaPanino != 3) {
                System.out.println("Vuoi ingredienti aggiuntivi?\n[1]SI\n[2]NO");
                int sceltaIngredienti = scIngredienti.nextInt();

                if (sceltaIngredienti == 1) {

                    System.out.println("Quanti ingredienti vuoi?");
                    System.out.println("(MAX 2 INGREDIENTI)");
                    int nIngredienti = nIngred.nextInt();

                    if (nIngredienti == 1) {
                        System.out.println("Inserisci il nome dell'ingrediente");
                        String ingSingolo = ingSing.nextLine();

                        piattoSpeciale.setIngrediente1(ingSingolo);
                        piattoSpeciale.esisteIng1 = true;

                        contoParziale += piattoSpeciale.getPrezzo1();


                    } else if (nIngredienti == 2) {
                        System.out.println("Inserisci il nome del primo ingrediente");
                        String ingrediente1 = ingred1.nextLine();
                        System.out.println("Inserisci il nome del secondo ingrediente");
                        String ingrediente2 = ingred2.nextLine();

                        piattoSpeciale.setIngrediente1(ingrediente1);
                        piattoSpeciale.setIngrediente2(ingrediente2);
                        piattoSpeciale.esisteIng1 = true;
                        piattoSpeciale.esisteIng2 = true;
                        contoParziale += piattoSpeciale.getPrezzo1();
                        contoParziale += piattoSpeciale.getPrezzo2();

                    }
                }
                System.out.println("Questo panino ti costerà " + contoParziale + " euro");
                contoTotale += contoParziale;

                System.out.println("Il tuo panino è composto da:");
                if (piattoSpeciale.esisteCarne) {
                    System.out.println(piattoSpeciale.getCarne());
                }
                if (piattoSpeciale.esisteInsalata) {
                    System.out.println(piattoSpeciale.getInsalata());
                }
                if (piattoSpeciale.esisteIng1) {
                    System.out.println(piattoSpeciale.getIngrediente1());
                }
                if (piattoSpeciale.esisteIng2) {
                    System.out.println(piattoSpeciale.getIngrediente2());
                }
            }
        } while(sceltaPanino != 3);

        System.out.println("Il conto totale è di " + contoTotale + " euro");
    }

}
