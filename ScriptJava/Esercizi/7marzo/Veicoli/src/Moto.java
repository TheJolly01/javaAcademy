public class Moto extends Veicolo{

    private int cilindrata;
    private String tipologia;
    private int potenza;

    public Moto(String marca, String modello, int annoFabbricazione, int cilindrata, String tipologia, int potenza) {
        super(marca, modello, annoFabbricazione);
        setCilindrata(cilindrata);
        setTipologia(tipologia);
        setPotenza(potenza);
    }

    public void stampaVeicolo(Moto moto) {
        super.stampaVeicolo(moto);
        System.out.println("Cilindrata: " + moto.getCilindrata());
        System.out.println("Tipologia: " + moto.getTipologia());
        System.out.println("Potenza: " + moto.getPotenza());
    }

    // GETTER E SETTER CILINDRATA
    public int getCilindrata() {
        return cilindrata;
    }
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    // GETTER E SETTER TIPOLOGIA
    public String getTipologia() {
        return tipologia;
    }
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    // GETTER E SETTER POTENZA
    public int getPotenza() {
        return potenza;
    }
    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }
}
