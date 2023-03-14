import java.util.ArrayList;

public class ShapeManager {

    ArrayList<Shape> shape = new ArrayList<>();

    public void addShape(Shape shapeToAdd){
        shape.add(shapeToAdd);
    }

    public void getShapes(){
        for(int i = 0; i < shape.size(); i++){

            System.out.println(shape.get(i).getClass().getName());
            System.out.println("Area: " + shape.get(i).Area);
            System.out.println("Perimetro " + shape.get(i).Perimeter);
            System.out.println("--------------------------------------");
        }
    }

    public void getTotalArea(){
        double area = 0;
        for(int i = 0; i < shape.size(); i++){
            area += shape.get(i).Area;
        }
        System.out.println("Area di tutte le forme : "+ area);
    }

    public void getTotalPerimeter(){
        double perimetro = 0;
        for(int i = 0; i < shape.size(); i++){
            perimetro += shape.get(i).Perimeter;
        }
        System.out.println("Perimetro di tutte le forme : "+ perimetro);
    }




}
