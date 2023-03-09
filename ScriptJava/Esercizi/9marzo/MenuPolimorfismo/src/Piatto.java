import java.util.ArrayList;

public class Piatto extends Ordinazione {

    private ArrayList<String> ingredienti;
    private String chef;

    // COSTRUTTORE
    //---------------------------------------------------------------
    public Piatto(ArrayList<String> ingredienti, int prezzo, String chef){
        super(prezzo);
        setIngredienti(ingredienti);
        setChef(chef);
    }
    //---------------------------------------------------------------



    // GETTER E SETTER
    //---------------------------------------------------------------
    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }
    public void setIngredienti(ArrayList<String> ingredienti) {
        this.ingredienti = ingredienti;
    }
    public String getChef() {
        return chef;
    }
    public void setChef(String chef) {
        this.chef = chef;
    }

    //---------------------------------------------------------------
}
