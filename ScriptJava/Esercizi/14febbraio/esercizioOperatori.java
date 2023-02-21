import java.util.Scanner;           //import scanner
    public class esercizioOperatori {           //apri classe 
        public static void main(String[] args){
            Scanner scanNum = new Scanner(System.in);       //nuovo oggetto Scanner
            Scanner scanMod = new Scanner(System.in);       //nuovo oggetto Scanner
            int numero;         //variabile contenente numero
            int modulo = 2;         //variabile contenente numero

            System.out.println("Inserisci il dividendo:");      //output inserisci dividendo
            numero = scanNum.nextInt();         //input dividendo

            
            int risultato = numero%modulo;
            Boolean pari = risultato==0;
            Boolean dispari = risultato ==1;

            System.out.println("Il numero è:");
            System.out.println("Pari: " + pari );
            System.out.println("Dispari " + dispari);

            scanNum.close();
            scanMod.close();
        }
    }