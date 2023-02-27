package ScriptJava.Esempi.esempiOggetti;

public class Oggetti {
    
    int x = 5;
    int y;

    public static void main(String[] args){

        Oggetti ciao = new Oggetti();
        Oggetti addio = new Oggetti();

        System.out.println(ciao.x);

        addio.y = ciao.x;

        System.out.println(addio.y);


    }

}
