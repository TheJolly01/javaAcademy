public class ifElseIf {
    public static void main(String[] args) {
        int time = 22; // variabile time
        if (time < 10) { // se la variabile time é minore di 10
            System.out.println("Good morning"); // stampa good morning
        } else if (time < 18) { // altrimenmti se la variabile time é minore di 18
            System.out.println("Good day"); // stampa good day
        } else { // altrimenti
            System.out.println("Good evening"); // stampa good evening
        }
    }
}
