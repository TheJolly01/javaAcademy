import java.util.ArrayList;

public class Gestore {

    ArrayList<String> tipi = new ArrayList<>();

    public void convertInt(int n){
        addToArrayList(Integer.toString(n));
    }

    public void addToArrayList(String n){
        tipi.add(n);
    }
}
