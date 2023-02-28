package Assignment_17;
class Circle{
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }
}
class ThickCircle extends Circle{
    double thickness;

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public double getThickness() {
        return thickness;
    }

    public double getArea(){
        return 3.14*thickness*thickness;
    }
}
public class Assignment17_01 {
    public static void main(String[] args) {
        //Namaste Java
    }
}
