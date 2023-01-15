//2.	Write a Java program to find the greatest among three given numbers.
package Assignment_13;
import java.util.Scanner;
public class Assignment13_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        while(!sc.hasNextInt())
            sc.next();
        int a=sc.nextInt();
        while(!sc.hasNextInt())
            sc.next();
        int b=sc.nextInt();
        while(!sc.hasNextInt())
            sc.next();
        int c=sc.nextInt();
        if(a>b&&a>c)
            System.out.println(a+" is Greatest Number");
        else if(b>a&&b>c)
            System.out.println(b+" is Greatest Number");
        if(c>a&&c>b)
            System.out.println(c+" is Greatest Number");
    }
}
