import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static ArrayList<Auto> arrAuto = new ArrayList<>();
    public static ArrayList<Moto> arrMoto = new ArrayList<>();

    public static void MenuPrincipale(){

        Auto auto = null;
        Moto moto = null;

        int scelta = inputInt("Vuoi un auto o una moto?\n[1]Auto\n[2]Moto");
        if(scelta == 1){

            String marca = inputString("Che marca è l'auto?");
            String modello = inputString("Che modello?");
            int annoFabbricazione = inputInt("Quando è stata fabbricata?");
            int numeroPorte= inputInt("Quante porte ha?");
            String tipoCarburante = inputString("Che carburante usa?");
            int consumoMedio = (int)(Math.random()*10);

            auto = new Auto(marca,modello,annoFabbricazione,numeroPorte,tipoCarburante,consumoMedio);
            arrAuto.add(auto);

        }else if(scelta == 2){

            String marca = inputString("Che marca è la tua moto?");
            String modello = inputString("Che modello?");
            int annoFabbricazione = inputInt("Quando è stata fabbricata?");
            int cilindrata = inputInt("Quanto è la sua cilindrata?");
            String tipologia = inputString("Che tipo di moto è?");
            int potenza = (int) (cilindrata / 2.3);

            moto = new Moto(marca,modello,annoFabbricazione,cilindrata,tipologia,potenza);
            arrMoto.add(moto);

        }else{
            System.out.println("Hai sbagliato");
        }
    }

    public static int inputInt(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextInt();
    }
    public static String inputString(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextLine();
    }


}
