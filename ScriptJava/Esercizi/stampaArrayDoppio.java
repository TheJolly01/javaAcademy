public class stampaArrayDoppio {
    public static void main(String[] args){
        
        int n = 4;
        int f = 0;
        int[] numb = {3, 5, 5, 8};
        String[] words = {"Ciao", "Addio", "Pueblo", "Presepe"};

        for(int i = 0; i< n; i++){
            System.out.print(numb[i] + " ");
            System.out.println(words[i]);
        }

        for(int i : numb){
            System.out.println(i + " " + words[f] + " ");
            f++;
        }
    }
}