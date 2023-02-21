public class testArray {
    public static void main(String[] args){
        int[] arrayProva = {3, 5, 5, 8};

        metodo(arrayProva);
    }

    static void metodo(int[] arrayProva){
        int i;
        int n = 4;
        for (i = 0; i<n; i++){
            System.out.println("Ecco il numero: " + arrayProva[i]);

        }
    }
}
