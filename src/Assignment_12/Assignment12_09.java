//9.	Write a Java Program to print table of N.
package Assignment_12;
import java.util.Scanner;
public class Assignment12_09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Natural Number: ");
        while(!sc.hasNextInt())
            sc.next();
        int n=sc.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(n+" x "+i+" = "+n*i);
    }
}
