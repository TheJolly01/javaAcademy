public class Main {

    int modelYear;
    String modelName;
    int potenza;
    public Main(int year, String name){
        modelYear = year;
        modelName = name;
    }
    public Main(int year, String name, int pot){
        modelYear = year;
        modelName = name;
        potenza = pot;
    }

    public static void main(String[] args) {
        Main myCar = new Main(1969,"Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
        Main myCar2 = new Main(2000, "Banana", 2321);
        System.out.println(myCar2.potenza + " " + myCar2.modelYear + " " + myCar2.modelName);


    }
}