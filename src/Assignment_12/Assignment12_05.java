//5.	Write a Java Program to print first N even natural numbers.
package Assignment_12;
import java.util.Scanner;
public class Assignment12_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Natural Number: ");
        while(!sc.hasNextInt())
            sc.next();
        int n= sc.nextInt();
        for(int i=1;i<=n*2;i++)
            System.out.print(i%2==0?i+" ":"");
    }
}
