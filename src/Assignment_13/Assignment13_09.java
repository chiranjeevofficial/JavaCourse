//9.	Write a Java program to calculate sum of the digits of a given number.
package Assignment_13;
import java.util.Scanner;
public class Assignment13_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        while(!sc.hasNextInt())
            sc.next();
        int n=sc.nextInt(), sum=0;
        while(n>0){
            sum=n%10+sum;
            n/=10;
        }
        System.out.println("Sum of digits of given number is: "+sum);
    }
}
