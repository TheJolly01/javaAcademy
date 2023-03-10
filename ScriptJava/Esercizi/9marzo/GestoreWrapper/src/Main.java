public class Main {
    public static void main(String[] args) {

        Gestore gestore = new Gestore();
        int x = 15;
        gestore.convertInt(x);
        Prova y = new Prova();

        gestore.addToArrayList(y.toString());

        System.out.println(gestore.tipi.get(1));

        System.out.println(gestore.tipi);
    }
}