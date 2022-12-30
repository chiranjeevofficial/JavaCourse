// 5.	Write a Java program to check whether a given number is Prime number or not. Number is given through command line.
package Assignment_10;
public class Assignment10_05 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]), i;
        if(n<1)
            System.out.println("Enter +ve integer");
        else if(n==1)
            System.out.println("Smallest Prime Number is 2");
        else if(n==2)
            System.out.println("2 is a Prime Number");
        for(i=2;i<n;i++)
            if(n%i==0)
                break;
        System.out.println(i<n?n+" is not a Prime Number":n+" is a Prime Number");
    }
}
