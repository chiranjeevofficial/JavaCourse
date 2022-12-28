//4. Write a program to swap values of two int variables without using third variable.
package Assignment02;
public class Assignment02_04 {
    public static void main(String []args){
        int a=2, b=3;
        System.out.println("a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" b="+b);
    }
}
