//Stampi i numeri dispari da 1 a 10 ma quando arriva a 8 si fermi


public class forBreak {
    public static void main(String[] args){

        for(int i = 0; i<10; i++){
            
            if((i%2) != 0){
                System.out.println(i);
            }
            if(i == 8){
                break;
            }
        }


    }
}