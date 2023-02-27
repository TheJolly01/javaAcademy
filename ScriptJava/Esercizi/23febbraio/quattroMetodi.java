import java.util.Scanner;

public class quattroMetodi{

    public static void main(String[] args) {

        int w = 123;
        double x = 23.7;
        String y = "Buongiorno";
        boolean z = true;

        Scanner newScan = new Scanner(System.in);

        int a;
        double b;
        String c;
        boolean d;

        a = metodoInt(w);
        b = metodoDouble(x);
        c = metodoString(y);
        d = metodoBool(z);

        System.out.println("Cosa vuoi stampare?");
        System.out.println("[1] int");
        System.out.println("[2] double");
        System.out.println("[3] string");
        System.out.println("[4] boolean");
        int scanner = newScan.nextInt();

        switch (scanner) {

            case 1:

                System.out.println(a);

                break;

            case 2:

                System.out.println(b);

                break;

            case 3:

                System.out.println(c);

                break;

            case 4:

                System.out.println(d);

                break;

        }

    }

    static int metodoInt(int x) {

        int i = x + 13;

        return i;

    }

    static double metodoDouble(double x) {

        double i = x + 23.65;

        return i;

    }

    static String metodoString(String x) {

        String i = x + "stringa";

        return i;

    }

    static boolean metodoBool(boolean x) {

        boolean i = x;

        return i;

    }

}
