public class Veicolo {

    private String marca;
    private String modello;
    private int annoFabbricazione;

    public Veicolo (String marca, String modello, int annoFabbricazione){
        setMarca(marca);
        setModello(modello);
        setAnnoFabbricazione(annoFabbricazione);
    }

    void stampaVeicolo(Veicolo veicolo){
        System.out.println("IL TUO VEICOLO:");
        System.out.println("Marca: " + veicolo.getMarca());
        System.out.println("Modello: " + veicolo.getModello());
        System.out.println("Anno di fabbricazione: " + veicolo.getAnnoFabbricazione());
    }



    // GETTER E SETTER MARCA
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // GETTER E SETTER MODELLO
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }

    // GETTER E SETTER ANNO FABBRICAZIONE
    public int getAnnoFabbricazione() {
        return annoFabbricazione;
    }
    public void setAnnoFabbricazione(int annoFabbricazione) {
        this.annoFabbricazione = annoFabbricazione;
    }
}
