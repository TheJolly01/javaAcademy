import java.util.Scanner; // import the Scanner class

public class conversioniProva {  //open class conversioniGenerali
    public static void main(String[] args) {    //main function
        Scanner num = new Scanner(System.in);   //create Scanner object for numbers
        int num_input;                          //int variable
        // Enter number to convert
        System.out.println("Enter number");      //output request number
        num_input = num.nextInt();                  //input number requested
        double conversione_double = num_input;      //conversion from int to double
        float conversione_float = (float) num_input; //conversion from int to float
        // output numbers
        System.out.println("double: " + conversione_double); //output double number
        System.out.println("float: " + conversione_float);   //output float number
        

        Scanner stringa = new Scanner(System.in);   //create Scanner object for String
        String stringa_input;                       //String variable
        

        // Enter String
        System.out.println("Enter String");      //output request String
        stringa_input = stringa.nextLine();         //input String requested
        char prima_lettera = stringa_input.charAt(0);   //take char from String at index 0
        //Output Char
        System.out.println("Prima lettera è: " + prima_lettera); //output char at index 0

        // prova boolean
        
        Scanner booleanScan = new Scanner(System.in);         //create Scanne object for boolean

        boolean prova_boolean;
        System.out.println("Enter Boolean (true o false)"); //output boolean request
        prova_boolean = booleanScan.nextBoolean();            //input requested boolean
        
        System.out.println(prova_boolean);                      //output bool variable
        System.out.print(!prova_boolean);                       //output inverted bool variable
        num.close();                                            //close Scanner num
        stringa.close();                                        //close Scanner stringa
        booleanScan.close();                                    //close Scanner booleanScan
    }

}