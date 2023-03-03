public class Main {
    public void fullThrottle(){
        System.out.println("La macchina sta andando al massimo, tra poco si sfonda pure");
    }
    public void speed(int maxSpeed){
        System.out.println("La velocità massima è: " + maxSpeed);
    }
    public void speed(int maxSpeed, int cilindrata){
        System.out.println("La velocità massima è: " + maxSpeed);
        System.out.println("Hai una cilindrata di: " + cilindrata);
    }

    public static void main(String[] args) {
        Main myCar = new Main(); // crea oggetto mycar
        myCar.fullThrottle(); //richiama metodo fullThrottle()
        myCar.speed(200); // richiama metodo speed()
    }
}