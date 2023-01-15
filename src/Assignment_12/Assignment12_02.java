//2.	Write a Java Program to print first N natural numbers in reverse order.1
package Assignment_12;
import java.util.Scanner;
public class Assignment12_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Natural Number: ");
        while(!sc.hasNextInt())
            sc.next();
        int n=sc.nextInt();
        while(n>0) {
            System.out.print(n + " ");
            n--;
        }
    }
}
