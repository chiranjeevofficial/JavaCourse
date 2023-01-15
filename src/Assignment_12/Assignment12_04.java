//4.	Write a Java Program to print first N odd natural numbers in reverse order.
package Assignment_12;
import java.util.Scanner;
public class Assignment12_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Natural Number: ");
        int n=sc.nextInt();
        for(n*=2;n>0;n--)
            System.out.print(n%2!=0?n+" ":"");
    }
}
