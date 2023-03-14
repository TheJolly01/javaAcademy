public class Rectangle extends Shape{

    double width;
    double heaight;

    public Rectangle(double width, double height){
        this.width = width;
        this.heaight = height;
        getArea();
        getPerimeter();
    }

    @Override
    public void getArea() {
        Area = width * heaight;
    }
    @Override
    public void getPerimeter() {
        Perimeter = 2 * width + 2 * heaight;
    }


}