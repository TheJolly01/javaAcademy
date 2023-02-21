public class fibonacci {
    
    public static void main(String[] args){
        int numero1 = 0;
        int numero2 = 1;
        int numero = 0;
        int nVolte = 20;

        for (int i=0; i<nVolte; i++){

            numero= numero1 + numero2;
            numero1 = numero2;
            numero2 = numero;

            System.out.println(numero);

        }





    }

}