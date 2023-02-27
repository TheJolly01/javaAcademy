package ScriptJava.Esempi.esempiMetodi;

//esempio classe con un costruttore

public class triangolo {

    int lato1, lato2, lato3;

    public static void main(String[] args){

        int a = 10;
        triangolo tr = new triangolo(a);

        
        

    }


    
    private int id;
    public triangolo(int lato){

        this.lato1 = lato;
        this.lato2 = lato;
        this.lato3 = lato;
        
    }
    public triangolo(int lato1, int lato2){

        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato2;
        
    }
    public triangolo(int lato1, int lato2, int lato3){

        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;

    }


    public void perimetro(int lato1, int lato2, int lato3){

        int perimetro = lato1+lato2+lato3;

        System.out.println("Il perimetro è " + perimetro);

    }

    

}
