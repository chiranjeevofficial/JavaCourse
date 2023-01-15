//5.	Write a Java program to calculate sum of first N natural numbers.
package Assignment_13;
import java.util.Scanner;
public class Assignment13_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        while(!sc.hasNextInt())
            sc.next();
        int n=sc.nextInt();
        System.out.println("Sum of first "+n+" is: "+(n*(n+1))/2);
    }
}
