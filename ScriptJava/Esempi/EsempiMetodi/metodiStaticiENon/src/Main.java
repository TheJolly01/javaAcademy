public class Main {

    static String hello = "Ciao";




    public static void main(String[] args){

        String bye = "Addio";

        bye = addio(bye);

        Main mm = new Main();

        mm.ciao(bye);


    }


    void ciao(String hello){

        hello = hello + " my man";

        System.out.println(hello);

    }


    static String addio(String bye){

        bye = bye + " bye";

        return bye;

    }


}
