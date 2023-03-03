public class PiattoSpeciale {

    private String ingrediente1;
    public boolean esisteIng1;
    private final int prezzo1 = 2;
    private final int prezzo2 = 3;
    private String ingrediente2;
    public boolean esisteIng2;
    private final int prezzoBase = 1;
    private final String insalata = "Insalata";
    public boolean esisteInsalata;
    private final int prezzoInsalata = 2;
    private final String carne = "Carne";
    public boolean esisteCarne;
    private final int prezzoCarne = 2;

    public PiattoSpeciale() {
        esisteIng1 = false;
        esisteIng2 = false;
        esisteCarne = false;
        esisteInsalata = false;
    }

    public String getIngrediente1() {
        return ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente1(String ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public void setIngrediente2(String ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public int getPrezzo1() {
        return prezzo1;
    }
    public int getPrezzoBase() {
        return prezzoBase;
    }
    public int getPrezzoInsalata() {
        return prezzoInsalata;
    }
    public int getPrezzoCarne() {
        return prezzoCarne;
    }
    public int getPrezzo2(){
        return prezzo2;
    }

    public String getCarne(){
        return carne;
    }
    public String getInsalata(){
        return insalata;
    }




}
