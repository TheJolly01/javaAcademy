package ScriptJava.Esempi.esempiMetodi;

public class metodiStaticiENon {

    static String hello = "Ciao";

    


    public static void main(String[] args){

        String bye = "Addio";

        bye = addio(bye);

        metodiStaticiENon mm = new metodiStaticiENon();

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
