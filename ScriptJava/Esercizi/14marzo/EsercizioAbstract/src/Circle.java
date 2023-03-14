public class Circle extends Shape{

    double radius;

    public Circle(double radius){
        this.radius = radius;
        getArea();
        getPerimeter();
    }


    @Override
    public void getArea() {
        Area = radius * radius * Math.PI;
    }
    @Override
    public void getPerimeter() {
        Perimeter = 2 * radius * Math.PI;
    }
}
