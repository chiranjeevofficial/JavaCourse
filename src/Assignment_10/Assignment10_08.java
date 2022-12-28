// 8.	Write a Java program to calculate sum of digits of a given numbers. Num-bers are provided through command line. Print all the numbers and sum of its digits.
package Assignment_10;
public class Program08 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]), sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("Sum of digits is: "+sum);
    }
}
