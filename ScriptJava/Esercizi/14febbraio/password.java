import java.util.Scanner; // import the Scanner class 

public class password {
    
    public static void main(String[] args){

            Scanner nickname = new Scanner(System.in);
            System.out.print("Inserisci il nome utente: ");
            String nick = nickname.nextLine();

        if( nick.equals("Marco")){

                Scanner eta = new Scanner(System.in);
                System.out.print("Inserisci il nome utente: ");
                int anni = eta.nextInt();

            if(anni > 10 && anni < 20 ){

                Scanner password = new Scanner(System.in);
                System.out.print("Inserisci il nome utente: ");
                String pass = password.nextLine();

                if(pass.equals("banana")){

                    System.out.println("Bravissimo, 5 euro!");
                    nickname.close();
                    eta.close();
                    password.close();

                }
                
                    else{
                        System.out.println("Password sbagliata");
                        nickname.close();
                        eta.close();
                        password.close();
                }

            }
                else{
                    System.out.println("Età sbagliata");
                        nickname.close();
                        eta.close();
            }
                
                
            }
            else{
                System.out.println("Nome sbagliato");
                nickname.close();
                
            }




    }
}
