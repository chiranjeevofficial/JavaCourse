//4.	Write a Java program to reverse a number.
package Assignment_13;
import java.util.Scanner;
public class Assignment13_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        while(!sc.hasNextInt())
            sc.next();
        int n=sc.nextInt(), rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        System.out.println("Reverse: "+rev);
    }
}
