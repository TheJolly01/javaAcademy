public class Main {

    int x = 5;
    int y;

    public static void main(String[] args){

        Main ciao = new Main();
        Main addio = new Main();

        System.out.println(ciao.x);

        addio.y = ciao.x;

        System.out.println(addio.y);


    }

}