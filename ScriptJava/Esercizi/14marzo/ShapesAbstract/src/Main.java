import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        ShapeManager shapeManager = new ShapeManager();
        int risposta = 0;
        int sceltaForma = 0;

        do{
            try {
                risposta = inputInt("-----MENU-----\n[1]Inserisci forma\n[2]Stampa forme\n[3]Stampa totale aree\n[4]Stampa totale perimetri\n[5]Esci");
            } catch(Exception e){
                System.out.println("Operazione fallita");
            }
            switch(risposta){

                case 1:
                    try {
                        sceltaForma = inputInt("Quale forma vuoi creare?\n[1]Cerchio\n[2]Rettangolo");
                    } catch(Exception e){
                        System.out.println("Operazione fallita");
                    }
                    if(sceltaForma == 1){
                        double radiant = (Math.random() * 100);
                        Circle circle = new Circle(radiant);
                        shapeManager.addShape(circle);
                    } else if(sceltaForma == 2){
                        double width = (Math.random() * 100);
                        double height = (Math.random() * 100);
                        Rectangle rectangle = new Rectangle(width,height);
                        shapeManager.addShape(rectangle);
                    } else{
                        System.out.println("Errore, inserimento sbagliato");
                    }
                    break;

                case 2:
                    shapeManager.getShapes();
                    break;

                case 3:
                    shapeManager.getTotalArea();
                    break;

                case 4:
                    shapeManager.getTotalPerimeter();
                    break;

                case 5:
                    System.out.println("Arrivederci");
                    break;

                default:
                    System.out.println("Errore, inserimento sbagliato");
                    break;
            }
        }while(risposta != 5);
    }

    public static int inputInt(String stringa){
        Scanner scanner = new Scanner(System.in);
        System.out.println(stringa);
        return scanner.nextInt();
    }

}