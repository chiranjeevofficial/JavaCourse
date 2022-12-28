//1.	Define a class Complex to represent a complex number. Declare instance member variables to store real and
//      imaginary part of a complex number, also define instance member functions to set values of complex number
//      and print values of complex number.
package Assignment_07;
class Complex{
    int real, img;
    void setData(int x, int y){
        real=x;
        img=y;
    }
    void showData(){
        System.out.println(real+"+"+img+"i");
    }
}
public class Assignment07_01 {
    public static void main(String []args){
        Complex c1=new Complex();
        c1.setData(2,5);
        c1.showData();
    }
}
