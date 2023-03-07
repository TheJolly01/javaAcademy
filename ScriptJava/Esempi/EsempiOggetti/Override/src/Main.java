public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println(s.tipoTasso());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println(i.tipoTasso());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
        System.out.println(a.tipoTasso());

    }
}