// 4.	Write a Java program to calculate LCM of two numbers. Numbers are pro-vided through command line.
package Assignment_10;
public class Program04 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]), b=Integer.parseInt(args[1]), L;
        for(L=2;L<=a*b;L++)
            if(L%a==0&&L%b==0)
                break;
        System.out.println("LCM of "+a+" & "+b+" is: "+L);
    }
}
