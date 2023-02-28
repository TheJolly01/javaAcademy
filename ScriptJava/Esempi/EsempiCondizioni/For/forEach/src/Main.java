/*Un array è un elemento di aggregazione di più tipi uguali
 * for each viene utilizzato esclusivamente per scorrere gli elementi in un array
 */

public class Main {

    public static void main(String[] args) {

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" }; // dichiarazione e inizializzazione array stringa
        int[] power = { 200, 100, 30, 220 }; // dichiarazione e inizializzazione array numeri
        int f = 0; // dichiarazione indice f

        for (String i : cars) { // for per scorrimento array cars
            System.out.print(i); // stampa elemento array cars
            System.out.println(" Potenza: " + power[f]); // stampa elemento array power
            f++; // incrementa indice f
        }

    }

}