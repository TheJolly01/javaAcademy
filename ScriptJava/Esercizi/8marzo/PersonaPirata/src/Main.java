public class Main {
    public static void main(String[] args) {
        Persona mario = new Persona("Mario");
        Persona carlo = new Persona("Carlo");
        Persona jack = new Pirata("Jack");
        mario.saluta();
        carlo.saluta();
        jack.saluta();
        jack = (Persona) jack;
        (Persona) jack.saluta();

    }
}