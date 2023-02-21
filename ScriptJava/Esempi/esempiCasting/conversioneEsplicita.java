public class conversioneEsplicita {
    public static void main(String[] args){
        float d = (float) 10.85;
        System.out.println(d);
        d = arrotonda(d);
        System.out.println(d);



    }
    static int arrotonda(float value){
        return(int)(value + 0.5);
    }
}
