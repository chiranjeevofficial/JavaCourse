package Assignment_18;
class Circle{
    private double radius;
    static final private double pi;
    static{
        pi=3.14;
    }
    {
        radius=5;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return pi*radius*radius;
    }
}
public class Assignment18_02 {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.setRadius(4.3);
        System.out.println("Area of "+c.getRadius()+" radius circle is: "+c.getArea());
    }
}
