public class Admin {

    Utente utente;
    private int pin;

    public Admin(Utente utente, int pin){
        this.utente = utente;
        this.pin = pin;
    }

    // GETTER
    public int getPin() {
        return pin;
    }

    // SETTER
    public void setPin(int pin) {
        this.pin = pin;
    }
}
