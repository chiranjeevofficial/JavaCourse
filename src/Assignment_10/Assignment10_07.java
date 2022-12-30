// 7.	Write a Java program to calculate factorial of a number. Number is provid-ed through command line.
package Assignment_10;
public class Assignment10_07 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]), fact=1;
        while(n>=1){
            fact=fact*n;
            n--;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
