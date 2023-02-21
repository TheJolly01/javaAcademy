public class forEs {
    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) { // ciclo for per stampa i

            System.out.println(i); // stampa i
        }

        for (int f = 0; f <= 2; f++) { // ciclo for per stampa f e j
            System.out.println("Outer: " + f); // stampa f

            // Inner input
            for (int j = 1; j <= 3; j++) { // ciclo for per stampa j
                System.out.println("Inner: " + j); // stampa j
            }
        }

    }
}
