//Stampi i numeri dispari da 1 a 10 ma quando arriva a 8 si fermi

public class forBreak {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { // ciclo for usato per stampa numero dispari

            if ((i % 2) != 0) { // se il numero modulo 2 da resto diverso da 0
                System.out.println(i); // stampa numero
            }
            if (i == 8) { // se il numero è uguale a 8
                break; // esci dal ciclo
            }
        }

    }
}