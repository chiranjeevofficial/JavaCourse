//1.	Write a Java program to check whether a given number is even or odd.
package Assignment_13;
import java.util.Scanner;
public class Assignment13_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        while(!sc.hasNextInt())
            sc.next();
        int n= sc.nextInt();
        System.out.println(n%2==0?"Even Number":"Odd Number");
    }
}
