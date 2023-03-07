public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.getModelName());

        Trattori trattore = new Trattori();
        trattore.honk();
        System.out.println(trattore.brand + " " + trattore.getModelName());
    }
}