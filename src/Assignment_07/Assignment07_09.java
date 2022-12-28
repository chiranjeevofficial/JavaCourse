//9.	Define a class Circle with radius as member variable. Provide methods to set radius value,
//      calculate area and calculate circumference.
package Assignment_07;
class Circle{
    float radius;
    void setRadius(float Radius){
        radius=Radius;
    }
    float calculateArea(){
        return (float)(3.14*radius*radius);
    }
    float calculateCircumference(){
        return (float)(2*3.14*radius);
    }
}
public class Assignment07_09 {
    public static void main(String []args){
        Circle c1=new Circle();
        c1.setRadius(12);
        System.out.println("Area of Circle is: "+c1.calculateArea());
        System.out.println("Circumference of circle is: "+c1.calculateCircumference());
    }
}
