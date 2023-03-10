import java.util.Scanner;

public class Menu {

    public static double menuCalcolatrice(){
        double risultato = 0;
        int selezioneMenu;

        do {
            selezioneMenu = inputInt("Quale operazione vuoi eseguire?\n[1]SOMMA\n[2]DIFFERENZA\n[3]PRODOTTO");
            switch (selezioneMenu) {
                case 1:
                    try {
                        double addendo1 = inputDouble("Inserisci il primo addendo");
                        double addendo2 = inputDouble("Inserisci il secondo addendo");
                        return risultato = Calcolatrice.addizione(addendo1, addendo2);
                    } catch (Exception e) {
                        System.out.println("Operazione non permessa");
                    }
                    break;

                case 2:
                    try {
                        double numero1 = inputDouble("Inserisci il primo valore");
                        double numero2 = inputDouble("Inserisci il secondo valore");
                        if (numero1 > numero2) {
                            return risultato = Calcolatrice.sottrazione(numero1, numero2);
                        } else {
                            return risultato = Calcolatrice.sottrazione(numero2, numero1);
                        }
                    } catch (Exception e) {
                        System.out.println("Operazione non permessa");
                    }
                    break;

                case 3:
                    try {
                        double fattore1 = inputDouble("Inserisci il primo fattore");
                        double fattore2 = inputDouble("Inserisci il secondo fattore");
                        return risultato = Calcolatrice.moltiplicazione(fattore1, fattore2);
                    } catch (Exception e) {
                        System.out.println("Operazione non permessa");
                    }
                    break;

                default:
                    System.out.println("Operazione non esistente");
                    break;
            }
        }while(selezioneMenu > 0 && selezioneMenu < 4);

        return 0;
    }

    public static double inputDouble(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextDouble();
    }

    public static int inputInt(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextInt();
    }

}
