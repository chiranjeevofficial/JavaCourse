//6.	Write a Java program to calculate sum of first N odd natural numbers.
package Assignment_13;
import java.util.Scanner;
public class Assignment13_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        while(!sc.hasNextInt())
            sc.next();
        int n=sc.nextInt();
        System.out.println("Sum of first "+n+" odd natural number is: "+(2*n*n)/2);
    }
}
