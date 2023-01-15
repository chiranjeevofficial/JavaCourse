//10.	Write a Java program to calculate factorial of a number.
package Assignment_13;
import java.util.Scanner;
public class Assignment13_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        while(!sc.hasNextInt())
            sc.next();
        int n=sc.nextInt(), fact=1;
        while(n>0){
            fact*=n;
            n--;
        }
        System.out.println("Factorial of given number is: "+fact);
    }
}
