public class forEs {
    public static void main(String[] args){

        for(int i = 0; i<9; i++){

            System.out.println(i);
        }

        for (int f = 0; f <= 2; f++){
            System.out.println("Outer: " + f); // Executes 2 times

            //Inner input
            for(int j = 1; j <= 3; j++) {
                System.out.println("Inner: " + j); //Executes 6 times 2*3
            }
        }



    }
}
