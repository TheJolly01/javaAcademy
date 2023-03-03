public class Main {

    public static class Prova{
        int x = 55;
        boolean y = false;

        private boolean modifica(int a){

            boolean b;

            if(a > 50){
                b = true;
            }
            else{
                b = false;
            }
            return b;
        }
        private void unlocker(){

            if(y == true){
                y = false;
            }
            else{
                y = true;
            }
        }
    }

    public static void main(String[] args) {

        Prova prova1 = new Prova();
        Prova prova2 = new Prova();

        prova1.x = 55;
        prova2.x = 25;

        prova1.y = prova1.modifica(prova1.x);
        prova2.y = prova2.modifica(prova2.x);

        System.out.println(prova1.y);
        System.out.println(prova2.y);

        System.out.println(prova1.x + " " + prova2.y);

        System.out.println("Valore prima dell'unlocker: " + prova1.y);
        prova1.unlocker();
        System.out.println("Valore dopo l'unlocker: " + prova1.y);



    }
}