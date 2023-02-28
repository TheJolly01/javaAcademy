
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<String>();

        String[] arr = { "Ciao", "Addio", "Arrivedermi" };

        arrList = toArrListString(arr, arrList);

        System.out.println(arrList);

    }

    static ArrayList<String> toArrListString(String[] arr, ArrayList<String> arrList) {

        int lunghezzaArray = arr.length;
        int i;
        String x;

        arrList.clear();

        for (i = 0; i < lunghezzaArray; i++) {

            x = arr[i];

            arrList.add(arr[i]);
        }
        return arrList;
    }

}
