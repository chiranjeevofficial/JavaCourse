// 10.	Write a Java program to calculate HCF of two numbers. Numbers are pro-vided through command line.
package Assignment_10;
public class Assignment10_10 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]), b=Integer.parseInt(args[1]), i;
        for(i=a<b?a:b;i>=1;i--)
            if(a%i==0&&b%i==0)
                break;
        System.out.println("HCF of "+a+" & "+b+" is: "+i);
    }
}
