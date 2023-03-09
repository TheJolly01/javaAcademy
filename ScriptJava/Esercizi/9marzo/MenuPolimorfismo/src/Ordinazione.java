public class Ordinazione {

    private int prezzo;
    private int totale;



    // COSTRUTTORE
    //---------------------------------------------------------------
    public Ordinazione(int prezzo) {
        setPrezzo(prezzo);
        setTotale(0);
    }
    //---------------------------------------------------------------



    // METODO CALCOLO TOTALE
    //---------------------------------------------------------------
    public void calcoloTotale(){
        int totale = getTotale();
        totale += getPrezzo();
        setTotale(totale);
    }
    //---------------------------------------------------------------



    // GETTER E SETTER
    //---------------------------------------------------------------
    public int getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    public int getTotale(){return totale;}
    public void setTotale(int totale) {this.totale = totale;}

    //---------------------------------------------------------------

}
