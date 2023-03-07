public class Auto extends Veicolo {

    private int numeroPorte;
    private String tipoCarburante;
    private int consumoMedio;

    public Auto(String marca, String modello, int annoFabbricazione, int numeroPorte, String tipoCarburante, int consumoMedio) {
        super(marca, modello, annoFabbricazione);
        setNumeroPorte(numeroPorte);
        setTipoCarburante(tipoCarburante);
        setConsumoMedio(consumoMedio);
    }
    public void stampaVeicolo(Auto auto) {
        super.stampaVeicolo(auto);
        System.out.println("Numero porte: " + auto.getNumeroPorte());
        System.out.println("Tipo carburante: " + auto.getTipoCarburante());
        System.out.println("Consumo medio: " + auto.getConsumoMedio());
    }

    // GETTER E SETTER NUMERO PORTE
    public int getNumeroPorte() {
        return numeroPorte;
    }
    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    // GETTER E SETTER TIPO CARBURANTE
    public String getTipoCarburante() {
        return tipoCarburante;
    }
    public void setTipoCarburante(String tipoCarburante) {
        this.tipoCarburante = tipoCarburante;
    }

    // GETTER E SETTER CONSUMO MEDIO
    public int getConsumoMedio() {
        return consumoMedio;
    }
    public void setConsumoMedio(int consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
}
