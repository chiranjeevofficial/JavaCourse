// 1.	Write a Java program to add two numbers. Numbers are provided through command line.
package Assignment_10;
public class Program01{
    public static void main(String[] args) {
        int sum=Integer.parseInt(args[0])+Integer.parseInt(args[1]);
        System.out.println("Sum: "+sum);
    }
}