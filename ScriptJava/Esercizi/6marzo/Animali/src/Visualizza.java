public class Visualizza {

    // QUESTO METODO SERVE PER VISUALIZZARE TUTTI GLI ANIMALI USANDO I METODI GIÀ PRESENTI NELLE RECIPROCHE CLASSI
    public static void visualizzaCompleto(Felini felini, Canidi canidi, Anfibi anfibi, Roditori roditori, Altro altro){

        felini.stampaFelini();
        canidi.stampaCanidi();
        anfibi.stampaAnfibi();
        roditori.stampaRoditori();
        altro.stampaAltro();

    }



}
