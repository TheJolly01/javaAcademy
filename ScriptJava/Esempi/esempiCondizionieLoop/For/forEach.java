/*Un array è un elemento di aggregazione di più tipi uguali

    for each viene utilizzato esclusivamente per scorrere gli elementi in un array


*/

public class forEach {
    
        public static void main(String[] args){

            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            int[] power ={200, 100, 30, 220};
            int f = 0;
            
            for(String i : cars){
                System.out.print(i);
                System.out.println(" Potenza: " + power[f]);
                f++;
            }

        }

}

/*
 * for(type variableName : arrayName){
 *  //code block to be executed
 * }
 * 
 */
