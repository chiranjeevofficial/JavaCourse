//9. Write a program to reverse a three-digit number.
package Assignment03;
public class Assignment03_09 {
    public static void main(String []args){
        int x=123;
        x=x%10*100+x/10%10*10+x/100;
        System.out.println(x);    //321
    }
}
