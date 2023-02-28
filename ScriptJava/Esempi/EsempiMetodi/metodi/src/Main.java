public class Main {

    public static void main(String[] args){

        int a;
        String b;
        double c;
        boolean d;
        char e;
        int[] arr;
        int n = 8;


        noPar();
        String nome = "Antonio";
        siPar(nome);

        a = ciao();
        b = addio();
        c = arriv();
        d = wow();
        e = brr();
        arr = cus();

        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
        System.out.println("Array:");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }


    }



    static void noPar(){
        System.out.println("Ciao");
    }

    static void siPar(String nome){
        System.out.println("Ciao " + nome);
    }

    static int ciao(){

        int n = 10;

        return n;
    }

    static String addio(){

        String n = "Banana";

        return n;
    }
    static double arriv(){

        double n = 17.23;

        return n;
    }
    static boolean wow(){

        boolean n = true;

        return n;
    }
    static char brr(){

        char n = 'c';

        return n;
    }


    static int[] cus(){

        int[] n = {0,1,2,3,4,5,6,7};

        return n;
    }



}

