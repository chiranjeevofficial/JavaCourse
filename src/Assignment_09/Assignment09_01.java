// 1. Define a class Circle with member variable radius. Provide methods like, setRadius, getRadius, getArea, getCircumference. Use wrapper classes instead of primitives.
package Assignment_09;
class Circle{
    Integer radius;
    void setRadius(Integer Radius){
        radius=Radius;
    }
    Integer getRadius(){
        return radius;
    }
    Float getArea(){
        return (float)(3.14*radius*radius);
    }
    Float getCircumference(){
        return (float)(2*3.14*radius);
    }
}
public class Assignment09_01{
    public static void main(String[] args) {
        Circle c=new Circle();
        c.setRadius(12);
        System.out.println("Area is: "+c.getArea());
    }
}