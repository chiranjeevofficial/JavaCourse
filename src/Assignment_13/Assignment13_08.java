//8.	Write a Java program to calculate sum of squares of first N natural numbers.
package Assignment_13;
import java.util.Scanner;
public class Assignment13_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        while(!sc.hasNextInt())
            sc.next();
        int n=sc.nextInt(), sum=0;
        for(int i=1;i<=n;i++)
            sum+=i*i;
        System.out.println("Sum of squares of first "+n+" number is: "+sum);
    }
}
