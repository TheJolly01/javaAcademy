public class Main {

    public static void main(String[] args){
        int a = 10;
        int b = 10;
        int c =20;
        overloading(a, b, c);
    }
    public void noStat(int a){
        System.out.println(a);
    }
    public static void overloading(int a, int b){      //metodo con parametri overloading
        System.out.println(a + b);
    }
    public static void overloading(int a, int b, int c){   //metodo con parametri overloading
        System.out.println(a + b + c);
    }
    static void ciao(){ //metodo con parametri
        System.out.println("Ciao");
    }




}
