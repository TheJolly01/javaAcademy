public class getLenghtString {
    public static void main(String[] args){
        String stringa = "Ciao a tutti";
        int length;
        length = GetStringLenght(stringa);
        System.out.println("La lunghezza della stringa è:" + length);

    }
    static int GetStringLenght(String stringInseritaString){
        return stringInseritaString.length();
    }
}
