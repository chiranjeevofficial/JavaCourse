//3.	Write a Java program to count digits in a given number.
//      if user give 123, then count value is ?
package Assignment_13;
import java.util.Scanner;
public class Assignment13_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        while(!sc.hasNextInt())
            sc.next();
        int n=sc.nextInt(), count=0;
        while(n>0){
            count++;
            n/=10;
        }
        System.out.println(count+" digits number");
    }
}
