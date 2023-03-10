public class Main {
    public static void main(String[] args) {

        Calcolatrice calcolatrice = new Calcolatrice();
        int risposta;
        int contatore = 0;
        try {
            do {
                risposta = Menu.inputInt("Vuoi effettuare un operazione?\n[1]Si\n[2]ESCI");
                if (risposta == 1) {
                    if ( contatore >= calcolatrice.risultati.length) {
                        throw new ArrayIndexOutOfBoundsException("Limite massimo raggiunto");
                    } else {
                        calcolatrice.risultati[contatore] = Menu.menuCalcolatrice();
                        contatore ++;
                    }
                }
                if (risposta < 1 || risposta > 2) {
                    System.out.println("Risposta non valida");
                }
            } while (risposta != 2);
        } catch(Exception e){
            System.out.println("Errore in fase di utilizzo");
        }



    }
}