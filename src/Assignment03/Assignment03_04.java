//4. Write a program to calculate sum of the digits of a given number.
package Assignment03;
public class Assignment03_04 {
    public static void main(String []args){
        int x=123;
        x=x/100+x/10%10+x%10;
        System.out.println(x); //sum=6
    }
}
